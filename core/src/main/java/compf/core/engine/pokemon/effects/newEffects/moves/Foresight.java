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
/*As long as the target remains active, its evasiveness stat stage is ignored during accuracy checks against it if it is greater than 0, and Normal- and Fighting-type attacks can hit the target if it is a Ghost type. Fails if the target is already affected, or affected by Miracle Eye or Odor Sleuth.*/
 public class Foresight extends PokemonBattleEffect{

/*@Override
 void onTryHit(target) {
      if (target.volatiles["miracleeye"])
        return false;
    }*/
/*@Override
 void true*/
/*@Override
 void onStart(pokemon) {
        this.add("-start", pokemon, "Foresight");
      }*/
/*@Override
 void onNegateImmunity(pokemon, type) {
        if (pokemon.hasType("Ghost") && ["Normal", "Fighting"].includes(type))
          return false;
      }*/
/*@Override
 void onModifyBoost(boosts) {
        if (boosts.evasion && boosts.evasion > 0) {
          boosts.evasion = 0;
        }
      }*/
public Foresight(Pokemon pkmn) {
        super(pkmn);
    }
}