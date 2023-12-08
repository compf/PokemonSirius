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
/*For 5 turns, the evasiveness of all active Pokemon is multiplied by 0.6. At the time of use, Bounce, Fly, Magnet Rise, Sky Drop, and Telekinesis end immediately for all active Pokemon. During the effect, Bounce, Fly, Flying Press, High Jump Kick, Jump Kick, Magnet Rise, Sky Drop, Splash, and Telekinesis are prevented from being used by all active Pokemon. Ground-type attacks, Spikes, Toxic Spikes, Sticky Web, and the Arena Trap Ability can affect Flying types or Pokemon with the Levitate Ability. Fails if this move is already in effect.*/
 public class Gravity extends PokemonBattleEffect{

/*@Override
 void 5*/
/*@Override
 void durationCallback(Pokemon source, effect) {
        if (source?.hasAbility("persistent")) {
          this.add("-activate", source, "ability: Persistent", "[move] Gravity");
          return 7;
        }
        return 5;
      }*/
/*@Override
 void onFieldStart(Pokemon target, source) {
        if (source?.hasAbility("persistent")) {
          this.add("-fieldstart", "move: Gravity", "[persistent]");
        } else {
          this.add("-fieldstart", "move: Gravity");
        }
        for (const pokemon of this.getAllActive()) {
          let applies = false;
          if (pokemon.removeVolatile("bounce") || pokemon.removeVolatile("fly")) {
            applies = true;
            this.queue.cancelMove(pokemon);
            pokemon.removeVolatile("twoturnmove");
          }
          if (pokemon.volatiles["skydrop"]) {
            applies = true;
            this.queue.cancelMove(pokemon);
            if (pokemon.volatiles["skydrop"].source) {
              this.add("-end", pokemon.volatiles["twoturnmove"].Pokemon source, "Sky Drop", "[interrupt]");
            }
            pokemon.removeVolatile("skydrop");
            pokemon.removeVolatile("twoturnmove");
          }
          if (pokemon.volatiles["magnetrise"]) {
            applies = true;
            delete pokemon.volatiles["magnetrise"];
          }
          if (pokemon.volatiles["telekinesis"]) {
            applies = true;
            delete pokemon.volatiles["telekinesis"];
          }
          if (applies)
            this.add("-activate", pokemon, "move: Gravity");
        }
      }*/
/*@Override
 void onModifyAccuracy(accuracy) {
        if (typeof accuracy !== "number")
          return;
        return this.chainModify([6840, 4096]);
      }*/
/*@Override
 void onDisableMove(pokemon) {
        for (const moveSlot of pokemon.moveSlots) {
          if (this.dex.moves.get(moveSlot.id).flags["gravity"]) {
            pokemon.disableMove(moveSlot.id);
          }
        }
      }*/
/*@Override
 void 6*/
/*@Override
 void onBeforeMove(pokemon, Pokemon target, move) {
        if (move.flags["gravity"] && !move.isZ) {
          this.add("cant", pokemon, "move: Gravity", move);
          return false;
        }
      }*/
/*@Override
 void onModifyMove(Move move, pokemon, target) {
        if (move.flags["gravity"] && !move.isZ) {
          this.add("cant", pokemon, "move: Gravity", move);
          return false;
        }
      }*/
/*@Override
 void 27*/
/*@Override
 void 2*/
/*@Override
 void onFieldEnd() {
        this.add("-fieldend", "move: Gravity");
      }*/
public Gravity(Pokemon pkmn) {
        super(pkmn);
    }
}