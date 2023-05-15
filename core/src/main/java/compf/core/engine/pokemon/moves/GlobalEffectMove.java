package compf.core.engine.pokemon.moves;

import compf.core.engine.pokemon.effects.GlobalBattleEffect;

import java.io.Serial;
import java.lang.reflect.InvocationTargetException;

public class GlobalEffectMove extends Move {
	private Class<?>[] _types;

	public GlobalEffectMove(Move copy, Class<?>... effectTypes) {
		super(copy);
		_types = effectTypes;
	}

	/**
	 *
	 */
	@Serial
    private static final long serialVersionUID = 1L;

	@Override
	public DamageInformation execute(Schedule.ScheduleItem item) {
		DamageInformation dmgInf = super.execute(item);
		for (Class<?> type : _types) {
			GlobalBattleEffect effect = null;
			try {
				var a = (Object) type.getDeclaredConstructor().newInstance();
				effect = (GlobalBattleEffect) a;
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException | NoSuchMethodException | SecurityException e) {
				e.printStackTrace();
			}

			dmgInf.getEffects().add(effect);
		}

		return dmgInf;
	}

}