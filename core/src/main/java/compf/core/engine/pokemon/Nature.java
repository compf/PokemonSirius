package compf.core.engine.pokemon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public enum Nature {
	ATT_ATT("Hardy",0, PokemonStat.ATT, PokemonStat.ATT),
	ATT_DEF("Lonely",1, PokemonStat.ATT, PokemonStat.DEF),
	ATT_SATT("Adamant",2, PokemonStat.ATT, PokemonStat.SATT),
	ATT_SDEF("Naughty",3, PokemonStat.ATT, PokemonStat.SDEF),
	ATT_SPEED("Brave",4, PokemonStat.ATT, PokemonStat.SPEED),

	DEF_ATT("Bold",5, PokemonStat.DEF, PokemonStat.ATT),
	DEF_DEF("Docile",6, PokemonStat.DEF, PokemonStat.DEF),
	DEF_SATT("Impish",7, PokemonStat.DEF, PokemonStat.SATT),
	DEF_SDEF("Lax",8, PokemonStat.DEF, PokemonStat.SDEF),
	DEF_SPEED("Relaxed",9, PokemonStat.DEF, PokemonStat.SPEED),

	SATT_ATT("Modest",10, PokemonStat.SATT, PokemonStat.ATT),
	SATT_DEF("Mild",11, PokemonStat.SATT, PokemonStat.DEF),
	SATT_SATT("Bashful",12, PokemonStat.SATT, PokemonStat.SATT),
	SATT_SDEF("Rash",13, PokemonStat.SATT, PokemonStat.SDEF),
	SATT_SPEED("Quiet",14, PokemonStat.SATT, PokemonStat.SPEED),

	SDEF_ATT("Calm",15, PokemonStat.SDEF, PokemonStat.ATT),
	SDEF_DEF("Gentle",16, PokemonStat.SDEF, PokemonStat.DEF),
	SDEF_SATT("Careful",17, PokemonStat.SDEF, PokemonStat.SATT),
	SDEF_SDEF("Quirky",18, PokemonStat.SDEF, PokemonStat.SDEF),
	SDEF_SPEED("Sassy",19, PokemonStat.SDEF, PokemonStat.SPEED),

	SPEED_ATT("Timid",20, PokemonStat.SPEED, PokemonStat.ATT),
	SPEED_DEF("Hasty",21, PokemonStat.SPEED, PokemonStat.DEF),
	SPEED_SATT("Jolly",22, PokemonStat.SPEED, PokemonStat.SATT),
	SPEED_SDEF("Naive",23, PokemonStat.SPEED, PokemonStat.SDEF),
	SPEED_SPEED("Serious",24, PokemonStat.SPEED, PokemonStat.SPEED),
	;

	final int _higherStat, _lowerStat, _index;
	final String _name;

	Nature(String name,int index, int h, int l) {

		_higherStat = h;
		_lowerStat = l;
		_index = index;
		this._name=name;
	}

	public int getRisingValue() {
		return _higherStat;
	}

	public int getLoweringValue() {
		return _lowerStat;
	}
	public static Iterable<Nature> getUniqueNatures(){
		List<Nature> natures=Arrays.asList(values());
		return natures;
	}

	public static Nature parse(String val){
		for(var n:values()){
			if(n._name.contentEquals(val)){
				return n;
			}
		}
		return null;
	}

}
