


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

/*Curse */
/*If the user is not a Ghost type, lowers the user's Speed by 1 stage and raises the user's Attack and Defense by 1 stage. If the user is a Ghost type, the user loses 1/2 of its maximum HP, rounded down and even if it would cause fainting, in exchange for the target losing 1/4 of its maximum HP, rounded down, at the end of each turn while it is active. If the target uses Baton Pass, the replacement will continue to be affected. Fails if there is no target or if the target is already affected. */
public class Curse extends PokemonBattleEffect{

public Curse(Pokemon pkmn){super(pkmn);}



public void code(EffectParam param){
    param.additionalData().getCausingPokemon().changeStatStage(PokemonStat.SPEED, -1);
param.additionalData().getCausingPokemon().changeStatStage(PokemonStat.ATT, 1);
param.additionalData().getCausingPokemon().changeStatStage(PokemonStat.DEF, 1);
param.additionalData().getCausingPokemon().changeStatStage(PokemonStat.SPEED, -1);
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
