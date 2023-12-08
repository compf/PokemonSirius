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
/*Holder's moves that hit 2-5 times hit 4-5 times; Population Bomb hits 4-10 times.*/
 public class Loaded_Dice extends PokemonBattleEffect{

/*@Override
 void onModifyMove(move) {
      if (move.multiaccuracy) {
        delete move.multiaccuracy;
      }
    }*/
public Loaded_Dice(Pokemon pkmn) {
        super(pkmn);
    }
}