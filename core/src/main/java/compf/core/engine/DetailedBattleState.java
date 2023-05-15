package compf.core.engine;

import compf.core.engine.pokemon.PokemonStat;
import compf.core.etc.BufferList;

import java.io.Serial;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class DetailedBattleState implements BattleState {
    /**
     * First version
     */
    @Serial
    private static final long serialVersionUID = 1L;
    private List<Player> _players;
    public Player[] getAllPlayers(){
        Player[] players=new Player[_players.size()];
        return _players.toArray(players);
    }
    public DetailedBattleState(List<Player> bufferList) {
        _players = bufferList;
    }

    @Override
    public int getCurrHp(int playerId, int pkmnIndex) {
        Player p = findById(playerId);
        if (p != null) {
            var pkmn = p.getPokemon(pkmnIndex);
            if (pkmn != null)
                return pkmn.getCurrHP();
        }
        return 0;
    }

    private Player findById(int playerId) {
        for (var p : _players) {
            if (p.getPlayerId() == playerId)
                return p;
        }
        return null;
    }

    @Override
    public int getMaxHP(int playerId, int pkmnIndex) {
        Player p = findById(playerId);
        if (p != null) {
            return p.getPokemon(pkmnIndex).getStat(PokemonStat.HP);
        }
        return -1;
    }

    @Override
    public String getPokemonName(int playerId, int pkmnIndex) {
        Player p = findById(playerId);
        if (p != null) {
            return p.getPokemon(pkmnIndex).getName();
        }
        return null;
    }

    @Override
    public String getStateConditionString(int playerId, int pkmnIndex) {
        // TODO
        Player p = findById(playerId);
        if (p != null) {
            return "";
        }
        return "";
    }

    @Override
    public Iterable<Short> getPlayerIds() {
        return _players.stream().map(Player::getPlayerId).collect(Collectors.toList());
    }

    @Override
    public String getPlayerName(int playerId) {
        Player p = findById(playerId);
        if (p != null)
            return p.getName();
        return null;
    }

    @Override
    public Optional<Integer> getDefeatedPlayer() {
        for (int id : getPlayerIds()) {
            boolean playerFinished = true;
            final int TeamSize=6;
            for (int i = 0; i < TeamSize; i++) {
                int hp = getCurrHp(id, i);
                playerFinished = playerFinished && hp == 0;

            }
            if(playerFinished){
                return Optional.of(id);
            }
        }
        return Optional.empty();
    }

}
