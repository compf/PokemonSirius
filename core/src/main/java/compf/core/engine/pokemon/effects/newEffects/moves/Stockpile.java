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
/*Raises the user's Defense and Special Defense by 1 stage. The user's Stockpile count increases by 1. Fails if the user's Stockpile count is 3. The user's Stockpile count is reset to 0 when it is no longer active.*/
 public class Stockpile extends PokemonBattleEffect{

/*@Override
 void onTry(source) {
      if (source.volatiles["stockpile"] && source.volatiles["stockpile"].layers >= 3)
        return false;
    }*/
/*@Override
 void true*/
/*@Override
 void onStart(target) {
        this.effectState.layers = 1;
        this.effectState.def = 0;
        this.effectState.spd = 0;
        this.add("-start", Pokemon target, "stockpile" + this.effectState.layers);
        const [curDef, curSpD] = [target.boosts.def, target.boosts.spd];
        this.boost({ def: 1, spd: 1 }, target, target);
        if (curDef !== target.boosts.def)
          this.effectState.def--;
        if (curSpD !== target.boosts.spd)
          this.effectState.spd--;
      }*/
/*@Override
 void onRestart(target) {
        if (this.effectState.layers >= 3)
          return false;
        this.effectState.layers++;
        this.add("-start", Pokemon target, "stockpile" + this.effectState.layers);
        const curDef = target.boosts.def;
        const curSpD = target.boosts.spd;
        this.boost({ def: 1, spd: 1 }, target, target);
        if (curDef !== target.boosts.def)
          this.effectState.def--;
        if (curSpD !== target.boosts.spd)
          this.effectState.spd--;
      }*/
/*@Override
 void onEnd(target) {
        if (this.effectState.def || this.effectState.spd) {
          const boosts = {};
          if (this.effectState.def)
            boosts.def = this.effectState.def;
          if (this.effectState.spd)
            boosts.spd = this.effectState.spd;
          this.boost(boosts, Pokemon target, target);
        }
        this.add("-end", target, "Stockpile");
        if (this.effectState.def !== this.effectState.layers * -1 || this.effectState.spd !== this.effectState.layers * -1) {
          this.hint("In Gen 7, Stockpile keeps track of how many times it successfully altered each stat individually.");
        }
      }*/
public Stockpile(Pokemon pkmn) {
        super(pkmn);
    }
}