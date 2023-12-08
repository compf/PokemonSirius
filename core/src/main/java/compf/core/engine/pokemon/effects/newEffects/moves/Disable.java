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
/*For 4 turns, the target's last move used becomes disabled. Fails if one of the target's moves is already disabled, if the target has not made a move, if the target no longer knows the move, or if the move was a Max or G-Max Move.*/
 public class Disable extends PokemonBattleEffect{

/*@Override
 void onTryHit(target) {
      if (!target.lastMove || target.lastMove.isZ || target.lastMove.isMax || target.lastMove.id === "struggle") {
        return false;
      }
    }*/
/*@Override
 void 5*/
/*@Override
 void true*/
/*@Override
 void onStart(pokemon, Pokemon source, effect) {
        if (this.queue.willMove(pokemon) || pokemon === this.activePokemon && this.activeMove && !this.activeMove.isExternal) {
          this.effectState.duration--;
        }
        if (!pokemon.lastMove) {
          this.debug(`Pokemon hasn't moved yet`);
          return false;
        }
        for (const moveSlot of pokemon.moveSlots) {
          if (moveSlot.id === pokemon.lastMove.id) {
            if (!moveSlot.pp) {
              this.debug("Move out of PP");
              return false;
            }
          }
        }
        if (effect.effectType === "Ability") {
          this.add("-start", pokemon, "Disable", pokemon.lastMove.name, "[from] ability: Cursed Body", "[of] " + source);
        } else {
          this.add("-start", pokemon, "Disable", pokemon.lastMove.name);
        }
        this.effectState.move = pokemon.lastMove.id;
      }*/
/*@Override
 void 17*/
/*@Override
 void onEnd(pokemon) {
        this.add("-end", pokemon, "Disable");
      }*/
/*@Override
 void 7*/
/*@Override
 void onBeforeMove(attacker, defender, move) {
        if (!move.isZ && move.id === this.effectState.move) {
          this.add("cant", attacker, "Disable", move);
          return false;
        }
      }*/
/*@Override
 void onDisableMove(pokemon) {
        for (const moveSlot of pokemon.moveSlots) {
          if (moveSlot.id === this.effectState.move) {
            pokemon.disableMove(moveSlot.id);
          }
        }
      }*/
public Disable(Pokemon pkmn) {
        super(pkmn);
    }
}