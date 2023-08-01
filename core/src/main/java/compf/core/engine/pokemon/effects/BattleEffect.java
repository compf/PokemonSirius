package compf.core.engine.pokemon.effects;

import java.io.Serial;
import java.io.Serializable;
import java.util.LinkedList;

import compf.core.engine.BattleAction;
import compf.core.engine.pokemon.Pokemon;
import compf.core.engine.pokemon.PokemonStat;
import compf.core.engine.pokemon.moves.DamageInformation;
import compf.core.etc.MyObject;

public abstract class BattleEffect extends MyObject implements Serializable {
	/**
		 *
		 */
	@Serial
    private static final long serialVersionUID = 1L;


	public void init(EffectParam param){

	}

	@Override
	public boolean equals(Object obj) {
		return obj!=null && this.getClass()==obj.getClass();
	}

	public void roundBeginning(EffectParam param) {
	}

	public void pokemonSwitchedOut(EffectParam param) {
	}

	public void pokemonSwitchedIn(EffectParam param) {
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
	public void statsModified(EffectParam param) {
	}

	protected void modifyStats(EffectParam param, Pokemon affected, Pokemon causing, int stat, int by){
		param.eventExecutor().executeEffects(EffectTime.STATS_MODIFIED,new EffectParam(param.schedule(),param.interrupt(),param.rule(),param.eventExecutor(),new EffectParam.AdditionalStatsModifyingData(causing,affected,stat,by)));
		affected.changeStatStage(stat,by);
		addMessage(PokemonStat.getName(stat)+ " of "+affected.toString() +" is "+((by>=0)?"increased":"decreased") );


	}
	protected  void dealIndirectDamage(EffectParam param,Pokemon affected, Pokemon causing,double factor){
		param.eventExecutor().executeEffects(EffectTime.INDIRECT_DAMAGE,new EffectParam(param.schedule(),param.interrupt(),param.rule(),param.eventExecutor(),new EffectParam.AdditionalIndirectDamageData(causing,affected,factor)));

		affected.modifyCurrHp(factor);
		addMessage(affected.toString()+" lost HP" );

	}



}
