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
/*If Snow is active, the accuracy of moves used against this Pokemon is multiplied by 0.8.*/
 public class Snow_Cloak extends PokemonBattleEffect{

/*@Override
 void onImmunity(type, pokemon) {
      if (type === "hail")
        return false;
    }*/
/*@Override
 void onModifyAccuracy(accuracy) {
      if (typeof accuracy !== "number")
        return;
      if (this.field.isWeather(["hail", "snow"])) {
        this.debug("Snow Cloak - decreasing accuracy");
        return this.chainModify([3277, 4096]);
      }
    }*/
public Snow_Cloak(Pokemon pkmn) {
        super(pkmn);
    }
}