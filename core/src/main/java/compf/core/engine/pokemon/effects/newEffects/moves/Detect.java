


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

/*Detect */
/*The user is protected from most attacks made by other Pokemon during this turn. This move has a 1/X chance of being successful, where X starts at 1 and triples each time this move is successfully used. X resets to 1 if this move fails, if the user's last move used is not Baneful Bunker, Detect, Endure, King's Shield, Max Guard, Obstruct, Protect, Quick Guard, Silk Trap, Spiky Shield, or Wide Guard, or if it was 1 of those moves and the user's protection was broken. Fails if the user moves last this turn. */
public class Detect extends PokemonBattleEffect{

public Detect(Pokemon pkmn){super(pkmn);}



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
