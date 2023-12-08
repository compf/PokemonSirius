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
/*For every consecutive turn that this move is used by at least one Pokemon, this move's power is multiplied by the number of turns to pass, but not more than 5.*/
 public class Echoed_Voice extends PokemonBattleEffect{

/*@Override
 void basePowerCallback(pokemon, Pokemon target, move) {
      let bp = move.basePower;
      if (this.field.pseudoWeather.echoedvoice) {
        bp = move.basePower * this.field.pseudoWeather.echoedvoice.multiplier;
      }
      this.debug("BP: " + move.basePower);
      return bp;
    }*/
/*@Override
 void onTry() {
      this.field.addPseudoWeather("echoedvoice");
    }*/
/*@Override
 void 2*/
/*@Override
 void onFieldStart() {
        this.effectState.multiplier = 1;
      }*/
/*@Override
 void onFieldRestart() {
        if (this.effectState.duration !== 2) {
          this.effectState.duration = 2;
          if (this.effectState.multiplier < 5) {
            this.effectState.multiplier++;
          }
        }
      }*/
public Echoed_Voice(Pokemon pkmn) {
        super(pkmn);
    }
}