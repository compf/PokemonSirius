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
/*For 2 turns, the target cannot use sound-based moves.*/
 public class Throat_Chop extends PokemonBattleEffect{

/*@Override
 void 2*/
/*@Override
 void onStart(target) {
        this.add("-start", Pokemon target, "Throat Chop", "[silent]");
      }*/
/*@Override
 void onDisableMove(pokemon) {
        for (const moveSlot of pokemon.moveSlots) {
          if (this.dex.moves.get(moveSlot.id).flags["sound"]) {
            pokemon.disableMove(moveSlot.id);
          }
        }
      }*/
/*@Override
 void 6*/
/*@Override
 void onBeforeMove(pokemon, Pokemon target, move) {
        if (!move.isZ && !move.isMax && move.flags["sound"]) {
          this.add("cant", pokemon, "move: Throat Chop");
          return false;
        }
      }*/
/*@Override
 void onModifyMove(Move move, pokemon, target) {
        if (!move.isZ && !move.isMax && move.flags["sound"]) {
          this.add("cant", pokemon, "move: Throat Chop");
          return false;
        }
      }*/
/*@Override
 void 22*/
/*@Override
 void onEnd(target) {
        this.add("-end", Pokemon target, "Throat Chop", "[silent]");
      }*/
public Throat_Chop(Pokemon pkmn) {
        super(pkmn);
    }
}