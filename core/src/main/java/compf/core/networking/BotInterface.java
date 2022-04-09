package compf.core.networking;

import compf.core.engine.BattleRoundResult;
import compf.core.engine.BattleState;
import compf.core.engine.Player;
import compf.core.engine.PlayerInput;
import compf.core.etc.MyObject;

public class BotInterface implements IOInterface {
    private final Player player;

    public BotInterface(Player player){
       this.player=player;
    }
    @Override
    public void message(String msg) {

    }

    @Override
    public void update(BattleRoundResult state) {

    }

    @Override
    public void setLock(boolean val) {

    }

    @Override
    public PlayerInput requestPlayerInput(short pkmnIndex, BattleState state) {
        return new PlayerInput.AttackInput(pkmnIndex, (short)MyObject.randomNumber(0,4),(short)0,(short)0,player.getPlayerId());
    }

    @Override
    public short switchPokemon(BattleState state, short oldIndex) {
        return 0;
    }
}
