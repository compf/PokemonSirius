package compf.core.engine.pokemon.effects.newEffects.abilities;

import compf.core.engine.BattleAction;
    import compf.core.engine.pokemon.PokemonStat;
    import compf.core.engine.pokemon.Pokemon;
    import compf.core.engine.pokemon.effects.EffectParam;
    import compf.core.engine.pokemon.effects.PokemonBattleEffect;
    import compf.core.engine.pokemon.moves.DamageInformation;
    import compf.core.engine.pokemon.moves.Schedule;
    import compf.core.engine.pokemon.moves.Schedule.ScheduleItem;
    import compf.core.etc.services.SharedInformation;
/*undefined*/
 public class Tangled_Feet extends PokemonBattleEffect{

/*@Override
 void onModifyAccuracy(accuracy, target) {
      if (typeof accuracy !== "number")
        return;
      if (target?.volatiles["confusion"]) {
        this.debug("Tangled Feet - decreasing accuracy");
        return this.chainModify(0.5);
      }
    }*/
public Tangled_Feet(Pokemon pkmn) {
        super(pkmn);
    }
}