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
	protected Object _additionalData=null;
	public void delayedAttack(Object... inf) {

	}

	public void disable() {
		_isEnabled = false;
	}

	public boolean isEnabled() {
		return _isEnabled;
	}
	private LinkedList<String> _messages=new LinkedList<>();
	public void addMessage(String msg) {
		_messages.add(msg);
	}

	public BattleAction getBattleAction() {
		final BattleAction action= new BattleAction(getUID(), _messages, BattleAction.ActionKind.BattleEffect, _additionalData);
		_messages=new LinkedList<>();
		return action;
	}

	public int getUID() {
		return this.getClass().getName().hashCode();
	}

	public BattleEffect() {
	}
}
