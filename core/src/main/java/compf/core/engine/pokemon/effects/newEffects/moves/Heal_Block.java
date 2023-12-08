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
/*For 5 turns, the target is prevented from restoring any HP as long as it remains active. During the effect, healing and draining moves are unusable, and Abilities and items that grant healing will not heal the user. If an affected Pokemon uses Baton Pass, the replacement will remain unable to restore its HP. Pain Split and the Regenerator Ability are unaffected.*/
 public class Heal_Block extends PokemonBattleEffect{

/*@Override
 void 5*/
/*@Override
 void durationCallback(Pokemon target, Pokemon source, effect) {
        if (source?.hasAbility("persistent")) {
          this.add("-activate", source, "ability: Persistent", "[move] Heal Block");
          return 7;
        }
        return 5;
      }*/
/*@Override
 void onStart(pokemon, source) {
        this.add("-start", pokemon, "move: Heal Block");
        source.moveThisTurnResult = true;
      }*/
/*@Override
 void onDisableMove(pokemon) {
        for (const moveSlot of pokemon.moveSlots) {
          if (this.dex.moves.get(moveSlot.id).flags["heal"]) {
            pokemon.disableMove(moveSlot.id);
          }
        }
      }*/
/*@Override
 void 6*/
/*@Override
 void onBeforeMove(pokemon, Pokemon target, move) {
        if (move.flags["heal"] && !move.isZ && !move.isMax) {
          this.add("cant", pokemon, "move: Heal Block", move);
          return false;
        }
      }*/
/*@Override
 void onModifyMove(Move move, pokemon, target) {
        if (move.flags["heal"] && !move.isZ && !move.isMax) {
          this.add("cant", pokemon, "move: Heal Block", move);
          return false;
        }
      }*/
/*@Override
 void 20*/
/*@Override
 void onEnd(pokemon) {
        this.add("-end", pokemon, "move: Heal Block");
      }*/
/*@Override
 void onTryHeal(DamageInformation damage, Pokemon target, Pokemon source, effect) {
        if (effect?.id === "zpower" || this.effectState.isZ)
          return damage;
        return false;
      }*/
/*@Override
 void onRestart(Pokemon target, source) {
        this.add("-fail", target, "move: Heal Block");
        if (!source.moveThisTurnResult) {
          source.moveThisTurnResult = false;
        }
      }*/
public Heal_Block(Pokemon pkmn) {
        super(pkmn);
    }
}