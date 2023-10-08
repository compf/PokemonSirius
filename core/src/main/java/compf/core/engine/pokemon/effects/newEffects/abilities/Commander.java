


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

/*Commander */
/*If this Pokemon is a Tatsugiri and a Dondozo is an active ally, this Pokemon goes into the Dondozo's mouth. The Dondozo has its Attack, Special Attack, Speed, Defense, and Special Defense raised by 2 stages. During the effect, the Dondozo cannot be switched out, this Pokemon cannot select an action, and attacks targeted at this Pokemon will be avoided but it will still take indirect damage., if this Pokemon faints during the effect, a Pokemon can be switched in as a replacement but the Dondozo remains unable to be switched out., if the Dondozo faints during the effect, this Pokemon regains the ability to select an action. */
public class Commander extends PokemonBattleEffect{

public Commander(Pokemon pkmn){super(pkmn);}



public void code(EffectParam param){
    param.additionalData().getCausingPokemon().changeStatStage(PokemonStat.ATT, 2);
param.additionalData().getCausingPokemon().changeStatStage(PokemonStat.DEF, 2);
param.additionalData().getCausingPokemon().changeStatStage(PokemonStat.SATT, 2);
param.additionalData().getCausingPokemon().changeStatStage(PokemonStat.SDEF, 2);
param.additionalData().getCausingPokemon().changeStatStage(PokemonStat.SPEED, 2);
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
