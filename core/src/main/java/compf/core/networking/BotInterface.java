package compf.core.networking;

import compf.core.engine.BattleRoundResult;
import compf.core.engine.BattleState;
import compf.core.engine.NetworkMessage;
import compf.core.engine.NetworkMessageKind;
import compf.core.engine.Player;
import compf.core.engine.PlayerInput;
import compf.core.engine.Tuple;

public class BotInterface extends SimpleIOInterface {
    private final Player _player;
    private   BattleState _state;

    public BotInterface(Player player) {
        this._player = player;
    }


    @Override
    public NetworkMessage handle(NetworkMessage msg) {
        switch (msg.Kind) {
            case RequestInput:
                return NetworkMessageKind.ReplyInput.createMessage(requestPlayerInput(((short) msg.Data)));
            case SwitchPokemon:
                return NetworkMessageKind.ReplyInput
                        .createMessage(switchPokemon(((Tuple<Short, BattleState>) msg.Data)));
            case Update:
                update((BattleRoundResult) msg.Data);
                return null;
            case BattleEnded:
                battleEnded((int) msg.Data);
            default:
                return null;

        }
    }

    public void update(BattleRoundResult state) {
    _state=state.State;
    }

    public void battleEnded(int playerLost) {

    }
    private short selectEnemyPlayerId(){
        for(int pId :_state.getPlayerIds()){
            if(pId!=_player.getPlayerId() )return (short)pId;
        }
        return  -1;
    }
    private short selectEnemyPokemonId(short playerId){
        return 0;
    }

    public PlayerInput requestPlayerInput(short pkmnIndex) {
        short enemyPlayerId=selectEnemyPlayerId();
        short move = (short) compf.core.etc.services.SharedInformation.Instance.getRNG().randomNumber(0, this._player.getPokemon(pkmnIndex).getValidMovesCount(),BotInterface.class);
        return new PlayerInput.AttackInput(pkmnIndex, move, enemyPlayerId, selectEnemyPokemonId(enemyPlayerId), _player.getPlayerId());
    }

    public short switchPokemon(Tuple<Short, BattleState> inf) {
        for(short i=0;i<_player.getPokemonCount();i++){
            if(_player.getPokemon(i).getCurrHP()>0)return i;
        }
        return -1;
    }
}
