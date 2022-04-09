package compf.core.engine.pokemon;

public enum Nature {

	N1(0,PokemonStat.ATT,PokemonStat.ATT),
	N2(1,PokemonStat.ATT,PokemonStat.DEF),
	N3(2,PokemonStat.ATT,PokemonStat.SATT),
	N4(3,PokemonStat.ATT,PokemonStat.SDEF),
	N5(4,PokemonStat.ATT,PokemonStat.SPEED),
	
	N6(5,PokemonStat.DEF,PokemonStat.ATT),
	N7(6,PokemonStat.DEF,PokemonStat.DEF),
	N8(7,PokemonStat.DEF,PokemonStat.SATT),
	N9(8,PokemonStat.DEF,PokemonStat.SDEF),
	N10(9,PokemonStat.DEF,PokemonStat.SPEED),
	
	N11(10,PokemonStat.SATT,PokemonStat.ATT),
	N12(11,PokemonStat.SATT,PokemonStat.DEF),
	N13(12,PokemonStat.SATT,PokemonStat.SATT),
	N14(13,PokemonStat.SATT,PokemonStat.SDEF),
	N15(14,PokemonStat.SATT,PokemonStat.SPEED),
	
	N16(15,PokemonStat.SDEF,PokemonStat.ATT),
	N17(16,PokemonStat.SDEF,PokemonStat.DEF),
	N18(17,PokemonStat.SDEF,PokemonStat.SATT),
	N19(18,PokemonStat.SDEF,PokemonStat.SDEF),
	N20(19,PokemonStat.SDEF,PokemonStat.SPEED),
	
	N21(20,PokemonStat.SPEED,PokemonStat.ATT),
	N22(21,PokemonStat.SPEED,PokemonStat.DEF),
	N23(22,PokemonStat.SPEED,PokemonStat.SATT),
	N24(23,PokemonStat.SPEED,PokemonStat.SDEF),
	N25(24,PokemonStat.SPEED,PokemonStat.SPEED),
	;
	
	final int _higherStat,_lowerStat,_index;
	Nature(int index,int h,int l){
		
		_higherStat=h;
		_lowerStat=l;
		_index=index;
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
