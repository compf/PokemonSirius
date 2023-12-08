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
/*This move fails unless the user knows this move and at least one other move, and has used all the other moves it knows at least once each since it became active or Transformed.*/
 public class Last_Resort extends PokemonBattleEffect{

/*@Override
 void onTry(source) {
      if (source.moveSlots.length < 2)
        return false;
      let hasLastResort = false;
      for (const moveSlot of source.moveSlots) {
        if (moveSlot.id === "lastresort") {
          hasLastResort = true;
          continue;
        }
        if (!moveSlot.used)
          return false;
      }
      return hasLastResort;
    }*/
public Last_Resort(Pokemon pkmn) {
        super(pkmn);
    }
}