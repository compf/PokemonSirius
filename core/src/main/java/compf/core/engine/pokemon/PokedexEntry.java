package compf.core.engine.pokemon;

import java.io.Serializable;

public class PokedexEntry implements Serializable, PokemonStat,PokemonTypeHolder {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected int _nr;
	protected String _name;
	protected int[] _baseStats = new int[6];
	protected Type _type1, _type2;
	protected float _weight, _height;

	protected PokedexEntry() {

	}

	public PokedexEntry(int nr, String name, Type type1, Type type2, float height, float weight, int hp, int att,
			int def, int satt, int sdef, int speed) {
		_nr = nr;
		_name = name;
		_type1 = type1;
		_type2 = type2;
		_height = height;
		_weight = weight;
		_baseStats[HP] = hp;
		_baseStats[ATT] = att;
		_baseStats[DEF] = def;
		_baseStats[SATT] = satt;
		_baseStats[SDEF] = sdef;
		_baseStats[SPEED] = speed;

	}

	public int[] getBaseStats() {
		return _baseStats;
	}

	public Type getType1() {
		return _type1;
	}

	public String getName() {

		return _name;
	}

	public boolean isType(Type t) {
		return t == _type1 || t == _type2;
	}

	public Type getType2() {
		return _type2;
	}

	public int getNr() {
		return _nr;
	}

}
