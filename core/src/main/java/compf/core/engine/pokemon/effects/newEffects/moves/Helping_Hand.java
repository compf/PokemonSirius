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
/*The power of the target's attack this turn is multiplied by 1.5 (this effect is stackable). Fails if there is no ally adjacent to the user or if the ally already moved this turn, but does not fail if the ally is using a two-turn move.*/
 public class Helping_Hand extends PokemonBattleEffect{

/*@Override
 void onTryHit(target) {
      if (!target.newlySwitched && !this.queue.willMove(target))
        return false;
    }*/
/*@Override
 void 1*/
/*@Override
 void onStart(Pokemon target, source) {
        this.effectState.multiplier = 1.5;
        this.add("-singleturn", target, "Helping Hand", "[of] " + source);
      }*/
/*@Override
 void onRestart(Pokemon target, source) {
        this.effectState.multiplier *= 1.5;
        this.add("-singleturn", target, "Helping Hand", "[of] " + source);
      }*/
/*@Override
 void 10*/
/*@Override
 void onBasePower(basePower) {
        this.debug("Boosting from Helping Hand: " + this.effectState.multiplier);
        return this.chainModify(this.effectState.multiplier);
      }*/
public Helping_Hand(Pokemon pkmn) {
        super(pkmn);
    }
}