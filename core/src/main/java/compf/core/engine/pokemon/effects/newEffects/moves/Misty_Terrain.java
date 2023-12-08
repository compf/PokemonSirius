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
/*For 5 turns, the terrain becomes Misty Terrain. During the effect, the power of Dragon-type attacks used against grounded Pokemon is multiplied by 0.5 and grounded Pokemon cannot be inflicted with a non-volatile status condition nor confusion. Grounded Pokemon can become affected by Yawn but cannot fall asleep from its effect. Camouflage transforms the user into a Fairy type, Nature Power becomes Moonblast, and Secret Power has a 30% chance to lower Special Attack by 1 stage. Fails if the current terrain is Misty Terrain.*/
 public class Misty_Terrain extends PokemonBattleEffect{

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
        if (!target.isGrounded() || target.isSemiInvulnerable())
          return;
        if (effect && (effect.status || effect.id === "yawn")) {
          this.add("-activate", target, "move: Misty Terrain");
        }
        return false;
      }*/
/*@Override
 void onTryAddVolatile(status, Pokemon target, Pokemon source, effect) {
        if (!target.isGrounded() || target.isSemiInvulnerable())
          return;
        if (status.id === "confusion") {
          if (effect.effectType === "Move" && !effect.secondaries)
            this.add("-activate", target, "move: Misty Terrain");
          return null;
        }
      }*/
/*@Override
 void 6*/
/*@Override
 void onBasePower(basePower, attacker, defender, move) {
        if (move.type === "Dragon" && defender.isGrounded() && !defender.isSemiInvulnerable()) {
          this.debug("misty terrain weaken");
          return this.chainModify(0.5);
        }
      }*/
/*@Override
 void onFieldStart(field, Pokemon source, effect) {
        if (effect?.effectType === "Ability") {
          this.add("-fieldstart", "move: Misty Terrain", "[from] ability: " + effect.name, "[of] " + source);
        } else {
          this.add("-fieldstart", "move: Misty Terrain");
        }
      }*/
/*@Override
 void 27*/
/*@Override
 void 7*/
/*@Override
 void onFieldEnd() {
        this.add("-fieldend", "Misty Terrain");
      }*/
public Misty_Terrain(Pokemon pkmn) {
        super(pkmn);
    }
}