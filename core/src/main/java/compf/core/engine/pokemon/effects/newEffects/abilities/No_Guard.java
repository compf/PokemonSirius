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
/*undefined*/
 public class No_Guard extends PokemonBattleEffect{

/*@Override
 void onAnyInvulnerability(Pokemon target, Pokemon source, move) {
      if (move && (source === this.effectState.target || target === this.effectState.target))
        return 0;
    }*/
/*@Override
 void onAnyAccuracy(accuracy, Pokemon target, Pokemon source, move) {
      if (move && (source === this.effectState.target || target === this.effectState.target)) {
        return true;
      }
      return accuracy;
    }*/
public No_Guard(Pokemon pkmn) {
        super(pkmn);
    }
}