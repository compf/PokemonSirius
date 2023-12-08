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
/*Causes the target to become infatuated, making it unable to attack 50% of the time. Fails if both the user and the target are the same gender, if either is genderless, or if the target is already infatuated. The effect ends when either the user or the target is no longer active. Pokemon with the Oblivious Ability or protected by the Aroma Veil Ability are immune.*/
 public class Attract extends PokemonBattleEffect{

/*@Override
 void true*/
/*@Override
 void onStart(pokemon, Pokemon source, effect) {
        if (!(pokemon.gender === "M" && source.gender === "F") && !(pokemon.gender === "F" && source.gender === "M")) {
          this.debug("incompatible gender");
          return false;
        }
        if (!this.runEvent("Attract", pokemon, source)) {
          this.debug("Attract event failed");
          return false;
        }
        if (effect.name === "Cute Charm") {
          this.add("-start", pokemon, "Attract", "[from] ability: Cute Charm", "[of] " + source);
        } else if (effect.name === "Destiny Knot") {
          this.add("-start", pokemon, "Attract", "[from] item: Destiny Knot", "[of] " + source);
        } else {
          this.add("-start", pokemon, "Attract");
        }
      }*/
/*@Override
 void onUpdate(pokemon) {
        if (this.effectState.source && !this.effectState.source.isActive && pokemon.volatiles["attract"]) {
          this.debug("Removing Attract volatile on " + pokemon);
          pokemon.removeVolatile("attract");
        }
      }*/
/*@Override
 void 2*/
/*@Override
 void onBeforeMove(pokemon, Pokemon target, move) {
        this.add("-activate", pokemon, "move: Attract", "[of] " + this.effectState.source);
        if (this.randomChance(1, 2)) {
          this.add("cant", pokemon, "Attract");
          return false;
        }
      }*/
/*@Override
 void onEnd(pokemon) {
        this.add("-end", pokemon, "Attract", "[silent]");
      }*/
/*@Override
 void onTryImmunity(Pokemon target, source) {
      return target.gender === "M" && source.gender === "F" || target.gender === "F" && source.gender === "M";
    }*/
public Attract(Pokemon pkmn) {
        super(pkmn);
    }
}