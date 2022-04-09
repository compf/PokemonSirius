package compf.core.engine.pokemon.moves;

import compf.core.engine.pokemon.PokemonStat;
import compf.core.engine.pokemon.effects.*;
import compf.core.engine.pokemon.effects.PoisonedStateCondition;

// TODO Critical hit  quote for moves like Karateschlag is higher
// TODO missing moves: 13
public class MoveFactory {
	public Move create(Move mv) {
		switch (mv.getNr()) {
			case 3: // Duplexhieb
			case 5: // Kometenhieb
				return new MultipleAttacksMove(mv, 2, 5);
			case 6: // Feuerschlag
				return new PokemonEffectMove(mv, null,BurnedStateCondition.class, 10);
			case 7: // Eishieb
				return new PokemonEffectMove(mv,null, FrozenStateCondition.class, 10);
			case 8: // Donnerschlag
				return new PokemonEffectMove(mv, null,ParalyzedStateCondition.class, 10);
			case 12:
				return new OHKO_Move(mv);
			case 14:
			return new  StatModifyingMove(mv, StatModifyingMove.ME, PokemonStat.ATT, +2);
			case 18:
				//Wirbelwind
				return new SwapPokemonMove(mv,true);
			case 20: // Klammergriff
				return new MultipleAttacksMove(mv, 3, 8);
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			case 34:
				return new PokemonEffectMove(mv, FlyingEffect.class,null,100);
			default:
				return mv;
		}
	}
}
