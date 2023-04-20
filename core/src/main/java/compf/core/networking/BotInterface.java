package compf.core.networking;

import javax.xml.crypto.Data;

import compf.core.engine.BattleRoundResult;
import compf.core.engine.BattleState;
import compf.core.engine.NetworkMessage;
import compf.core.engine.NetworkMessageKind;
import compf.core.engine.Player;
import compf.core.engine.PlayerInput;
import compf.core.engine.Tuple;
import compf.core.etc.MyObject;

public class BotInterface extends SimpleIOInterface {
    private final Player _player;

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

    }

    public void battleEnded(int playerLost) {

    }

    public PlayerInput requestPlayerInput(short pkmnIndex) {
        short move = (short) MyObject.getRNG().randomNumber(0, this._player.getPokemon(pkmnIndex).getValidMovesCount(),BotInterface.class);
        return new PlayerInput.AttackInput(pkmnIndex, move, (short) 0, (short) 0, _player.getPlayerId());
    }

    public short switchPokemon(Tuple<Short, BattleState> inf) {
        return 0;
    }
}
