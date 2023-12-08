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
/*On switch-in, this Pokemon blocks certain status moves and instead uses the move against the original user.*/
 public class Rebound extends PokemonBattleEffect{

/*@Override
 void onTryHit(Pokemon target, Pokemon source, move) {
      if (this.effectState.target.activeTurns)
        return;
      if (target === source || move.hasBounced || !move.flags["reflectable"]) {
        return;
      }
      const newMove = this.dex.getActiveMove(move.id);
      newMove.hasBounced = true;
      this.actions.useMove(newMove, target, source);
      return null;
    }*/
/*@Override
 void onAllyTryHitSide(Pokemon target, Pokemon source, move) {
      if (this.effectState.target.activeTurns)
        return;
      if (target.isAlly(source) || move.hasBounced || !move.flags["reflectable"]) {
        return;
      }
      const newMove = this.dex.getActiveMove(move.id);
      newMove.hasBounced = true;
      this.actions.useMove(newMove, this.effectState.target, source);
      return null;
    }*/
/*@Override
 void 1*/
public Rebound(Pokemon pkmn) {
        super(pkmn);
    }
}