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
/*If this move is successful and the user has not fainted, the effects of Leech Seed and binding moves end for the user, and all hazards are removed from the user's side of the field. Has a 100% chance to raise the user's Speed by 1 stage.*/
 public class Rapid_Spin extends PokemonBattleEffect{

/*@Override
 void onAfterHit(Pokemon target, pokemon, move) {
      if (!move.hasSheerForce) {
        if (pokemon.hp && pokemon.removeVolatile("leechseed")) {
          this.add("-end", pokemon, "Leech Seed", "[from] move: Rapid Spin", "[of] " + pokemon);
        }
        const sideConditions = ["spikes", "toxicspikes", "stealthrock", "stickyweb", "gmaxsteelsurge"];
        for (const condition of sideConditions) {
          if (pokemon.hp && pokemon.side.removeSideCondition(condition)) {
            this.add("-sideend", pokemon.side, this.dex.conditions.get(condition).name, "[from] move: Rapid Spin", "[of] " + pokemon);
          }
        }
        if (pokemon.hp && pokemon.volatiles["partiallytrapped"]) {
          pokemon.removeVolatile("partiallytrapped");
        }
      }
    }*/
/*@Override
 void onAfterSubDamage(DamageInformation damage, Pokemon target, pokemon, move) {
      if (!move.hasSheerForce) {
        if (pokemon.hp && pokemon.removeVolatile("leechseed")) {
          this.add("-end", pokemon, "Leech Seed", "[from] move: Rapid Spin", "[of] " + pokemon);
        }
        const sideConditions = ["spikes", "toxicspikes", "stealthrock", "stickyweb", "gmaxsteelsurge"];
        for (const condition of sideConditions) {
          if (pokemon.hp && pokemon.side.removeSideCondition(condition)) {
            this.add("-sideend", pokemon.side, this.dex.conditions.get(condition).name, "[from] move: Rapid Spin", "[of] " + pokemon);
          }
        }
        if (pokemon.hp && pokemon.volatiles["partiallytrapped"]) {
          pokemon.removeVolatile("partiallytrapped");
        }
      }
    }*/
public Rapid_Spin(Pokemon pkmn) {
        super(pkmn);
    }
}