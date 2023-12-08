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
/*The user will survive attacks made by other Pokemon during this turn with at least 1 HP. This move has a 1/X chance of being successful, where X starts at 1 and triples each time this move is successfully used. X resets to 1 if this move fails, if the user's last move used is not Baneful Bunker, Detect, Endure, King's Shield, Max Guard, Obstruct, Protect, Quick Guard, Silk Trap, Spiky Shield, or Wide Guard, or if it was one of those moves and the user's protection was broken. Fails if the user moves last this turn.*/
 public class Endure extends PokemonBattleEffect{

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
        this.add("-singleturn", Pokemon target, "move: Endure");
      }*/
/*@Override
 void -10*/
/*@Override
 void onDamage(DamageInformation damage, Pokemon target, Pokemon source, effect) {
        if (effect?.effectType === "Move" && damage >= target.hp) {
          this.add("-activate", target, "move: Endure");
          return target.hp - 1;
        }
      }*/
public Endure(Pokemon pkmn) {
        super(pkmn);
    }
}