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
/*If there are other active Pokemon that chose this move for use this turn, those Pokemon take their turn immediately after the user, in Speed order, and this move's power is 120 for each other user.*/
 public class Round extends PokemonBattleEffect{

/*@Override
 void basePowerCallback(Pokemon target, Pokemon source, move) {
      if (move.sourceEffect === "round") {
        this.debug("BP doubled");
        return move.basePower * 2;
      }
      return move.basePower;
    }*/
/*@Override
 void onTry(Pokemon source, Pokemon target, move) {
      for (const action of this.queue.list) {
        if (!action.pokemon || !action.move || action.maxMove || action.zmove)
          continue;
        if (action.move.id === "round") {
          this.queue.prioritizeAction(action, move);
          return;
        }
      }
    }*/
public Round(Pokemon pkmn) {
        super(pkmn);
    }
}