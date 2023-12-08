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
/*This move is permanently replaced by the last move used by the target. The copied move has the maximum PP for that move. Fails if the target has not made a move, if the user has Transformed, or if the move is Chatter, Sketch, Struggle, or any move the user knows.*/
 public class Sketch extends PokemonBattleEffect{

/*@Override
 void onHit(Pokemon target, source) {
      const disallowedMoves = ["chatter", "sketch", "struggle"];
      const move = target.lastMove;
      if (source.transformed || !move || source.moves.includes(move.id))
        return false;
      if (disallowedMoves.includes(move.id) || move.isZ || move.isMax)
        return false;
      const sketchIndex = source.moves.indexOf("sketch");
      if (sketchIndex < 0)
        return false;
      const sketchedMove = {
        move: move.name,
        id: move.id,
        pp: move.pp,
        maxpp: move.pp,
        target: move.target,
        disabled: false,
        used: false
      };
      source.moveSlots[sketchIndex] = sketchedMove;
      source.baseMoveSlots[sketchIndex] = sketchedMove;
      this.add("-activate", Pokemon source, "move: Sketch", move.name);
    }*/
public Sketch(Pokemon pkmn) {
        super(pkmn);
    }
}