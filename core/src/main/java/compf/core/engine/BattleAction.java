package compf.core.engine;

import java.io.Serializable;
import java.util.LinkedList;

public class BattleAction implements Serializable {
	public enum ActionKind {
		Move, Ability, SwitchPokemon, Other, BattleEffect
	}

	private static final long serialVersionUID = -1557747125081633438L;
	public final LinkedList<String> Messages;
	public final int ActionId;
	public final ActionKind Kind;
	public final Object Data;

	/**
	 * @param message  A text message to describe the action
	 * @param actionId A id that represent the action
	 * @param kind     The type of the action (eg Move or ability)
	 */
	public BattleAction(int actionId, String message, ActionKind kind, Object data) {
		Messages = new LinkedList<>();
		Messages.add(message);
		ActionId = actionId;
		Kind = kind;
		Data = data;
	}

	public BattleAction(int actionId, LinkedList<String> messages, ActionKind kind, Object data) {
		Messages = messages;
		ActionId = actionId;
		Kind = kind;
		Data = data;
	}

}
