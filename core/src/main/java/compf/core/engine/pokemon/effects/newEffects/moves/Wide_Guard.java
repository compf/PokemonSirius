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
/*The user and its party members are protected from moves made by other Pokemon, including allies, during this turn that target all adjacent foes or all adjacent Pokemon. This move modifies the same 1/X chance of being successful used by other protection moves, where X starts at 1 and triples each time this move is successfully used, but does not use the chance to check for failure. X resets to 1 if this move fails, if the user's last move used is not Baneful Bunker, Detect, Endure, King's Shield, Max Guard, Obstruct, Protect, Quick Guard, Silk Trap, Spiky Shield, or Wide Guard, or if it was one of those moves and the user's protection was broken. Fails if the user moves last this turn or if this move is already in effect for the user's side.*/
 public class Wide_Guard extends PokemonBattleEffect{

/*@Override
 void onTry() {
      return !!this.queue.willAct();
    }*/
/*@Override
 void onHitSide(side, source) {
      source.addVolatile("stall");
    }*/
/*@Override
 void 1*/
/*@Override
 void onSideStart(Pokemon target, source) {
        this.add("-singleturn", Pokemon source, "Wide Guard");
      }*/
/*@Override
 void 4*/
/*@Override
 void onTryHit(Pokemon target, Pokemon source, move) {
        if (move?.target !== "allAdjacent" && move.target !== "allAdjacentFoes") {
          return;
        }
        if (move.isZ || move.isMax) {
          if (["gmaxoneblow", "gmaxrapidflow"].includes(move.id))
            return;
          target.getMoveHitData(move).zBrokeProtect = true;
          return;
        }
        this.add("-activate", target, "move: Wide Guard");
        const lockedmove = source.getVolatile("lockedmove");
        if (lockedmove) {
          if (source.volatiles["lockedmove"].duration === 2) {
            delete source.volatiles["lockedmove"];
          }
        }
        return this.NOT_FAIL;
      }*/
public Wide_Guard(Pokemon pkmn) {
        super(pkmn);
    }
}