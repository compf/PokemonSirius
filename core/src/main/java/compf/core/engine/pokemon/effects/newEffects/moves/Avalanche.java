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
/*Power doubles if the user was hit by the target this turn.*/
 public class Avalanche extends PokemonBattleEffect{

/*@Override
 void basePowerCallback(pokemon, Pokemon target, move) {
      const damagedByTarget = pokemon.attackedBy.some(
        (p) => p.source === target && p.damage > 0 && p.thisTurn
      );
      if (damagedByTarget) {
        this.debug("BP doubled for getting hit by " + target);
        return move.basePower * 2;
      }
      return move.basePower;
    }*/
public Avalanche(Pokemon pkmn) {
        super(pkmn);
    }
}