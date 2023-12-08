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
/*If Sunny Day is active or this Pokemon uses a held Booster Energy, this Pokemon's highest stat is multiplied by 1.3, or by 1.5 if the highest stat is Speed. Stat stage changes are considered at the time this Ability activates. If multiple stats are tied, Attack, Defense, Special Attack, Special Defense, and Speed are prioritized in that order. If this effect was started by Sunny Day, a held Booster Energy will not activate and the effect ends when Sunny Day is no longer active. If this effect was started by a held Booster Energy, it ends when this Pokemon is no longer active.*/
 public class Protosynthesis extends PokemonBattleEffect{

/*@Override
 void onStart(pokemon, Pokemon source, effect) {
        if (effect?.name === "Booster Energy") {
          this.effectState.fromBooster = true;
          this.add("-activate", pokemon, "ability: Protosynthesis", "[fromitem]");
        } else {
          this.add("-activate", pokemon, "ability: Protosynthesis");
        }
        this.effectState.bestStat = pokemon.getBestStat(false, true);
        this.add("-start", pokemon, "protosynthesis" + this.effectState.bestStat);
      }*/
/*@Override
 void onWeatherChange(pokemon) {
      if (pokemon.transformed)
        return;
      if (this.field.isWeather("sunnyday")) {
        pokemon.addVolatile("protosynthesis");
      } else if (!pokemon.volatiles["protosynthesis"]?.fromBooster) {
        pokemon.removeVolatile("protosynthesis");
      }
    }*/
/*@Override
 void onEnd(pokemon) {
        this.add("-end", pokemon, "Protosynthesis");
      }*/
/*@Override
 void true*/
/*@Override
 void 5*/
/*@Override
 void onModifyAtk(atk, Pokemon source, Pokemon target, move) {
        if (this.effectState.bestStat !== "atk")
          return;
        this.debug("Protosynthesis atk boost");
        return this.chainModify([5325, 4096]);
      }*/
/*@Override
 void 6*/
/*@Override
 void onModifyDef(def, Pokemon target, Pokemon source, move) {
        if (this.effectState.bestStat !== "def")
          return;
        this.debug("Protosynthesis def boost");
        return this.chainModify([5325, 4096]);
      }*/
/*@Override
 void 5*/
/*@Override
 void onModifySpA(relayVar, Pokemon source, Pokemon target, move) {
        if (this.effectState.bestStat !== "spa")
          return;
        this.debug("Protosynthesis spa boost");
        return this.chainModify([5325, 4096]);
      }*/
/*@Override
 void 6*/
/*@Override
 void onModifySpD(relayVar, Pokemon target, Pokemon source, move) {
        if (this.effectState.bestStat !== "spd")
          return;
        this.debug("Protosynthesis spd boost");
        return this.chainModify([5325, 4096]);
      }*/
/*@Override
 void onModifySpe(spe, pokemon) {
        if (this.effectState.bestStat !== "spe")
          return;
        this.debug("Protosynthesis spe boost");
        return this.chainModify(1.5);
      }*/
public Protosynthesis(Pokemon pkmn) {
        super(pkmn);
    }
}