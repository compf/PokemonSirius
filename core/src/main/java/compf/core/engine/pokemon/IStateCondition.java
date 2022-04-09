package compf.core.engine.pokemon;

import java.lang.reflect.InvocationTargetException;

import compf.core.engine.pokemon.moves.DamageInformation;

public  interface IStateCondition {
	void init(Pokemon pkmn);
	boolean execute(DamageInformation dmg);
	boolean isVolatile();
	void restore(Pokemon pkmn);
	
	static IStateCondition create(Class<?> type) {
		try {
			return ((IStateCondition)type.getConstructor().newInstance());
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			return null;
		}
	}
}
