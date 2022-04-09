package compf.core.engine.pokemon.effects;

import java.io.Serializable;
import java.util.LinkedList;

import compf.core.engine.BattleAction;
import compf.core.etc.MyObject;

public abstract class BattleEffect extends MyObject implements Serializable {
	/**
		 *
		 */
	private static final long serialVersionUID = 1L;

	public void init(Object... inf) {
	}

	public void roundBeginning(Object... inf) {
	}

	public void pokemonSwitched(Object... inf) {
	}

	public void pokemonDefeated(Object inf) {
	}

	public void attack(Object... inf) {
	}

	public void defend(Object... inf) {
	}

	public void roundEnding(Object... inf) {
	}

	private boolean _isEnabled = true;
	protected BattleAction _action;

	public void disable() {
		_isEnabled = false;
	}

	public boolean isEnabled() {
		return _isEnabled;
	}
	public void addMessage(String msg) {
		_action.Messages.add(msg);
	}
	public BattleAction getBattleAction() {
		return _action;
	}
	public int getUID() {
		return this.getClass().getName().hashCode();
	}
	public BattleEffect() {
		_action=new BattleAction(getUID(),new LinkedList<>(),BattleAction.ActionKind.BattleEffect,null);
	}
}
