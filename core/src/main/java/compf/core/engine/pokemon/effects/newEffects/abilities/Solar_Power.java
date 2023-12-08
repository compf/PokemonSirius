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
/*If Sunny Day is active, this Pokemon's Special Attack is multiplied by 1.5 and it loses 1/8 of its maximum HP, rounded down, at the end of each turn. These effects are prevented if the Pokemon is holding a Utility Umbrella.*/
 public class Solar_Power extends PokemonBattleEffect{

/*@Override
 void onModifySpA(spa, pokemon) {
      if (["sunnyday", "desolateland"].includes(pokemon.effectiveWeather())) {
        return this.chainModify(1.5);
      }
    }*/
/*@Override
 void onWeather(Pokemon target, Pokemon source, effect) {
      if (target.hasItem("utilityumbrella"))
        return;
      if (effect.id === "sunnyday" || effect.id === "desolateland") {
        this.DamageInformation damage(target.baseMaxhp / 8, target, target);
      }
    }*/
public Solar_Power(Pokemon pkmn) {
        super(pkmn);
    }
}