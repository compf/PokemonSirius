package compf.core.engine.pokemon.effects.stateConditions;

import compf.core.engine.pokemon.Pokemon;
import compf.core.engine.pokemon.effects.EffectParam;
import compf.core.engine.pokemon.effects.PokemonBattleEffect;
import compf.core.engine.pokemon.moves.DamageInformation;

public class PoisonedStateCondition extends PokemonBattleEffect {

	public PoisonedStateCondition(Pokemon pkmn) {
		super(pkmn);
	}

	@Override
	public void roundEnding(EffectParam param) {
		dealIndirectDamage(param,param.additionalData().getAffectedPokemon(),param.additionalData().getAffectedPokemon(),0.875);
		addMessage(getPokemon().toString() + " lost a little bit HP due to poison");

	}

	@Override
	public String toString() {
		return "PSN";
	}

}
