package compf.core.engine.pokemon.moves;

import compf.core.etc.MyObject;

public class SwapPokemonMove extends Move {
	private boolean _isRandom;

	public SwapPokemonMove(Move copy, boolean isRandom) {
		super(copy);
		_isRandom = isRandom;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void finishedMove(DamageInformation dmg) {
		int nr = MyObject.indexOf(dmg.getDefender().getPlayer().getTeam(), dmg.getDefender());
		throw new UnsupportedOperationException("Not implemented");
		// dmg.getDefender().getPlayer().chooseNextPokemon(nr);
	}

}
