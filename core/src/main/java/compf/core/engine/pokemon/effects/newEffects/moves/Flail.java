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
/*The power of this move is 20 if X is 33 to 48, 40 if X is 17 to 32, 80 if X is 10 to 16, 100 if X is 5 to 9, 150 if X is 2 to 4, and 200 if X is 0 or 1, where X is equal to (user's current HP * 48 / user's maximum HP), rounded down.*/
 public class Flail extends PokemonBattleEffect{

/*@Override
 void basePowerCallback(pokemon, target) {
      const ratio = Math.max(Math.floor(pokemon.hp * 48 / pokemon.maxhp), 1);
      let bp;
      if (ratio < 2) {
        bp = 200;
      } else if (ratio < 5) {
        bp = 150;
      } else if (ratio < 10) {
        bp = 100;
      } else if (ratio < 17) {
        bp = 80;
      } else if (ratio < 33) {
        bp = 40;
      } else {
        bp = 20;
      }
      this.debug("BP: " + bp);
      return bp;
    }*/
public Flail(Pokemon pkmn) {
        super(pkmn);
    }
}