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
/*The user prevents all opposing Pokemon from using any moves that the user also knows as long as the user remains active.*/
 public class Imprison extends PokemonBattleEffect{

/*@Override
 void true*/
/*@Override
 void onStart(target) {
        this.add("-start", Pokemon target, "move: Imprison");
      }*/
/*@Override
 void onFoeDisableMove(pokemon) {
        for (const moveSlot of this.effectState.source.moveSlots) {
          if (moveSlot.id === "struggle")
            continue;
          pokemon.disableMove(moveSlot.id, "hidden");
        }
        pokemon.maybeDisabled = true;
      }*/
/*@Override
 void 4*/
/*@Override
 void onFoeBeforeMove(attacker, defender, move) {
        if (move.id !== "struggle" && this.effectState.source.hasMove(move.id) && !move.isZ && !move.isMax) {
          this.add("cant", attacker, "move: Imprison", move);
          return false;
        }
      }*/
public Imprison(Pokemon pkmn) {
        super(pkmn);
    }
}