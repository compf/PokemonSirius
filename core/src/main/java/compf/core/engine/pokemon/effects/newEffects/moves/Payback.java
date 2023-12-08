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
/*Power doubles if the user moves after the target this turn, including actions taken through Instruct or the Dancer Ability. Switching in does not count as an action.*/
 public class Payback extends PokemonBattleEffect{

/*@Override
 void basePowerCallback(pokemon, Pokemon target, move) {
      if (target.newlySwitched || this.queue.willMove(target)) {
        this.debug("Payback NOT boosted");
        return move.basePower;
      }
      this.debug("Payback damage boost");
      return move.basePower * 2;
    }*/
public Payback(Pokemon pkmn) {
        super(pkmn);
    }
}