package compf.core.engine.pokemon.effects.newEffects.items;

import compf.core.engine.BattleAction;
    import compf.core.engine.pokemon.PokemonStat;
    import compf.core.engine.pokemon.Pokemon;
    import compf.core.engine.pokemon.effects.EffectParam;
    import compf.core.engine.pokemon.effects.PokemonBattleEffect;
    import compf.core.engine.pokemon.moves.DamageInformation;
    import compf.core.engine.pokemon.moves.Schedule;
    import compf.core.engine.pokemon.moves.Schedule.ScheduleItem;
    import compf.core.etc.services.SharedInformation;
/*Raises a random stat by 2 when at 1/4 max HP or less (not acc/eva). Single use.*/
 public class Starf_Berry extends PokemonBattleEffect{

/*@Override
 void onUpdate(pokemon) {
      if (pokemon.hp <= pokemon.maxhp / 4 || pokemon.hp <= pokemon.maxhp / 2 && pokemon.hasAbility("gluttony") && pokemon.abilityState.gluttony) {
        pokemon.eatItem();
      }
    }*/
/*@Override
 void onEat(pokemon) {
      const stats = [];
      let stat;
      for (stat in pokemon.boosts) {
        if (stat !== "accuracy" && stat !== "evasion" && pokemon.boosts[stat] < 6) {
          stats.push(stat);
        }
      }
      if (stats.length) {
        const randomStat = this.sample(stats);
        const boost = {};
        boost[randomStat] = 2;
        this.boost(boost);
      }
    }*/
public Starf_Berry(Pokemon pkmn) {
        super(pkmn);
    }
}