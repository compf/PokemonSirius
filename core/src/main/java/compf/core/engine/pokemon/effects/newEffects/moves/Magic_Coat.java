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
/*Until the end of the turn, the user is unaffected by certain non-damaging moves directed at it and will instead use such moves against the original user. Moves reflected in this way are unable to be reflected again by this or the Magic Bounce Ability's effect. Spikes, Stealth Rock, Sticky Web, and Toxic Spikes can only be reflected once per side, by the leftmost Pokemon under this or the Magic Bounce Ability's effect. The Lightning Rod and Storm Drain Abilities redirect their respective moves before this move takes effect.*/
 public class Magic_Coat extends PokemonBattleEffect{

/*@Override
 void 1*/
/*@Override
 void onStart(Pokemon target, Pokemon source, effect) {
        this.add("-singleturn", target, "move: Magic Coat");
        if (effect?.effectType === "Move") {
          this.effectState.pranksterBoosted = effect.pranksterBoosted;
        }
      }*/
/*@Override
 void 2*/
/*@Override
 void onTryHit(Pokemon target, Pokemon source, move) {
        if (target === source || move.hasBounced || !move.flags["reflectable"]) {
          return;
        }
        const newMove = this.dex.getActiveMove(move.id);
        newMove.hasBounced = true;
        newMove.pranksterBoosted = this.effectState.pranksterBoosted;
        this.actions.useMove(newMove, target, source);
        return null;
      }*/
/*@Override
 void onAllyTryHitSide(Pokemon target, Pokemon source, move) {
        if (target.isAlly(source) || move.hasBounced || !move.flags["reflectable"]) {
          return;
        }
        const newMove = this.dex.getActiveMove(move.id);
        newMove.hasBounced = true;
        newMove.pranksterBoosted = false;
        this.actions.useMove(newMove, this.effectState.target, source);
        return null;
      }*/
public Magic_Coat(Pokemon pkmn) {
        super(pkmn);
    }
}