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
/*If this Pokemon is a Minior, it changes to its Core forme if it has 1/2 or less of its maximum HP, and changes to Meteor Form if it has more than 1/2 its maximum HP. This check is done on switch-in and at the end of each turn. While in its Meteor Form, it cannot become affected by a non-volatile status condition or Yawn.*/
 public class Shields_Down extends PokemonBattleEffect{

/*@Override
 void onStart(pokemon) {
      if (pokemon.baseSpecies.baseSpecies !== "Minior" || pokemon.transformed)
        return;
      if (pokemon.hp > pokemon.maxhp / 2) {
        if (pokemon.species.forme !== "Meteor") {
          pokemon.formeChange("Minior-Meteor");
        }
      } else {
        if (pokemon.species.forme === "Meteor") {
          pokemon.formeChange(pokemon.set.species);
        }
      }
    }*/
/*@Override
 void onResidual(pokemon) {
      if (pokemon.baseSpecies.baseSpecies !== "Minior" || pokemon.transformed || !pokemon.hp)
        return;
      if (pokemon.hp > pokemon.maxhp / 2) {
        if (pokemon.species.forme !== "Meteor") {
          pokemon.formeChange("Minior-Meteor");
        }
      } else {
        if (pokemon.species.forme === "Meteor") {
          pokemon.formeChange(pokemon.set.species);
        }
      }
    }*/
/*@Override
 void onSetStatus(status, Pokemon target, Pokemon source, effect) {
      if (target.species.id !== "miniormeteor" || target.transformed)
        return;
      if (effect?.status) {
        this.add("-immune", target, "[from] ability: Shields Down");
      }
      return false;
    }*/
/*@Override
 void onTryAddVolatile(status, target) {
      if (target.species.id !== "miniormeteor" || target.transformed)
        return;
      if (status.id !== "yawn")
        return;
      this.add("-immune", Pokemon target, "[from] ability: Shields Down");
      return null;
    }*/
public Shields_Down(Pokemon pkmn) {
        super(pkmn);
    }
}