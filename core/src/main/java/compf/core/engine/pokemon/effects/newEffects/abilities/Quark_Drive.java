package compf.core.engine.pokemon.effects.newEffects.abilities;

import compf.core.engine.BattleAction;
    import compf.core.engine.pokemon.PokemonStat;
    import compf.core.engine.pokemon.Pokemon;
    import compf.core.engine.pokemon.effects.EffectParam;
    import compf.core.engine.pokemon.effects.PokemonBattleEffect;
    import compf.core.engine.pokemon.moves.DamageInformation;
    import compf.core.engine.pokemon.moves.Schedule;
    import compf.core.engine.pokemon.moves.Schedule.ScheduleItem;
    import compf.core.etc.services.SharedInformation;
/*If Electric Terrain is active or this Pokemon uses a held Booster Energy, this Pokemon's highest stat is multiplied by 1.3, or by 1.5 if the highest stat is Speed. Stat stage changes are considered at the time this Ability activates. If multiple stats are tied, Attack, Defense, Special Attack, Special Defense, and Speed are prioritized in that order. If this effect was started by Electric Terrain, a held Booster Energy will not activate and the effect ends when Electric Terrain is no longer active. If this effect was started by a held Booster Energy, it ends when this Pokemon is no longer active.*/
 public class Quark_Drive extends PokemonBattleEffect{

/*@Override
 void onStart(pokemon, Pokemon source, effect) {
        if (effect?.name === "Booster Energy") {
          this.effectState.fromBooster = true;
          this.add("-activate", pokemon, "ability: Quark Drive", "[fromitem]");
        } else {
          this.add("-activate", pokemon, "ability: Quark Drive");
        }
        this.effectState.bestStat = pokemon.getBestStat(false, true);
        this.add("-start", pokemon, "quarkdrive" + this.effectState.bestStat);
      }*/
/*@Override
 void onTerrainChange(pokemon) {
      if (pokemon.transformed)
        return;
      if (this.field.isTerrain("electricterrain")) {
        pokemon.addVolatile("quarkdrive");
      } else if (!pokemon.volatiles["quarkdrive"]?.fromBooster) {
        pokemon.removeVolatile("quarkdrive");
      }
    }*/
/*@Override
 void onEnd(pokemon) {
        this.add("-end", pokemon, "Quark Drive");
      }*/
/*@Override
 void true*/
/*@Override
 void 5*/
/*@Override
 void onModifyAtk(atk, Pokemon source, Pokemon target, move) {
        if (this.effectState.bestStat !== "atk")
          return;
        this.debug("Quark Drive atk boost");
        return this.chainModify([5325, 4096]);
      }*/
/*@Override
 void 6*/
/*@Override
 void onModifyDef(def, Pokemon target, Pokemon source, move) {
        if (this.effectState.bestStat !== "def")
          return;
        this.debug("Quark Drive def boost");
        return this.chainModify([5325, 4096]);
      }*/
/*@Override
 void 5*/
/*@Override
 void onModifySpA(relayVar, Pokemon source, Pokemon target, move) {
        if (this.effectState.bestStat !== "spa")
          return;
        this.debug("Quark Drive spa boost");
        return this.chainModify([5325, 4096]);
      }*/
/*@Override
 void 6*/
/*@Override
 void onModifySpD(relayVar, Pokemon target, Pokemon source, move) {
        if (this.effectState.bestStat !== "spd")
          return;
        this.debug("Quark Drive spd boost");
        return this.chainModify([5325, 4096]);
      }*/
/*@Override
 void onModifySpe(spe, pokemon) {
        if (this.effectState.bestStat !== "spe")
          return;
        this.debug("Quark Drive spe boost");
        return this.chainModify(1.5);
      }*/
public Quark_Drive(Pokemon pkmn) {
        super(pkmn);
    }
}