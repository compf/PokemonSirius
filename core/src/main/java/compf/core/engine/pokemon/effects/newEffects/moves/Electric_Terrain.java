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
/*For 5 turns, the terrain becomes Electric Terrain. During the effect, the power of Electric-type attacks made by grounded Pokemon is multiplied by 1.3 and grounded Pokemon cannot fall asleep; Pokemon already asleep do not wake up. Grounded Pokemon cannot become affected by Yawn or fall asleep from its effect. Camouflage transforms the user into an Electric type, Nature Power becomes Thunderbolt, and Secret Power has a 30% chance to cause paralysis. Fails if the current terrain is Electric Terrain.*/
 public class Electric_Terrain extends PokemonBattleEffect{

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
 void onSetStatus(status, Pokemon target, Pokemon source, effect) {
        if (status.id === "slp" && target.isGrounded() && !target.isSemiInvulnerable()) {
          if (effect.id === "yawn" || effect.effectType === "Move" && !effect.secondaries) {
            this.add("-activate", target, "move: Electric Terrain");
          }
          return false;
        }
      }*/
/*@Override
 void onTryAddVolatile(status, target) {
        if (!target.isGrounded() || target.isSemiInvulnerable())
          return;
        if (status.id === "yawn") {
          this.add("-activate", Pokemon target, "move: Electric Terrain");
          return null;
        }
      }*/
/*@Override
 void 6*/
/*@Override
 void onBasePower(basePower, attacker, defender, move) {
        if (move.type === "Electric" && attacker.isGrounded() && !attacker.isSemiInvulnerable()) {
          this.debug("electric terrain boost");
          return this.chainModify([5325, 4096]);
        }
      }*/
/*@Override
 void onFieldStart(field, Pokemon source, effect) {
        if (effect?.effectType === "Ability") {
          this.add("-fieldstart", "move: Electric Terrain", "[from] ability: " + effect.name, "[of] " + source);
        } else {
          this.add("-fieldstart", "move: Electric Terrain");
        }
      }*/
/*@Override
 void 27*/
/*@Override
 void 7*/
/*@Override
 void onFieldEnd() {
        this.add("-fieldend", "move: Electric Terrain");
      }*/
public Electric_Terrain(Pokemon pkmn) {
        super(pkmn);
    }
}