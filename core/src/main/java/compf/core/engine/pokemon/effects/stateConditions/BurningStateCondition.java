package compf.core.engine.pokemon.effects.stateConditions;

import compf.core.engine.pokemon.Pokemon;
import compf.core.engine.pokemon.PokemonStat;
import compf.core.engine.pokemon.effects.EffectParam;
import compf.core.engine.pokemon.effects.PokemonBattleEffect;
import compf.core.engine.pokemon.effects.stateConditions.StateConditionsMarkers.NonVolatileStatusMarker;

public class BurningStateCondition extends PokemonBattleEffect implements NonVolatileStatusMarker {

	@Override
	public void init(EffectParam param) {
		getPokemon().changeStatStage(PokemonStat.ATT, -1);

	}

	public BurningStateCondition(Pokemon pkmn) {
		super(pkmn);
	}

	@Override
	public void roundEnding(EffectParam param) {
		int hpBefore=getPokemon().getCurrHP();
		getPokemon().modifyCurrHp(0.875);
		int hpAfter=getPokemon().getCurrHP();
		addMessage(getPokemon().toString() + " lost a little bit HP due to burn");
		_additionalData=hpBefore+" "+hpAfter;

	}



	@Override
	public String toString() {
		return "BRN";
	}

}
