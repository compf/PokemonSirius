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
/*If Rain Dance is active, this Pokemon restores 1/16 of its maximum HP, rounded down, at the end of each turn. This effect is prevented if this Pokemon is holding a Utility Umbrella.*/
 public class Rain_Dish extends PokemonBattleEffect{

/*@Override
 void onWeather(Pokemon target, Pokemon source, effect) {
      if (target.hasItem("utilityumbrella"))
        return;
      if (effect.id === "raindance" || effect.id === "primordialsea") {
        this.heal(target.baseMaxhp / 16);
      }
    }*/
public Rain_Dish(Pokemon pkmn) {
        super(pkmn);
    }
}