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
/*The power of this move varies; 5% chances for 10 and 150 power, 10% chances for 30 and 110 power, 20% chances for 50 and 90 power, and 30% chance for 70 power. Damage doubles if the target is using Dig.*/
 public class Magnitude extends PokemonBattleEffect{

/*@Override
 void onModifyMove(Move move, pokemon) {
      const i = this.random(100);
      if (i < 5) {
        move.magnitude = 4;
        move.basePower = 10;
      } else if (i < 15) {
        move.magnitude = 5;
        move.basePower = 30;
      } else if (i < 35) {
        move.magnitude = 6;
        move.basePower = 50;
      } else if (i < 65) {
        move.magnitude = 7;
        move.basePower = 70;
      } else if (i < 85) {
        move.magnitude = 8;
        move.basePower = 90;
      } else if (i < 95) {
        move.magnitude = 9;
        move.basePower = 110;
      } else {
        move.magnitude = 10;
        move.basePower = 150;
      }
    }*/
/*@Override
 void onUseMoveMessage(pokemon, Pokemon target, move) {
      this.add("-activate", pokemon, "move: Magnitude", move.magnitude);
    }*/
public Magnitude(Pokemon pkmn) {
        super(pkmn);
    }
}