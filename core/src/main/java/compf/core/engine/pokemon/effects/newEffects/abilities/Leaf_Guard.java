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
/*If Sunny Day is active, this Pokemon cannot become affected by a non-volatile status condition or Yawn, and Rest will fail for it. This effect is prevented if this Pokemon is holding a Utility Umbrella.*/
 public class Leaf_Guard extends PokemonBattleEffect{

/*@Override
 void onSetStatus(status, Pokemon target, Pokemon source, effect) {
      if (["sunnyday", "desolateland"].includes(target.effectiveWeather())) {
        if (effect?.status) {
          this.add("-immune", target, "[from] ability: Leaf Guard");
        }
        return false;
      }
    }*/
/*@Override
 void onTryAddVolatile(status, target) {
      if (status.id === "yawn" && ["sunnyday", "desolateland"].includes(target.effectiveWeather())) {
        this.add("-immune", Pokemon target, "[from] ability: Leaf Guard");
        return null;
      }
    }*/
public Leaf_Guard(Pokemon pkmn) {
        super(pkmn);
    }
}