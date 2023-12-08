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
/*Fails unless it is the user's first turn on the field.*/
 public class First_Impression extends PokemonBattleEffect{

/*@Override
 void onTry(source) {
      if (source.activeMoveActions > 1) {
        this.hint("First Impression only works on your first turn out.");
        return false;
      }
    }*/
public First_Impression(Pokemon pkmn) {
        super(pkmn);
    }
}