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
/*The user is protected from most attacks made by other Pokemon during this turn, and Pokemon trying to make contact with the user have their Defense lowered by 2 stages. Non-damaging moves go through this protection. This move has a 1/X chance of being successful, where X starts at 1 and triples each time this move is successfully used. X resets to 1 if this move fails, if the user's last move used is not Baneful Bunker, Detect, Endure, King's Shield, Max Guard, Obstruct, Protect, Quick Guard, Silk Trap, Spiky Shield, or Wide Guard, or if it was one of those moves and the user's protection was broken. Fails if the user moves last this turn.*/
 public class Obstruct extends PokemonBattleEffect{

/*@Override
 void onPrepareHit(pokemon) {
      return !!this.queue.willAct() && this.runEvent("StallMove", pokemon);
    }*/
/*@Override
 void onHit(Pokemon target, Pokemon source, move) {
        if (move.isZOrMaxPowered && this.checkMoveMakesContact(Move move, source, target)) {
          this.boost({ def: -2 }, source, target, this.dex.getActiveMove("Obstruct"));
        }
      }*/
/*@Override
 void 1*/
/*@Override
 void onStart(target) {
        this.add("-singleturn", Pokemon target, "Protect");
      }*/
/*@Override
 void 3*/
/*@Override
 void onTryHit(Pokemon target, Pokemon source, move) {
        if (!move.flags["protect"] || move.category === "Status") {
          if (["gmaxoneblow", "gmaxrapidflow"].includes(move.id))
            return;
          if (move.isZ || move.isMax)
            target.getMoveHitData(move).zBrokeProtect = true;
          return;
        }
        if (move.smartTarget) {
          move.smartTarget = false;
        } else {
          this.add("-activate", target, "move: Protect");
        }
        const lockedmove = source.getVolatile("lockedmove");
        if (lockedmove) {
          if (source.volatiles["lockedmove"].duration === 2) {
            delete source.volatiles["lockedmove"];
          }
        }
        if (this.checkMoveMakesContact(Move move, source, target)) {
          this.boost({ def: -2 }, source, target, this.dex.getActiveMove("Obstruct"));
        }
        return this.NOT_FAIL;
      }*/
public Obstruct(Pokemon pkmn) {
        super(pkmn);
    }
}