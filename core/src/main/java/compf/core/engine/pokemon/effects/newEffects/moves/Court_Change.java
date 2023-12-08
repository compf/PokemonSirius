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
/*Switches the Mist, Light Screen, Reflect, Spikes, Safeguard, Tailwind, Toxic Spikes, Stealth Rock, Water Pledge, Fire Pledge, Grass Pledge, Sticky Web, Aurora Veil, G-Max Steelsurge, G-Max Cannonade, G-Max Vine Lash, and G-Max Wildfire effects from the user's side to the opposing side and vice versa.*/
 public class Court_Change extends PokemonBattleEffect{

/*@Override
 void onHitField(Pokemon target, source) {
      const sideConditions = [
        "mist",
        "lightscreen",
        "reflect",
        "spikes",
        "safeguard",
        "tailwind",
        "toxicspikes",
        "stealthrock",
        "waterpledge",
        "firepledge",
        "grasspledge",
        "stickyweb",
        "auroraveil",
        "gmaxsteelsurge",
        "gmaxcannonade",
        "gmaxvinelash",
        "gmaxwildfire"
      ];
      let success = false;
      if (this.gameType === "freeforall") {
        const offset = this.random(3) + 1;
        const sides = [this.sides[0], this.sides[2], this.sides[1], this.sides[3]];
        const temp = { 0: {}, 1: {}, 2: {}, 3: {} };
        for (const side of sides) {
          for (const id in side.sideConditions) {
            if (!sideConditions.includes(id))
              continue;
            temp[side.n][id] = side.sideConditions[id];
            delete side.sideConditions[id];
            const effectName = this.dex.conditions.get(id).name;
            this.add("-sideend", side, effectName, "[silent]");
            success = true;
          }
        }
        for (let i = 0; i < 4; i++) {
          const sourceSideConditions = temp[sides[i].n];
          const targetSide = sides[(i + offset) % 4];
          for (const id in sourceSideConditions) {
            targetSide.sideConditions[id] = sourceSideConditions[id];
            const effectName = this.dex.conditions.get(id).name;
            let layers = sourceSideConditions[id].layers || 1;
            for (; layers > 0; layers--)
              this.add("-sidestart", targetSide, effectName, "[silent]");
          }
        }
      } else {
        const sourceSideConditions = source.side.sideConditions;
        const targetSideConditions = source.side.foe.sideConditions;
        const sourceTemp = {};
        const targetTemp = {};
        for (const id in sourceSideConditions) {
          if (!sideConditions.includes(id))
            continue;
          sourceTemp[id] = sourceSideConditions[id];
          delete sourceSideConditions[id];
          success = true;
        }
        for (const id in targetSideConditions) {
          if (!sideConditions.includes(id))
            continue;
          targetTemp[id] = targetSideConditions[id];
          delete targetSideConditions[id];
          success = true;
        }
        for (const id in sourceTemp) {
          targetSideConditions[id] = sourceTemp[id];
        }
        for (const id in targetTemp) {
          sourceSideConditions[id] = targetTemp[id];
        }
        this.add("-swapsideconditions");
      }
      if (!success)
        return false;
      this.add("-activate", Pokemon source, "move: Court Change");
    }*/
public Court_Change(Pokemon pkmn) {
        super(pkmn);
    }
}