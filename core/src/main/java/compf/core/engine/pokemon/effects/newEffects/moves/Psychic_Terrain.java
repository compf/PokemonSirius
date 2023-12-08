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
/*For 5 turns, the terrain becomes Psychic Terrain. During the effect, the power of Psychic-type attacks made by grounded Pokemon is multiplied by 1.3 and grounded Pokemon cannot be hit by moves with priority greater than 0, unless the target is an ally. Camouflage transforms the user into a Psychic type, Nature Power becomes Psychic, and Secret Power has a 30% chance to lower the target's Speed by 1 stage. Fails if the current terrain is Psychic Terrain.*/
 public class Psychic_Terrain extends PokemonBattleEffect{

/*@Override
 void 5*/
/*@Override
 void durationCallback(Pokemon source, effect) {
        if (source?.hasItem("terrainextender")) {
          return 8;
        }
        return 5;
      }*/
/*@Override
 void 4*/
/*@Override
 void onTryHit(Pokemon target, Pokemon source, effect) {
        if (effect && (effect.priority <= 0.1 || effect.target === "self")) {
          return;
        }
        if (target.isSemiInvulnerable() || target.isAlly(source))
          return;
        if (!target.isGrounded()) {
          const baseMove = this.dex.moves.get(effect.id);
          if (baseMove.priority > 0) {
            this.hint("Psychic Terrain doesn't affect Pok\xE9mon immune to Ground.");
          }
          return;
        }
        this.add("-activate", target, "move: Psychic Terrain");
        return null;
      }*/
/*@Override
 void 6*/
/*@Override
 void onBasePower(basePower, attacker, defender, move) {
        if (move.type === "Psychic" && attacker.isGrounded() && !attacker.isSemiInvulnerable()) {
          this.debug("psychic terrain boost");
          return this.chainModify([5325, 4096]);
        }
      }*/
/*@Override
 void onFieldStart(field, Pokemon source, effect) {
        if (effect?.effectType === "Ability") {
          this.add("-fieldstart", "move: Psychic Terrain", "[from] ability: " + effect.name, "[of] " + source);
        } else {
          this.add("-fieldstart", "move: Psychic Terrain");
        }
      }*/
/*@Override
 void 27*/
/*@Override
 void 7*/
/*@Override
 void onFieldEnd() {
        this.add("-fieldend", "move: Psychic Terrain");
      }*/
public Psychic_Terrain(Pokemon pkmn) {
        super(pkmn);
    }
}