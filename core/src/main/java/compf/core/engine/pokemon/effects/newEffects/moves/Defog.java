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
/*Lowers the target's evasiveness by 1 stage. If this move is successful and whether or not the target's evasiveness was affected, the effects of Reflect, Light Screen, Aurora Veil, Safeguard, Mist, Spikes, Toxic Spikes, Stealth Rock, and Sticky Web end for the target's side, and the effects of Spikes, Toxic Spikes, Stealth Rock, and Sticky Web end for the user's side. Ignores a target's substitute, although a substitute will still block the lowering of evasiveness. If there is a terrain active and this move is successful, the terrain will be cleared.*/
 public class Defog extends PokemonBattleEffect{

/*@Override
 void onHit(Pokemon target, Pokemon source, move) {
      let success = false;
      if (!target.volatiles["substitute"] || move.infiltrates)
        success = !!this.boost({ evasion: -1 });
      const removeTarget = [
        "reflect",
        "lightscreen",
        "auroraveil",
        "safeguard",
        "mist",
        "spikes",
        "toxicspikes",
        "stealthrock",
        "stickyweb",
        "gmaxsteelsurge"
      ];
      const removeAll = [
        "spikes",
        "toxicspikes",
        "stealthrock",
        "stickyweb",
        "gmaxsteelsurge"
      ];
      for (const targetCondition of removeTarget) {
        if (target.side.removeSideCondition(targetCondition)) {
          if (!removeAll.includes(targetCondition))
            continue;
          this.add("-sideend", target.side, this.dex.conditions.get(targetCondition).name, "[from] move: Defog", "[of] " + source);
          success = true;
        }
      }
      for (const sideCondition of removeAll) {
        if (source.side.removeSideCondition(sideCondition)) {
          this.add("-sideend", source.side, this.dex.conditions.get(sideCondition).name, "[from] move: Defog", "[of] " + source);
          success = true;
        }
      }
      this.field.clearTerrain();
      return success;
    }*/
public Defog(Pokemon pkmn) {
        super(pkmn);
    }
}