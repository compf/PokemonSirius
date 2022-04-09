package compf.core.engine.pokemon.moves;

import java.lang.reflect.InvocationTargetException;

import compf.core.engine.pokemon.Pokemon;
import compf.core.engine.pokemon.effects.PokemonBattleEffect;
import compf.core.etc.MyObject;

public class PokemonEffectMove extends Move {
	private Class<?> _on_attacker,_on_defender;
	private int _perc;

	public PokemonEffectMove(final Move mv, Class<?> onAttacker, Class<?> onDefender, int perc) {
		super(mv);
		_on_attacker=onAttacker;
		_on_defender=onDefender;
		_perc = perc;
	}

	@Override
	public DamageInformation execute(Schedule.ScheduleItem item) {
		DamageInformation dmgInf = super.execute(item);
		if (MyObject.checkPerc(_perc)) {
			var def = item._battle.getPokemon(item._defender);
			PokemonBattleEffect attEffect=null,defEffect=null;
			try {
				if(_on_attacker!=null) {
					var att=(Object)_on_attacker.getDeclaredConstructor(Pokemon.class).newInstance(item.getAttacker());
					attEffect=(PokemonBattleEffect)att;
				}
				if(_on_defender!=null) {
					var defE=(Object)_on_defender.getDeclaredConstructor(Pokemon.class).newInstance(item.getDefender());
					defEffect=(PokemonBattleEffect)defE;
				}
				
				
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException | NoSuchMethodException | SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			dmgInf.getEffects().add(attEffect);
			dmgInf.getEffects().add(defEffect);
		}

		return dmgInf;
	}
}
