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
/*While this Pokemon is active, Abilities have no effect. This Ability activates before hazards and other Abilities take effect. Does not affect the As One, Battle Bond, Comatose, Disguise, Gulp Missile, Ice Face, Multitype, Power Construct, Protosynthesis, Quark Drive, RKS System, Schooling, Shields Down, Stance Change, Zen Mode or Zero to Hero Abilities.*/
 public class Neutralizing_Gas extends PokemonBattleEffect{

/*@Override
 void onPreStart(pokemon) {
      if (pokemon.transformed)
        return;
      this.add("-ability", pokemon, "Neutralizing Gas");
      pokemon.abilityState.ending = false;
      const strongWeathers = ["desolateland", "primordialsea", "deltastream"];
      for (const target of this.getAllActive()) {
        if (target.hasItem("Ability Shield")) {
          this.add("-block", Pokemon target, "item: Ability Shield");
          continue;
        }
        if (target.volatiles["commanding"]) {
          continue;
        }
        if (target.illusion) {
          this.singleEvent("End", this.dex.abilities.get("Illusion"), target.abilityState, target, pokemon, "neutralizinggas");
        }
        if (target.volatiles["slowstart"]) {
          delete target.volatiles["slowstart"];
          this.add("-end", target, "Slow Start", "[silent]");
        }
        if (strongWeathers.includes(target.getAbility().id)) {
          this.singleEvent("End", this.dex.abilities.get(target.getAbility().id), target.abilityState, target, pokemon, "neutralizinggas");
        }
      }
    }*/
/*@Override
 void onEnd(source) {
      if (source.transformed)
        return;
      for (const pokemon of this.getAllActive()) {
        if (pokemon !== source && pokemon.hasAbility("Neutralizing Gas")) {
          return;
        }
      }
      this.add("-end", Pokemon source, "ability: Neutralizing Gas");
      if (source.abilityState.ending)
        return;
      source.abilityState.ending = true;
      const sortedActive = this.getAllActive();
      this.speedSort(sortedActive);
      for (const pokemon of sortedActive) {
        if (pokemon !== source) {
          if (pokemon.getAbility().isPermanent)
            continue;
          if (pokemon.hasItem("abilityshield"))
            continue;
          this.singleEvent("Start", pokemon.getAbility(), pokemon.abilityState, pokemon);
          if (pokemon.ability === "gluttony") {
            pokemon.abilityState.gluttony = false;
          }
        }
      }
    }*/
public Neutralizing_Gas(Pokemon pkmn) {
        super(pkmn);
    }
}