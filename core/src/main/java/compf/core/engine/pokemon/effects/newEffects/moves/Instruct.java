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
/*The target immediately uses its last used move. Fails if the target has not made a move, if the move has 0 PP, if the target is preparing to use Beak Blast, Focus Punch, or Shell Trap, or if the move is Assist, Beak Blast, Belch, Bide, Blazing Torque, Celebrate, Chatter, Combat Torque, Copycat, Dynamax Cannon, Focus Punch, Hold Hands, Ice Ball, Instruct, King's Shield, Magical Torque, Me First, Metronome, Mimic, Mirror Move, Nature Power, Noxious Torque, Obstruct, Outrage, Petal Dance, Rollout, Shell Trap, Sketch, Sleep Talk, Struggle, Thrash, Transform, Uproar, Wicked Torque, any two-turn move, or any recharge move.*/
 public class Instruct extends PokemonBattleEffect{

/*@Override
 void onHit(Pokemon target, source) {
      if (!target.lastMove || target.volatiles["dynamax"])
        return false;
      const lastMove = target.lastMove;
      const moveIndex = target.moves.indexOf(lastMove.id);
      if (lastMove.flags["failinstruct"] || lastMove.isZ || lastMove.isMax || lastMove.flags["charge"] || lastMove.flags["recharge"] || target.volatiles["beakblast"] || target.volatiles["focuspunch"] || target.volatiles["shelltrap"] || target.moveSlots[moveIndex] && target.moveSlots[moveIndex].pp <= 0) {
        return false;
      }
      this.add("-singleturn", target, "move: Instruct", "[of] " + source);
      this.queue.prioritizeAction(this.queue.resolveAction({
        choice: "move",
        pokemon: target,
        moveid: target.lastMove.id,
        targetLoc: target.lastMoveTargetLoc
      })[0]);
    }*/
public Instruct(Pokemon pkmn) {
        super(pkmn);
    }
}