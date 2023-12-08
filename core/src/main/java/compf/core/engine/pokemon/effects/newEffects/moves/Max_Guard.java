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
/*The user is protected from nearly all attacks made by other Pokemon during this turn, including Max and G-Max Moves. This move has a 1/X chance of being successful, where X starts at 1 and triples each time this move is successfully used. X resets to 1 if this move fails, if the user's last move used is not Baneful Bunker, Detect, Endure, King's Shield, Max Guard, Obstruct, Protect, Quick Guard, Spiky Shield, or Wide Guard, or if it was one of those moves and the user's protection was broken. Fails if the user moves last this turn.*/
 public class Max_Guard extends PokemonBattleEffect{

/*@Override
 void onPrepareHit(pokemon) {
      return !!this.queue.willAct() && this.runEvent("StallMove", pokemon);
    }*/
/*@Override
 void onHit(pokemon) {
      pokemon.addVolatile("stall");
    }*/
/*@Override
 void 1*/
/*@Override
 void onStart(target) {
        this.add("-singleturn", Pokemon target, "Max Guard");
      }*/
/*@Override
 void 3*/
/*@Override
 void onTryHit(Pokemon target, Pokemon source, move) {
        const bypassesMaxGuard = [
          "acupressure",
          "afteryou",
          "allyswitch",
          "aromatherapy",
          "aromaticmist",
          "coaching",
          "confide",
          "copycat",
          "curse",
          "decorate",
          "doomdesire",
          "feint",
          "futuresight",
          "gmaxoneblow",
          "gmaxrapidflow",
          "healbell",
          "holdhands",
          "howl",
          "junglehealing",
          "lifedew",
          "meanlook",
          "perishsong",
          "playnice",
          "powertrick",
          "roar",
          "roleplay",
          "tearfullook"
        ];
        if (bypassesMaxGuard.includes(move.id))
          return;
        if (move.smartTarget) {
          move.smartTarget = false;
        } else {
          this.add("-activate", target, "move: Max Guard");
        }
        const lockedmove = source.getVolatile("lockedmove");
        if (lockedmove) {
          if (source.volatiles["lockedmove"].duration === 2) {
            delete source.volatiles["lockedmove"];
          }
        }
        return this.NOT_FAIL;
      }*/
public Max_Guard(Pokemon pkmn) {
        super(pkmn);
    }
}