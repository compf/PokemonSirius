package compf.core.networking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import compf.core.engine.*;
import compf.core.engine.pokemon.Pokemon;
import compf.core.engine.pokemon.effects.PokemonBattleEffect;
import compf.core.etc.BufferList;
import compf.core.etc.MyObject;

public class BattleServer extends BaseServer {

    private short _globalPlayerId = 0;
    private short _globalGameId = 0;
    private HashMap<Short, Pipe> _pipes = new HashMap<>();
    private HashMap<Short, Thread> _threads = new HashMap<>();
    private HashMap<Short, Boolean> _isPlaying = new HashMap<>();
    private HashMap<Short, BattleRule> _rules = new HashMap<>();
    private HashMap<Short, PokemonBattle> _battles = new HashMap<>();
    private HashMap<Short, Player> _players = new HashMap<>();
    private ArrayList<Short> _playerIds = new ArrayList<>();
    private HashMap<Short, List<Short>> _gamePlayers = new HashMap<>();

    public BattleServer() {
    }

    public void waitForConnection(Pipe pipe) {

        log("Server wait for connection");
        Pipe socket = pipe.waitForConnection();
        log("Server connected");

        short playerId = _globalPlayerId++;

        _pipes.put(playerId, pipe);
        _playerIds.add(playerId);
        log("Server is running " + playerId);
        log("Server sending player id " + playerId);
        writeObject(_pipes.get(playerId), new NetworkMessage(NetworkMessageKind.SendPlayerId, playerId));
        NetworkMessage msg = readObject(pipe);
        if (msg.Kind == NetworkMessageKind.BattleRules) {
            _rules.put(playerId, (BattleRule) msg.Data);
            processBattleRule(playerId);
        }


    }

    public class Interrupt {
        /**
         * Forces the client to switch the pokemon
         *
         * @param playerId     The player that must switch the pokemon
         * @param pokemonIndex The index of the Pokemon to be switched
         * @return The index of the replaced pokemon in the team or -1 on errors
         */
        public short forceSwitch(short playerId, short pokemonIndex) {
            writeObject(_pipes.get(playerId), NetworkMessageKind.RequestPokemonSwitch.createMessage(pokemonIndex));
            NetworkMessage msg = readObject(_pipes.get(playerId));
            if (msg.Kind == NetworkMessageKind.ReplyPokemonSwitch) {
                return (short) msg.Data;
            }
            return -1;
        }
    }

    private void processBattleRule(short playerId) {
        var possibleGames = _rules.entrySet().stream().filter((ent) -> !_isPlaying.getOrDefault(ent.getKey(), false))
                .collect(Collectors.groupingBy((entry) -> entry.getValue())).entrySet().stream()
                .filter((entry) -> entry.getValue().size() >= entry.getKey().NumberPlayers).toArray();

        for (var rulePlayerListObj : possibleGames) {
            var rulePlayerList = (HashMap.Entry<BattleRule, List<HashMap.Entry<Short, BattleRule>>>) rulePlayerListObj;
            var rule = (BattleRule) rulePlayerList.getKey();
            var ids = rulePlayerList.getValue().stream().map((entry) -> entry.getKey()).toArray();
            PokemonBattle battle = new PokemonBattle(rule);
            short gameId = _globalGameId++;
            _gamePlayers.put(gameId, new LinkedList<>());
            Thread thread = new Thread(() -> this.run(gameId));
            _threads.put(gameId, thread);
            thread.setName("Server " + gameId);
            for (Object idObj : ids) {
                Short id = (Short) idObj;
                _gamePlayers.get(gameId).add(id);
                _battles.putIfAbsent((Short) idObj, battle);
                _isPlaying.put(id, Boolean.TRUE);
                writeObject(_pipes.get(idObj),
                        new NetworkMessage(NetworkMessageKind.RequestPlayerInformation, null));
            }
            thread.start();
        }
    }
    private void sendPlayerRequestInputs(short gameId,BattleRule rule){
        var playerIds = _gamePlayers.get(gameId);
        for(var playerId:playerIds){
            for(short pkmId=0;pkmId<rule.PokemonPerPlayerOnField;pkmId++){
                if(canPlayerAttack(playerId,pkmId)){
                    var inp_msg = NetworkMessageKind.RequestInput.createMessage(pkmId);
                    writeObject(_pipes.get(playerId), inp_msg);
                }           
            }
           
        }
    }
    private void informPlayerOfUpdate(short gameId,BattleRoundResult state){
        var playerIds = _gamePlayers.get(gameId);
        for(var id:playerIds){
                var inp_msg = NetworkMessageKind.Update.createMessage(state);
                writeObject(_pipes.get(id), inp_msg);  
        }
    }
    private boolean canPlayerAttack(short playerId,short pkmnId){
        Pokemon pkmn=_players.get(playerId).getPokemon(pkmnId); 
        boolean flag=pkmn.getCurrHP()>0 && pkmn.getEffects().stream().allMatch((e)->((PokemonBattleEffect)e).canReceiveCommand());
        System.out.println("can player attack "+playerId+" "+pkmnId +" "+flag);

        return flag;
    }
    private int getNumberEnabledActors(short gameId){
        var playerIds = _gamePlayers.get(gameId);
        BattleRule  rule=_rules.get(gameId);
        int result=0;
        for(var playerId:playerIds){
            for(short pkmId=0;pkmId<rule.PokemonPerPlayerOnField;pkmId++){
                if(canPlayerAttack(playerId,pkmId)){
                    result++;
                }           
            }
           
        }
        System.out.println("no needed actors "+result);
        return result;
    }
    public void run(short gameId) {
        while (true) {
            var playerIds = _gamePlayers.get(gameId);
            for (short playerId : playerIds) {
                var input = _pipes.get(playerId);
                if(input.isWaitingForData()){
                    var outp = _pipes.get(playerId);
                    writeObject(outp, NetworkMessageKind.RequestInput.createMessage());
                }
                if(!input.avaliable())continue;
                NetworkMessage msg = readObject(input);
                log("Server reveived " + msg.Kind + " from " + playerId);
                ;
                MyObject.nop();
                switch (msg.Kind) {

                    case ReplyPlayerInformation: {

                        var pl = (Player) msg.Data;
                        BattleRule rule=_rules.get(gameId);
                        _players.put(playerId, pl);
                        var battle = _battles.get(playerId);
                        battle.getPlayers().add(pl);

                        log("Size " + battle.getPlayers().size());
                        if (battle.getPlayers().isFull()) {
                            log("full " + playerId);
                            informPlayerOfUpdate(gameId, new BattleRoundResult(null, new DetailedBattleState(battle.getPlayers()), null));
                            sendPlayerRequestInputs(gameId, rule);
                           
                        }
                    }
                    break;
                    case ReplyInput: {
                        Interrupt interrupt = new Interrupt();
                        BufferList<PlayerInput> inputs = (BufferList<PlayerInput>) msg.Data;
                        for (var inp : inputs) {
                           log("input received from " + inp.PlayerId);
                            var battle = _battles.get(inp.PlayerId);
                            battle.addInput(inp);
                            var rule = _rules.get(inp.PlayerId);
                            System.out.println("check enough sub");
                            // TODO what if pokemon field is vacant?
                            if (battle.allPlayerGaveInput(getNumberEnabledActors(gameId))) {
                                battle.incrementRound();
                                var state = battle.executeSchedule(interrupt);
                                log("All submitted "+battle.getRound());
                                informPlayerOfUpdate(gameId, state);
                                sendPlayerRequestInputs(gameId, rule);



                            }
                        }
                    }


                }
            }
        }
    }
}
