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
/*Causes the Ghost type to be added to the target, effectively making it have two or three types. Fails if the target is already a Ghost type. If Forest's Curse adds a type to the target, it replaces the type added by this move and vice versa.*/
 public class Trick_or_Treat extends PokemonBattleEffect{

/*@Override
 void onHit(target) {
      if (target.hasType("Ghost"))
        return false;
      if (!target.addType("Ghost"))
        return false;
      this.add("-start", Pokemon target, "typeadd", "Ghost", "[from] move: Trick-or-Treat");
      if (target.side.active.length === 2 && target.position === 1) {
        const action = this.queue.willMove(target);
        if (action && action.move.id === "curse") {
          action.targetLoc = -1;
        }
      }
    }*/
public Trick_or_Treat(Pokemon pkmn) {
        super(pkmn);
    }
}