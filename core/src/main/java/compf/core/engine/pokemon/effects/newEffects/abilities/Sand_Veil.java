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
/*If Sandstorm is active, the accuracy of moves used against this Pokemon is multiplied by 0.8. This Pokemon takes no damage from Sandstorm.*/
 public class Sand_Veil extends PokemonBattleEffect{

/*@Override
 void onImmunity(type, pokemon) {
      if (type === "sandstorm")
        return false;
    }*/
/*@Override
 void onModifyAccuracy(accuracy) {
      if (typeof accuracy !== "number")
        return;
      if (this.field.isWeather("sandstorm")) {
        this.debug("Sand Veil - decreasing accuracy");
        return this.chainModify([3277, 4096]);
      }
    }*/
public Sand_Veil(Pokemon pkmn) {
        super(pkmn);
    }
}