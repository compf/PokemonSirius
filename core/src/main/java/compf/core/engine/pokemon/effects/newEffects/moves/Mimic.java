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
/*While the user remains active, this move is replaced by the last move used by the target. The copied move has the maximum PP for that move. Fails if the target has not made a move, if the user has Transformed, if the user already knows the move, or if the move is Assist, Behemoth Bash, Behemoth Blade, Belch, Blazing Torque, Celebrate, Chatter, Combat Torque, Copycat, Dynamax Cannon, Hold Hands, Magical Torque, Me First, Metronome, Mimic, Mirror Move, Nature Power, Noxious Torque, Sketch, Sleep Talk, Struggle, Transform, or Wicked Torque.*/
 public class Mimic extends PokemonBattleEffect{

/*@Override
 void onHit(Pokemon target, source) {
      const move = target.lastMove;
      if (source.transformed || !move || move.flags["failmimic"] || source.moves.includes(move.id)) {
        return false;
      }
      if (move.isZ || move.isMax)
        return false;
      const mimicIndex = source.moves.indexOf("mimic");
      if (mimicIndex < 0)
        return false;
      source.moveSlots[mimicIndex] = {
        move: move.name,
        id: move.id,
        pp: move.pp,
        maxpp: move.pp,
        target: move.target,
        disabled: false,
        used: false,
        virtual: true
      };
      this.add("-start", Pokemon source, "Mimic", move.name);
    }*/
public Mimic(Pokemon pkmn) {
        super(pkmn);
    }
}