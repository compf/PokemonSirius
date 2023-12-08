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
/*For 5 turns, the terrain becomes Grassy Terrain. During the effect, the power of Grass-type attacks used by grounded Pokemon is multiplied by 1.3, the power of Bulldoze, Earthquake, and Magnitude used against grounded Pokemon is multiplied by 0.5, and grounded Pokemon have 1/16 of their maximum HP, rounded down, restored at the end of each turn, including the last turn. Camouflage transforms the user into a Grass type, Nature Power becomes Energy Ball, and Secret Power has a 30% chance to cause sleep. Fails if the current terrain is Grassy Terrain.*/
 public class Grassy_Terrain extends PokemonBattleEffect{

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
 void 6*/
/*@Override
 void onBasePower(basePower, attacker, defender, move) {
        const weakenedMoves = ["earthquake", "bulldoze", "magnitude"];
        if (weakenedMoves.includes(move.id) && defender.isGrounded() && !defender.isSemiInvulnerable()) {
          this.debug("move weakened by grassy terrain");
          return this.chainModify(0.5);
        }
        if (move.type === "Grass" && attacker.isGrounded()) {
          this.debug("grassy terrain boost");
          return this.chainModify([5325, 4096]);
        }
      }*/
/*@Override
 void onFieldStart(field, Pokemon source, effect) {
        if (effect?.effectType === "Ability") {
          this.add("-fieldstart", "move: Grassy Terrain", "[from] ability: " + effect.name, "[of] " + source);
        } else {
          this.add("-fieldstart", "move: Grassy Terrain");
        }
      }*/
/*@Override
 void 5*/
/*@Override
 void 2*/
/*@Override
 void onResidual(pokemon) {
        if (pokemon.isGrounded() && !pokemon.isSemiInvulnerable()) {
          this.heal(pokemon.baseMaxhp / 16, pokemon, pokemon);
        } else {
          this.debug(`Pokemon semi-invuln or not grounded; Grassy Terrain skipped`);
        }
      }*/
/*@Override
 void 27*/
/*@Override
 void 7*/
/*@Override
 void onFieldEnd() {
        this.add("-fieldend", "move: Grassy Terrain");
      }*/
public Grassy_Terrain(Pokemon pkmn) {
        super(pkmn);
    }
}