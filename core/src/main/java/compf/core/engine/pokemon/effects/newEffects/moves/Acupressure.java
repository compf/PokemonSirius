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
/*Raises a random stat by 2 stages as long as the stat is not already at stage 6. The user can choose to use this move on itself or an adjacent ally. Fails if no stat stage can be raised or if used on an ally with a substitute.*/
 public class Acupressure extends PokemonBattleEffect{

/*@Override
 void onHit(target) {
      const stats = [];
      let stat;
      for (stat in target.boosts) {
        if (target.boosts[stat] < 6) {
          stats.push(stat);
        }
      }
      if (stats.length) {
        const randomStat = this.sample(stats);
        const boost = {};
        boost[randomStat] = 2;
        this.boost(boost);
      } else {
        return false;
      }
    }*/
public Acupressure(Pokemon pkmn) {
        super(pkmn);
    }
}