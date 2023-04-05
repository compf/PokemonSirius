package compf.core.networking;

import compf.core.engine.BattleRoundResult;
import compf.core.engine.BattleState;
import compf.core.engine.Player;
import compf.core.engine.PlayerInput;
import compf.core.etc.MyObject;

public class BotInterface implements IOInterface {
    private final Player player;

    public BotInterface(Player player) {
        this.player = player;
    }

    @Override
    public void message(String msg) {

    }

    @Override
    public void update(BattleRoundResult state) {

    }

    public void battleEnded( int playerLost) {

    }

    @Override
    public PlayerInput requestPlayerInput(short pkmnIndex, BattleState state) {
        short move = (short) MyObject.randomNumber(0, this.player.getPokemon(pkmnIndex).getValidMovesCount());
        return new PlayerInput.AttackInput(pkmnIndex, move, (short) 0, (short) 0, player.getPlayerId());
    }

    @Override
    public short switchPokemon(BattleState state, short oldIndex) {
        return 0;
    }
}
