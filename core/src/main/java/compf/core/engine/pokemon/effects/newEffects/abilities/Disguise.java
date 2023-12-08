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
/*If this Pokemon is a Mimikyu, the first hit it takes in battle deals 0 neutral damage. Its disguise is then broken, it changes to Busted Form, and it loses 1/8 of its max HP. Confusion damage also breaks the disguise.*/
 public class Disguise extends PokemonBattleEffect{

/*@Override
 void onDamage(DamageInformation damage, Pokemon target, Pokemon source, effect) {
      if (effect && effect.effectType === "Move" && ["mimikyu", "mimikyutotem"].includes(target.species.id) && !target.transformed) {
        this.add("-activate", target, "ability: Disguise");
        this.effectState.busted = true;
        return 0;
      }
    }*/
/*@Override
 void onCriticalHit(Pokemon target, Pokemon source, move) {
      if (!target)
        return;
      if (!["mimikyu", "mimikyutotem"].includes(target.species.id) || target.transformed) {
        return;
      }
      const hitSub = target.volatiles["substitute"] && !move.flags["bypasssub"] && !(move.infiltrates && this.gen >= 6);
      if (hitSub)
        return;
      if (!target.runImmunity(move.type))
        return;
      return false;
    }*/
/*@Override
 void onEffectiveness(typeMod, Pokemon target, type, move) {
      if (!target || move.category === "Status")
        return;
      if (!["mimikyu", "mimikyutotem"].includes(target.species.id) || target.transformed) {
        return;
      }
      const hitSub = target.volatiles["substitute"] && !move.flags["bypasssub"] && !(move.infiltrates && this.gen >= 6);
      if (hitSub)
        return;
      if (!target.runImmunity(move.type))
        return;
      return 0;
    }*/
/*@Override
 void onUpdate(pokemon) {
      if (["mimikyu", "mimikyutotem"].includes(pokemon.species.id) && this.effectState.busted) {
        const speciesid = pokemon.species.id === "mimikyutotem" ? "Mimikyu-Busted-Totem" : "Mimikyu-Busted";
        pokemon.formeChange(speciesid, this.effect, true);
        this.DamageInformation damage(pokemon.baseMaxhp / 8, pokemon, pokemon, this.dex.species.get(speciesid));
      }
    }*/
public Disguise(Pokemon pkmn) {
        super(pkmn);
    }
}