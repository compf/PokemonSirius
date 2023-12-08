package compf.core.engine.pokemon.effects.newEffects.moves;

import compf.core.engine.BattleAction;
    import compf.core.engine.pokemon.PokemonStat;
    import compf.core.engine.pokemon.Pokemon;
    import compf.core.engine.pokemon.effects.EffectParam;
    import compf.core.engine.pokemon.effects.PokemonBattleEffect;
    import compf.core.engine.pokemon.moves.DamageInformation;
    import compf.core.engine.pokemon.moves.Schedule;
    import compf.core.engine.pokemon.moves.Schedule.ScheduleItem;
    import compf.core.etc.services.SharedInformation;
/*Leaves the target with at least 1 HP.*/
 public class Hold_Back extends PokemonBattleEffect{

/*@Override
 void onDamage(DamageInformation damage, Pokemon target, Pokemon source, effect) {
      if (damage >= target.hp)
        return target.hp - 1;
    }*/
public Hold_Back(Pokemon pkmn) {
        super(pkmn);
    }
}