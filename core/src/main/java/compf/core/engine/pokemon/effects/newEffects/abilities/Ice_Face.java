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
/*If this Pokemon is an Eiscue, the first physical hit it takes in battle deals 0 neutral damage. Its ice face is then broken and it changes forme to Noice Face. Eiscue regains its Ice Face forme when Snow begins or when Eiscue switches in while Snow is active. Confusion damage also breaks the ice face.*/
 public class Ice_Face extends PokemonBattleEffect{

/*@Override
 void onStart(pokemon) {
      if (this.field.isWeather(["hail", "snow"]) && pokemon.species.id === "eiscuenoice" && !pokemon.transformed) {
        this.add("-activate", pokemon, "ability: Ice Face");
        this.effectState.busted = false;
        pokemon.formeChange("Eiscue", this.effect, true);
      }
    }*/
/*@Override
 void onDamage(DamageInformation damage, Pokemon target, Pokemon source, effect) {
      if (effect && effect.effectType === "Move" && effect.category === "Physical" && target.species.id === "eiscue" && !target.transformed) {
        this.add("-activate", target, "ability: Ice Face");
        this.effectState.busted = true;
        return 0;
      }
    }*/
/*@Override
 void onCriticalHit(Pokemon target, type, move) {
      if (!target)
        return;
      if (move.category !== "Physical" || target.species.id !== "eiscue" || target.transformed)
        return;
      if (target.volatiles["substitute"] && !(move.flags["bypasssub"] || move.infiltrates))
        return;
      if (!target.runImmunity(move.type))
        return;
      return false;
    }*/
/*@Override
 void onEffectiveness(typeMod, Pokemon target, type, move) {
      if (!target)
        return;
      if (move.category !== "Physical" || target.species.id !== "eiscue" || target.transformed)
        return;
      const hitSub = target.volatiles["substitute"] && !move.flags["bypasssub"] && !(move.infiltrates && this.gen >= 6);
      if (hitSub)
        return;
      if (!target.runImmunity(move.type))
        return;
      return 0;
    }*/
/*@Override
 void onUpdate(pokemon) {
      if (pokemon.species.id === "eiscue" && this.effectState.busted) {
        pokemon.formeChange("Eiscue-Noice", this.effect, true);
      }
    }*/
/*@Override
 void onWeatherChange(pokemon, Pokemon source, sourceEffect) {
      if (sourceEffect?.suppressWeather)
        return;
      if (!pokemon.hp)
        return;
      if (this.field.isWeather(["hail", "snow"]) && pokemon.species.id === "eiscuenoice" && !pokemon.transformed) {
        this.add("-activate", pokemon, "ability: Ice Face");
        this.effectState.busted = false;
        pokemon.formeChange("Eiscue", this.effect, true);
      }
    }*/
public Ice_Face(Pokemon pkmn) {
        super(pkmn);
    }
}