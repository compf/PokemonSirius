package compf.core.engine.pokemon;

public enum Nature {
	Hardy(0, PokemonStat.ATT, PokemonStat.ATT),
	Lonely(1, PokemonStat.ATT, PokemonStat.DEF),
	Adamant(2, PokemonStat.ATT, PokemonStat.SATT),
	Naughty(3, PokemonStat.ATT, PokemonStat.SDEF),
	Brave(4, PokemonStat.ATT, PokemonStat.SPEED),

	Bold(5, PokemonStat.DEF, PokemonStat.ATT),
	Docile(6, PokemonStat.DEF, PokemonStat.DEF),
	Impish(7, PokemonStat.DEF, PokemonStat.SATT),
	Lax(8, PokemonStat.DEF, PokemonStat.SDEF),
	Relaxed(9, PokemonStat.DEF, PokemonStat.SPEED),

	Modest(10, PokemonStat.SATT, PokemonStat.ATT),
	Mild(11, PokemonStat.SATT, PokemonStat.DEF),
	Bashful(12, PokemonStat.SATT, PokemonStat.SATT),
	Rash(13, PokemonStat.SATT, PokemonStat.SDEF),
	Quiet(14, PokemonStat.SATT, PokemonStat.SPEED),

	Calm(15, PokemonStat.SDEF, PokemonStat.ATT),
	Gentle(16, PokemonStat.SDEF, PokemonStat.DEF),
	Careful(17, PokemonStat.SDEF, PokemonStat.SATT),
	Quirky(18, PokemonStat.SDEF, PokemonStat.SDEF),
	Sassy(19, PokemonStat.SDEF, PokemonStat.SPEED),

	Timid(20, PokemonStat.SPEED, PokemonStat.ATT),
	Hasty(21, PokemonStat.SPEED, PokemonStat.DEF),
	Jolly(22, PokemonStat.SPEED, PokemonStat.SATT),
	Naive(23, PokemonStat.SPEED, PokemonStat.SDEF),
	Serious(24, PokemonStat.SPEED, PokemonStat.SPEED),
	;

	final int _higherStat, _lowerStat, _index;

	Nature(int index, int h, int l) {

		_higherStat = h;
		_lowerStat = l;
		_index = index;
	}

	public int getRisingValue() {
		return _higherStat;
	}

	public int getLoweringValue() {
		return _lowerStat;
	}

	public static Nature find(int val) {
		return values()[val];
	}

}
