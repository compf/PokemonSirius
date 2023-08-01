package compf.core.engine.pokemon.moves;

import compf.core.engine.Player;
import compf.core.engine.pokemon.effects.GlobalBattleEffect;
import compf.core.etc.MyObject;

import java.io.Serial;
import java.lang.reflect.InvocationTargetException;

public class GlobalEffectMove extends Move {
	private Class<?> _gobalEffectType;

	public GlobalEffectMove(Move copy, Class<?> effectType) {
		super(copy);
		this._gobalEffectType=effectType;
	}

	/**
	 *
	 */
	@Serial
    private static final long serialVersionUID = 1L;

	@Override
	public DamageInformation execute(Schedule.ScheduleItem item) {
		DamageInformation dmgInf = super.execute(item);

		GlobalBattleEffect effect = null;
		try {
			var a = (Object) _gobalEffectType.getDeclaredConstructor(Move.TargetType.class, Player.class, int.class).newInstance(this.getTarget(),dmgInf.getDefender().getPlayer(), MyObject.indexOf(dmgInf.getDefender().getPlayer().getTeam(), dmgInf.getDefender()));
			effect = (GlobalBattleEffect) a;
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
				 | InvocationTargetException | NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}

		dmgInf.getEffects().add(effect);


		return dmgInf;
	}

}