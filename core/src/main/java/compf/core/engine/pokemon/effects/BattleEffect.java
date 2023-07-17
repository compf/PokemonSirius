package compf.core.engine.pokemon.effects;

import java.io.Serial;
import java.io.Serializable;
import java.util.LinkedList;

import compf.core.engine.BattleAction;
import compf.core.etc.MyObject;

public abstract class BattleEffect extends MyObject implements Serializable {
	/**
		 *
		 */
	@Serial
    private static final long serialVersionUID = 1L;

	public void init() {
	}
	public void battleStarted(EffectParam param){

	}

	public void roundBeginning(EffectParam param) {
	}

	public void pokemonSwitched(EffectParam param) {
	}



	public void attack(EffectParam param) {
	}

	public void defend(EffectParam param) {
	}

	public void roundEnding(EffectParam param) {
	}

	private boolean _isEnabled = true;
	protected BattleAction _action;
	protected Object _additionalData=null;
	public void delayedAttack(EffectParam param) {

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

	public void pokemonDefeated(EffectParam param) {
	}
}
