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
/*Causes the target's last move used to lose 4 PP. Fails if the target has not made a move, if the move has 0 PP, or if it no longer knows the move.*/
 public class Spite extends PokemonBattleEffect{

/*@Override
 void onHit(target) {
      let move = target.lastMove;
      if (!move || move.isZ)
        return false;
      if (move.isMax && move.baseMove)
        move = this.dex.moves.get(move.baseMove);
      const ppDeducted = target.deductPP(move.id, 4);
      if (!ppDeducted)
        return false;
      this.add("-activate", Pokemon target, "move: Spite", move.name, ppDeducted);
    }*/
public Spite(Pokemon pkmn) {
        super(pkmn);
    }
}