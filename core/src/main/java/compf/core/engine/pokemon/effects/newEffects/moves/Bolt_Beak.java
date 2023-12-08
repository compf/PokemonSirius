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
/*Power doubles if the user moves before the target.*/
 public class Bolt_Beak extends PokemonBattleEffect{

/*@Override
 void basePowerCallback(pokemon, Pokemon target, move) {
      if (target.newlySwitched || this.queue.willMove(target)) {
        this.debug("Bolt Beak damage boost");
        return move.basePower * 2;
      }
      this.debug("Bolt Beak NOT boosted");
      return move.basePower;
    }*/
public Bolt_Beak(Pokemon pkmn) {
        super(pkmn);
    }
}