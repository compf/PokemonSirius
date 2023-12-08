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
/*Causes the target to fall asleep at the end of the next turn. Fails when used if the target cannot fall asleep or if it already has a non-volatile status condition. At the end of the next turn, if the target is still active, does not have a non-volatile status condition, and can fall asleep, it falls asleep. If the target becomes affected, this effect cannot be prevented by Safeguard or a substitute, or by falling asleep and waking up during the effect.*/
 public class Yawn extends PokemonBattleEffect{

/*@Override
 void onTryHit(target) {
      if (target.status || !target.runStatusImmunity("slp")) {
        return false;
      }
    }*/
/*@Override
 void true*/
/*@Override
 void 2*/
/*@Override
 void onStart(Pokemon target, source) {
        this.add("-start", target, "move: Yawn", "[of] " + source);
      }*/
/*@Override
 void 23*/
/*@Override
 void onEnd(target) {
        this.add("-end", Pokemon target, "move: Yawn", "[silent]");
        target.trySetStatus("slp", this.effectState.source);
      }*/
public Yawn(Pokemon pkmn) {
        super(pkmn);
    }
}