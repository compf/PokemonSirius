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
/*If this move is successful, it deals damage or heals the target. 40% chance for 40 power, 30% chance for 80 power, 10% chance for 120 power, and 20% chance to heal the target by 1/4 of its maximum HP, rounded down.*/
 public class Present extends PokemonBattleEffect{

/*@Override
 void onModifyMove(Move move, pokemon, target) {
      const rand = this.random(10);
      if (rand < 2) {
        move.heal = [1, 4];
        move.infiltrates = true;
      } else if (rand < 6) {
        move.basePower = 40;
      } else if (rand < 9) {
        move.basePower = 80;
      } else {
        move.basePower = 120;
      }
    }*/
public Present(Pokemon pkmn) {
        super(pkmn);
    }
}