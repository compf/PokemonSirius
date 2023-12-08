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
 public class Embody_Aspect__Wellspring_ extends PokemonBattleEffect{

/*@Override
 void onStart(pokemon) {
      if (pokemon.baseSpecies.name === "Ogerpon-Wellspring-Tera" && !pokemon.transformed && !this.effectState.embodied) {
        this.effectState.embodied = true;
        this.boost({ spd: 1 }, pokemon);
      }
    }*/
/*@Override
 void onSwitchIn() {
      delete this.effectState.embodied;
    }*/
public Embody_Aspect__Wellspring_(Pokemon pkmn) {
        super(pkmn);
    }
}