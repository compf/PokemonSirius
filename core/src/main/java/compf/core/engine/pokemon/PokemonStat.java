package compf.core.engine.pokemon;

public interface PokemonStat {
	public static final int HP = 0;
	public static final int ATT = 1;
	public static final int DEF = 2;
	public static final int SATT = 3;
	public static final int SDEF = 4;
	public static final int SPEED = 5;
	public static final int ACCURACY = 6;
	public static final int EVASION = 7;
	public static final int[] STAT_WITHOUT_ACC_EVA ={
		HP,ATT,DEF,SATT,SDEF,SPEED
	};
	public static final int[] STAT_WITH_ACC_EVA ={
		HP,ATT,DEF,SATT,SDEF,SPEED,ACCURACY,EVASION
	};
	
	public static String getName(int index){
		switch(index){
			case 0:
			return "HP";
			case 1:
			return "ATT";
			case 2:
			return "DEf";
			case 3:
			return "SATT";
			case 4:
			return "SDEF";
			case 5:
			return "INIT";
			case 6:
			return "ACC";
			case 7:
			return "EVAS";
			default:
			return null;


		}
	}
}