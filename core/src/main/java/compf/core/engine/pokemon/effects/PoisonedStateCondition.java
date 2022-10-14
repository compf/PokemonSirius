package compf.core.engine.pokemon.effects;

import compf.core.engine.pokemon.Pokemon;
import compf.core.engine.pokemon.moves.DamageInformation;

public class PoisonedStateCondition extends PokemonBattleEffect {

	public PoisonedStateCondition(Pokemon pkmn) {
		super(pkmn);
	}

	@Override
	public void roundEnding(Object... obj) {
		DamageInformation inf = (DamageInformation) obj[0];
		getPokemon().modifyCurrHp(0.875);
		addMessage(getPokemon().toString() + " lost a little bit HP due to poison");

	}

	@Override
	public String toString() {
		return "PSN";
	}

}
