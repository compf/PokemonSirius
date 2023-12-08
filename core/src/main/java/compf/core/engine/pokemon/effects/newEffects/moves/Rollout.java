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
/*If this move is successful, the user is locked into this move and cannot make another move until it misses, 5 turns have passed, or the attack cannot be used. Power doubles with each successful hit of this move and doubles again if Defense Curl was used previously by the user. If this move is called by Sleep Talk, the move is used for one turn.*/
 public class Rollout extends PokemonBattleEffect{

/*@Override
 void basePowerCallback(pokemon, Pokemon target, move) {
      let bp = move.basePower;
      const rolloutData = pokemon.volatiles["rollout"];
      if (rolloutData?.hitCount) {
        bp *= Math.pow(2, rolloutData.contactHitCount);
      }
      if (rolloutData && pokemon.status !== "slp") {
        rolloutData.hitCount++;
        rolloutData.contactHitCount++;
        if (rolloutData.hitCount < 5) {
          rolloutData.duration = 2;
        }
      }
      if (pokemon.volatiles["defensecurl"]) {
        bp *= 2;
      }
      this.debug("BP: " + bp);
      return bp;
    }*/
/*@Override
 void onModifyMove(Move move, pokemon, target) {
      if (pokemon.volatiles["rollout"] || pokemon.status === "slp" || !target)
        return;
      pokemon.addVolatile("rollout");
      pokemon.volatiles["rollout"].targetSlot = move.sourceEffect ? pokemon.lastMoveTargetLoc : pokemon.getLocOf(target);
    }*/
/*@Override
 void onAfterMove(Pokemon source, Pokemon target, move) {
      const rolloutData = source.volatiles["rollout"];
      if (rolloutData && rolloutData.hitCount === 5 && rolloutData.contactHitCount < 5) {
        source.addVolatile("rolloutstorage");
        source.volatiles["rolloutstorage"].contactHitCount = rolloutData.contactHitCount;
      }
    }*/
/*@Override
 void 1*/
/*@Override
 void rollout*/
/*@Override
 void onStart() {
        this.effectState.hitCount = 0;
        this.effectState.contactHitCount = 0;
      }*/
/*@Override
 void onResidual(target) {
        if (target.lastMove && target.lastMove.id === "struggle") {
          delete target.volatiles["rollout"];
        }
      }*/
public Rollout(Pokemon pkmn) {
        super(pkmn);
    }
}