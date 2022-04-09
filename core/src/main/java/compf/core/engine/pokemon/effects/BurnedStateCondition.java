package compf.core.engine.pokemon.effects;

import compf.core.engine.pokemon.PokedexEntry;
import compf.core.engine.pokemon.Pokemon;
import compf.core.engine.pokemon.PokemonStat;
import compf.core.engine.pokemon.moves.DamageInformation;

public class BurnedStateCondition extends PokemonBattleEffect {

	@Override
	public void init(Object... inf) {
		getPokemon().changeStatStage(PokemonStat.ATT,-1);

	}
	public BurnedStateCondition(Pokemon pkmn){
		super(pkmn);
	}
	@Override
	public void roundEnding(Object... inf) {
		var dmgInf=(DamageInformation)inf[0];
		
		getPokemon().modifyCurrHp( 0.875);
		addMessage(getPokemon().toString()+ " lost a little bit HP due to burn");
		
	}

	@Override
	public void pokemonSwitched(Object... inf) {
		getPokemon().changeStatStage(PokemonStat.ATT, +1);
	}
	@Override 
	public String toString() {
		return "BRN";
	}

}
