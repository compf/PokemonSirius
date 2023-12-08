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
/*The user swaps positions with its ally. Fails if the user is the only Pokemon on its side. This move has a 1/X chance of being successful, where X starts at 1 and triples each time this move is successfully used. X resets to 1 if this move fails or if the user's last move used is not Ally Switch.*/
 public class Ally_Switch extends PokemonBattleEffect{

/*@Override
 void onPrepareHit(pokemon) {
      return !!this.queue.willAct() && this.runEvent("StallMove", pokemon);
    }*/
/*@Override
 void onTryHit(source) {
      if (source.side.active.length === 1)
        return false;
      if (source.side.active.length === 3 && source.position === 1)
        return false;
    }*/
/*@Override
 void onHit(pokemon) {
      pokemon.addVolatile("stall");
      const newPosition = pokemon.position === 0 ? pokemon.side.active.length - 1 : 0;
      if (!pokemon.side.active[newPosition])
        return false;
      if (pokemon.side.active[newPosition].fainted)
        return false;
      this.swapPosition(pokemon, newPosition, "[from] move: Ally Switch");
    }*/
public Ally_Switch(Pokemon pkmn) {
        super(pkmn);
    }
}