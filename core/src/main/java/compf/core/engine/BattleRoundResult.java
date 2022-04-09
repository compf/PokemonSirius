package compf.core.engine;

import java.io.Serializable;
import java.util.LinkedList;

public class BattleRoundResult implements Serializable {
	public final LinkedList<BattleAction> Actions;
	public final BattleState State;
	public final NetworkMessageKind Kind;
	public BattleRoundResult(LinkedList<BattleAction> actions, BattleState state,NetworkMessageKind kind) {
		Actions = actions;
		State = state;
		Kind=kind;
	}
}
