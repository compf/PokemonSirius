package compf.core.engine.pokemon.effects.stateConditions;

import compf.core.engine.pokemon.Pokemon;
import compf.core.engine.pokemon.effects.EffectParam;
import compf.core.engine.pokemon.effects.PokemonBattleEffect;
import compf.core.engine.pokemon.moves.DamageInformation;
import compf.core.etc.MyObject;
import compf.core.etc.services.SharedInformation;

public class ParalyzedStateCondition extends PokemonBattleEffect {

	@Override
	public void init() {
		getPokemon().changeStatStage(5, -1);

	}

	public ParalyzedStateCondition(Pokemon pkmn) {
		super(pkmn);
	}

	@Override
	public void attack(EffectParam param) {
		DamageInformation dmg = param.damageInf();
		if (isMeAttacking(param) && SharedInformation.Instance.getRNG().checkPerc(20,this.getClass())) {
			addMessage(dmg.getAttacker().toString() + " failed due to Paralysis");
			dmg.modifyDamage(0);
			disable();
		}

	}

	@Override
	public void pokemonSwitched(EffectParam param) {
		getPokemon().changeStatStage(Pokemon.SPEED, +1);

	}

	@Override
	public String toString() {
		return "PAR";
	}

}