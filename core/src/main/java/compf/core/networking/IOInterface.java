package compf.core.networking;

import java.util.ArrayList;
import java.util.function.BiPredicate;

import compf.core.engine.BattleRoundResult;
import compf.core.engine.BattleState;
import compf.core.engine.PlayerInput;

public interface IOInterface {
	public void message(String msg);

	public void update(BattleRoundResult state);

	public PlayerInput requestPlayerInput(short pkmnIndex, BattleState state);

	public void battleEnded(int playerId);

	short switchPokemon(BattleState state, short oldIndex);

	
}
