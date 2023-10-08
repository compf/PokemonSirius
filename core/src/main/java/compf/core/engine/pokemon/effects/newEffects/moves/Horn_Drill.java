


package compf.core.engine.pokemon.effects.newEffects.moves;

import compf.core.engine.BattleAction;
import compf.core.engine.pokemon.PokemonStat;
import compf.core.engine.pokemon.Pokemon;
import compf.core.engine.pokemon.effects.EffectParam;
import compf.core.engine.pokemon.effects.PokemonBattleEffect;
import compf.core.engine.pokemon.moves.DamageInformation;
import compf.core.engine.pokemon.moves.Schedule;
import compf.core.engine.pokemon.moves.Schedule.ScheduleItem;
import compf.core.etc.services.SharedInformation;

/*Horn Drill */
/*Deals damage to the target equal to the target's maximum HP. Ignores accuracy and evasiveness modifiers. This attack's accuracy is equal to (user's level - target's level + 30)%, and fails if the target is at a higher level. Pokemon with the Sturdy Ability are immune. */
public class Horn_Drill extends PokemonBattleEffect{

public Horn_Drill(Pokemon pkmn){super(pkmn);}



public void code(EffectParam param){
    //%code
}


























public void init(EffectParam param){

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

	public void delayedAttack(EffectParam param) {

	}







	public void pokemonDefeated(EffectParam param) {
	}
	public void statsModified(EffectParam param) {
	}
	public void initOrSwitchedIn(EffectParam param) {
	}
}
