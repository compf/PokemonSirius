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
/*The user uses the last move used by the target. The copied move is used against that target, if possible. Fails if the target has not made a move, or if the last move used cannot be copied by this move.*/
 public class Mirror_Move extends PokemonBattleEffect{

/*@Override
 void onTryHit(Pokemon target, pokemon) {
      const move = target.lastMove;
      if (!move?.flags["mirror"] || move.isZ || move.isMax) {
        return false;
      }
      this.actions.useMove(move.id, pokemon, target);
      return null;
    }*/
public Mirror_Move(Pokemon pkmn) {
        super(pkmn);
    }
}