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
/*For its next 3 turns, the target is forced to repeat its last move used. If the affected move runs out of PP, the effect ends. Fails if the target is already under this effect, if it has not made a move, if the move has 0 PP, or if the move is Assist, Blazing Torque, Combat Torque, Copycat, Dynamax Cannon, Encore, Magical Torque, Me First, Metronome, Mimic, Mirror Move, Nature Power, Noxious Torque, Sketch, Sleep Talk, Struggle, Transform, or Wicked Torque.*/
 public class Encore extends PokemonBattleEffect{

/*@Override
 void 3*/
/*@Override
 void true*/
/*@Override
 void onStart(target) {
        let move = target.lastMove;
        if (!move || target.volatiles["dynamax"])
          return false;
        if (move.isMax && move.baseMove)
          move = this.dex.moves.get(move.baseMove);
        const moveIndex = target.moves.indexOf(move.id);
        if (move.isZ || move.flags["failencore"] || !target.moveSlots[moveIndex] || target.moveSlots[moveIndex].pp <= 0) {
          return false;
        }
        this.effectState.move = move.id;
        this.add("-start", Pokemon target, "Encore");
        if (!this.queue.willMove(target)) {
          this.effectState.duration++;
        }
      }*/
/*@Override
 void onOverrideAction(pokemon, Pokemon target, move) {
        if (move.id !== this.effectState.move)
          return this.effectState.move;
      }*/
/*@Override
 void 16*/
/*@Override
 void onResidual(target) {
        if (!target.moves.includes(this.effectState.move) || target.moveSlots[target.moves.indexOf(this.effectState.move)].pp <= 0) {
          target.removeVolatile("encore");
        }
      }*/
/*@Override
 void onEnd(target) {
        this.add("-end", Pokemon target, "Encore");
      }*/
/*@Override
 void onDisableMove(pokemon) {
        if (!this.effectState.move || !pokemon.hasMove(this.effectState.move)) {
          return;
        }
        for (const moveSlot of pokemon.moveSlots) {
          if (moveSlot.id !== this.effectState.move) {
            pokemon.disableMove(moveSlot.id);
          }
        }
      }*/
public Encore(Pokemon pkmn) {
        super(pkmn);
    }
}