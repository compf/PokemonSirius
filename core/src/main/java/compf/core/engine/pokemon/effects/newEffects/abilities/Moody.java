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
/*This Pokemon has a random stat, other than accuracy or evasiveness, raised by 2 stages and another stat lowered by 1 stage at the end of each turn.*/
 public class Moody extends PokemonBattleEffect{

/*@Override
 void onResidual(pokemon) {
      let stats = [];
      const boost = {};
      let statPlus;
      for (statPlus in pokemon.boosts) {
        if (statPlus === "accuracy" || statPlus === "evasion")
          continue;
        if (pokemon.boosts[statPlus] < 6) {
          stats.push(statPlus);
        }
      }
      let randomStat = stats.length ? this.sample(stats) : void 0;
      if (randomStat)
        boost[randomStat] = 2;
      stats = [];
      let statMinus;
      for (statMinus in pokemon.boosts) {
        if (statMinus === "accuracy" || statMinus === "evasion")
          continue;
        if (pokemon.boosts[statMinus] > -6 && statMinus !== randomStat) {
          stats.push(statMinus);
        }
      }
      randomStat = stats.length ? this.sample(stats) : void 0;
      if (randomStat)
        boost[randomStat] = -1;
      this.boost(boost, pokemon, pokemon);
    }*/
public Moody(Pokemon pkmn) {
        super(pkmn);
    }
}