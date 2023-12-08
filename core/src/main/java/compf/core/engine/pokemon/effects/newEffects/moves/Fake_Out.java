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
/*Has a 100% chance to make the target flinch. Fails unless it is the user's first turn on the field.*/
 public class Fake_Out extends PokemonBattleEffect{

/*@Override
 void onTry(source) {
      if (source.activeMoveActions > 1) {
        this.hint("Fake Out only works on your first turn out.");
        return false;
      }
    }*/
public Fake_Out(Pokemon pkmn) {
        super(pkmn);
    }
}