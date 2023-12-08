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
 public class Air_Lock extends PokemonBattleEffect{

/*@Override
 void onSwitchIn(pokemon) {
      this.effectState.switchingIn = true;
    }*/
/*@Override
 void onStart(pokemon) {
      if (this.effectState.switchingIn) {
        this.add("-ability", pokemon, "Air Lock");
        this.effectState.switchingIn = false;
      }
      this.eachEvent("WeatherChange", this.effect);
    }*/
/*@Override
 void onEnd(pokemon) {
      this.eachEvent("WeatherChange", this.effect);
    }*/
public Air_Lock(Pokemon pkmn) {
        super(pkmn);
    }
}