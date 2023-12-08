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
/*If this move is successful, it sets up a hazard on the opposing side of the field, damaging each opposing Pokemon that switches in, unless it is a Flying-type Pokemon or has the Levitate Ability. A maximum of three layers may be set, and opponents lose 1/8 of their maximum HP with one layer, 1/6 of their maximum HP with two layers, and 1/4 of their maximum HP with three layers, all rounded down. Can be removed from the opposing side if any opposing Pokemon uses Mortal Spin, Rapid Spin, or Defog successfully, or is hit by Defog.*/
 public class Ceaseless_Edge extends PokemonBattleEffect{

/*@Override
 void onAfterHit(Pokemon target, Pokemon source, move) {
      if (!move.hasSheerForce && source.hp) {
        for (const side of source.side.foeSidesWithConditions()) {
          side.addSideCondition("spikes");
        }
      }
    }*/
/*@Override
 void onAfterSubDamage(DamageInformation damage, Pokemon target, Pokemon source, move) {
      if (!move.hasSheerForce && source.hp) {
        for (const side of source.side.foeSidesWithConditions()) {
          side.addSideCondition("spikes");
        }
      }
    }*/
public Ceaseless_Edge(Pokemon pkmn) {
        super(pkmn);
    }
}