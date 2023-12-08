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
 public class Drought extends PokemonBattleEffect{

/*@Override
 void onStart(source) {
      for (const action of this.queue) {
        if (action.choice === "runPrimal" && action.pokemon === source && source.species.id === "groudon")
          return;
        if (action.choice !== "runSwitch" && action.choice !== "runPrimal")
          break;
      }
      this.field.setWeather("sunnyday");
    }*/
public Drought(Pokemon pkmn) {
        super(pkmn);
    }
}