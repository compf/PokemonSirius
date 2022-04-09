package compf.core.engine.pokemon.effects;

import compf.core.engine.pokemon.Pokemon;
import compf.core.engine.pokemon.moves.DamageInformation;
import compf.core.etc.MyObject;

public class ParalyzedStateCondition extends PokemonBattleEffect {

	@Override
	public void init(Object... obj) {
		getPokemon().changeStatStage(5, -1);

	}
	public ParalyzedStateCondition(Pokemon pkmn){
		super(pkmn);
	}
	@Override
	public void attack(Object... obj) {
		DamageInformation dmg=(DamageInformation)obj[0];
		if (MyObject.checkPerc(20)) {
			addMessage(dmg.getAttacker().toString() +" failed due to Paralysis");
				dmg.modifyDamage(0);
				disable();
		}

	}


	@Override
	public void pokemonSwitched(Object... obj) {
		getPokemon().changeStatStage(Pokemon.SPEED, +1);

	}
	@Override
	public String toString() {
		return "PAR";
	}

}
