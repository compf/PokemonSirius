package compf.core.engine.pokemon.effects;

import java.io.Serial;
import java.io.Serializable;
import java.util.LinkedList;

import compf.core.engine.BattleAction;
import compf.core.engine.pokemon.Pokemon;
import compf.core.engine.pokemon.PokemonStat;
import compf.core.engine.pokemon.moves.DamageInformation;
import compf.core.etc.Box;
import compf.core.etc.MyObject;

public abstract class BattleEffect extends MyObject implements Serializable,BattleEffectService {
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
		if (_action == null) {
			_action = new BattleAction(getUID(), _messages, BattleAction.ActionKind.BattleEffect, _additionalData);
		}
		return _action;
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
	public void initOrSwitchedIn(EffectParam param) {
	}
	public void modifyBasePower(EffectParam param,Box<Double> basePower){
		
	}
	public void battleEffectAdded(EffectParam param) {}
	protected void modifyStats(EffectParam param, Pokemon affected, Pokemon causing, int stat, int by){
		param.effectCollection().statsModified(new EffectParam(param.schedule(),param.interrupt(),param.rule(),param.effectCollection(),new EffectParam.AdditionalStatsModifyingData(causing,affected,stat,by)));
		affected.changeStatStage(stat,by);
		addMessage(PokemonStat.getName(stat)+ " of "+affected.toString() +" is "+((by>=0)?"increased":"decreased") );


	}
	protected  void dealIndirectDamage(EffectParam param,Pokemon affected, Pokemon causing,double factor){
		param.effectCollection().indirectDamageReceived(new EffectParam(param.schedule(),param.interrupt(),param.rule(),param.effectCollection(),new EffectParam.AdditionalIndirectDamageData(causing,affected,factor)));
		int prevHP=affected.getCurrHP();
		affected.modifyCurrHp(factor);
		addMessage(affected.toString()+" lost HP" );
		getBattleAction();
		this._action.Data=prevHP +" "+ affected.getCurrHP();


	}
	public void indirectDamageReceived(EffectParam param){}




}
