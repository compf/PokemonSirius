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
/*When this Pokemon switches in, it appears as the last unfainted Pokemon in its party until it takes direct damage from another Pokemon's attack. This Pokemon's actual level and HP are displayed instead of those of the mimicked Pokemon.*/
 public class Illusion extends PokemonBattleEffect{

/*@Override
 void onBeforeSwitchIn(pokemon) {
      pokemon.illusion = null;
      for (let i = pokemon.side.pokemon.length - 1; i > pokemon.position; i--) {
        const possibleTarget = pokemon.side.pokemon[i];
        if (!possibleTarget.fainted) {
          if (!pokemon.terastallized || possibleTarget.species.baseSpecies !== "Ogerpon") {
            pokemon.illusion = possibleTarget;
          }
          break;
        }
      }
    }*/
/*@Override
 void onDamagingHit(DamageInformation damage, Pokemon target, Pokemon source, move) {
      if (target.illusion) {
        this.singleEvent("End", this.dex.abilities.get("Illusion"), target.abilityState, target, source, move);
      }
    }*/
/*@Override
 void onEnd(pokemon) {
      if (pokemon.illusion) {
        this.debug("illusion cleared");
        pokemon.illusion = null;
        const details = pokemon.species.name + (pokemon.level === 100 ? "" : ", L" + pokemon.level) + (pokemon.gender === "" ? "" : ", " + pokemon.gender) + (pokemon.set.shiny ? ", shiny" : "");
        this.add("replace", pokemon, details);
        this.add("-end", pokemon, "Illusion");
        if (this.ruleTable.has("illusionlevelmod")) {
          this.hint("Illusion Level Mod is active, so this Pok\xE9mon's true level was hidden.", true);
        }
      }
    }*/
/*@Override
 void onFaint(pokemon) {
      pokemon.illusion = null;
    }*/
public Illusion(Pokemon pkmn) {
        super(pkmn);
    }
}