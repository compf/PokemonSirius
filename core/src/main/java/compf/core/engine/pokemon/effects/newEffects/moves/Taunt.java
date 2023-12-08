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
/*Prevents the target from using non-damaging moves for its next three turns. Pokemon with the Oblivious Ability or protected by the Aroma Veil Ability are immune.*/
 public class Taunt extends PokemonBattleEffect{

/*@Override
 void 3*/
/*@Override
 void onStart(target) {
        if (target.activeTurns && !this.queue.willMove(target)) {
          this.effectState.duration++;
        }
        this.add("-start", Pokemon target, "move: Taunt");
      }*/
/*@Override
 void 15*/
/*@Override
 void onEnd(target) {
        this.add("-end", Pokemon target, "move: Taunt");
      }*/
/*@Override
 void onDisableMove(pokemon) {
        for (const moveSlot of pokemon.moveSlots) {
          const move = this.dex.moves.get(moveSlot.id);
          if (move.category === "Status" && move.id !== "mefirst") {
            pokemon.disableMove(moveSlot.id);
          }
        }
      }*/
/*@Override
 void 5*/
/*@Override
 void onBeforeMove(attacker, defender, move) {
        if (!move.isZ && !move.isMax && move.category === "Status" && move.id !== "mefirst") {
          this.add("cant", attacker, "move: Taunt", move);
          return false;
        }
      }*/
public Taunt(Pokemon pkmn) {
        super(pkmn);
    }
}