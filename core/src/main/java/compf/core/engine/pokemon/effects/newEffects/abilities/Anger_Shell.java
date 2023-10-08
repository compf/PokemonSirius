


package compf.core.engine.pokemon.effects.newEffects.abilities;

import compf.core.engine.BattleAction;
import compf.core.engine.pokemon.PokemonStat;
import compf.core.engine.pokemon.Pokemon;
import compf.core.engine.pokemon.effects.EffectParam;
import compf.core.engine.pokemon.effects.PokemonBattleEffect;
import compf.core.engine.pokemon.moves.DamageInformation;
import compf.core.engine.pokemon.moves.Schedule;
import compf.core.engine.pokemon.moves.Schedule.ScheduleItem;
import compf.core.etc.services.SharedInformation;

/*Anger Shell */
/*if this Pokemon has more than 1/2 its maximum HP and takes damage from an attack bringing it to 1/2 or less of its maximum HP, its Attack, Special Attack, and Speed are raised by 1 stage, and its Defense and Special Defense are lowered by 1 stage. This effect applies after all hits from a multi-hit move. This effect is prevented, if the move had a secondary effect removed by the Sheer Force Ability. */
public class Anger_Shell extends PokemonBattleEffect{

public Anger_Shell(Pokemon pkmn){super(pkmn);}



public void code(EffectParam param){
    param.additionalData().getCausingPokemon().changeStatStage(PokemonStat.ATT, 1);
param.additionalData().getCausingPokemon().changeStatStage(PokemonStat.SATT, 1);
param.additionalData().getCausingPokemon().changeStatStage(PokemonStat.SPEED, 1);
param.additionalData().getCausingPokemon().changeStatStage(PokemonStat.ATT, 1);
param.additionalData().getCausingPokemon().changeStatStage(PokemonStat.DEF, -1);
param.additionalData().getCausingPokemon().changeStatStage(PokemonStat.SATT, 1);
param.additionalData().getCausingPokemon().changeStatStage(PokemonStat.SDEF, -1);
param.additionalData().getCausingPokemon().changeStatStage(PokemonStat.SPEED, 1);
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
