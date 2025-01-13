package compf.core.networking;

import java.util.ArrayList;
import java.util.function.BiPredicate;

import compf.core.engine.*;

public interface IOInterface {
	public void message(String msg);

	public void update(BattleRoundResult state);

	public PlayerInput requestPlayerInput(Tuple<Short, BattleState> inf);

	public void battleEnded(int playerId);

	short switchPokemon(Tuple<Short, BattleState> inf);
	Pipe getPipe();
	default NetworkMessage handle(NetworkMessage msg){
		switch (msg.Kind) {
			case RequestInputToIO:
				return NetworkMessageKind.ReplyInputFromIO.createMessage(requestPlayerInput(((Tuple<Short,BattleState>) msg.Data)));
			case SwitchPokemon:
				return NetworkMessageKind.ReplyInputFromIO
						.createMessage(switchPokemon(((Tuple<Short, BattleState>) msg.Data)));
			case Update:
				update( (BattleRoundResult)(msg.Data));
				return null;
			case BattleEnded:
				battleEnded((int) msg.Data);
			default:
				return msg;

		}
	}
	default NetworkMessage sendAndHandle(NetworkMessage msg){
		getPipe().write(msg);
		return handle(getPipe().read());
	}

	
}
