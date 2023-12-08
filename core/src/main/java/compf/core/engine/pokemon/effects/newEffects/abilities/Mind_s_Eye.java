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
/*This Pokemon can hit Ghost types with Normal- and Fighting-type moves. Prevents other Pokemon from lowering this Pokemon's accuracy stat stage. This Pokemon ignores a target's evasiveness stat stage.*/
 public class Mind_s_Eye extends PokemonBattleEffect{

/*@Override
 void onTryBoost(boost, Pokemon target, Pokemon source, effect) {
      if (source && target === source)
        return;
      if (boost.accuracy && boost.accuracy < 0) {
        delete boost.accuracy;
        if (!effect.secondaries) {
          this.add("-fail", target, "unboost", "accuracy", "[from] ability: Mind's Eye", "[of] " + target);
        }
      }
    }*/
/*@Override
 void onModifyMove(move) {
      move.ignoreEvasion = true;
      if (!move.ignoreImmunity)
        move.ignoreImmunity = {};
      if (move.ignoreImmunity !== true) {
        move.ignoreImmunity["Fighting"] = true;
        move.ignoreImmunity["Normal"] = true;
      }
    }*/
public Mind_s_Eye(Pokemon pkmn) {
        super(pkmn);
    }
}