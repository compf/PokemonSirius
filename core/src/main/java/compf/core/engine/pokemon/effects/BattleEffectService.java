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

public interface BattleEffectService  {



	public void init(EffectParam param);

	public void roundBeginning(EffectParam param);

	public void pokemonSwitchedOut(EffectParam param);

	public void pokemonSwitchedIn(EffectParam param) ;

	public void attack(EffectParam param) ;

	public void defend(EffectParam param) ;

	public void roundEnding(EffectParam param) ;

	public void delayedAttack(EffectParam param);




	public void pokemonDefeated(EffectParam param);
	public void statsModified(EffectParam param) ;
	public void initOrSwitchedIn(EffectParam param) ;
	public void modifyBasePower(EffectParam param,Box<Double> basePower);

	public void battleEffectAdded(EffectParam param) ;





}
