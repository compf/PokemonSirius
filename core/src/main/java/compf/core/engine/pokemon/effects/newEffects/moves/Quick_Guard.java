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
/*The user and its party members are protected from attacks with original or altered priority greater than 0 made by other Pokemon, including allies, during this turn. This move modifies the same 1/X chance of being successful used by other protection moves, where X starts at 1 and triples each time this move is successfully used, but does not use the chance to check for failure. X resets to 1 if this move fails, if the user's last move used is not Baneful Bunker, Detect, Endure, King's Shield, Max Guard, Obstruct, Protect, Quick Guard, Silk Trap, Spiky Shield, or Wide Guard, or if it was one of those moves and the user's protection was broken. Fails if the user moves last this turn or if this move is already in effect for the user's side.*/
 public class Quick_Guard extends PokemonBattleEffect{

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
        this.add("-singleturn", Pokemon source, "Quick Guard");
      }*/
/*@Override
 void 4*/
/*@Override
 void onTryHit(Pokemon target, Pokemon source, move) {
        if (move.priority <= 0.1)
          return;
        if (!move.flags["protect"]) {
          if (["gmaxoneblow", "gmaxrapidflow"].includes(move.id))
            return;
          if (move.isZ || move.isMax)
            target.getMoveHitData(move).zBrokeProtect = true;
          return;
        }
        this.add("-activate", target, "move: Quick Guard");
        const lockedmove = source.getVolatile("lockedmove");
        if (lockedmove) {
          if (source.volatiles["lockedmove"].duration === 2) {
            delete source.volatiles["lockedmove"];
          }
        }
        return this.NOT_FAIL;
      }*/
public Quick_Guard(Pokemon pkmn) {
        super(pkmn);
    }
}