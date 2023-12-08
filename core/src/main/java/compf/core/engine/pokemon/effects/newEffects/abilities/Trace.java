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
/*On switch-in, this Pokemon copies a random opposing Pokemon's Ability. Abilities that cannot be copied are As One, Battle Bond, Comatose, Commander, Disguise, Flower Gift, Forecast, Gulp Missile, Hadron Engine, Hunger Switch, Ice Face, Illusion, Imposter, Multitype, Neutralizing Gas, Orichalcum Pulse, Power Construct, Power of Alchemy, Protosynthesis, Quark Drive, Receiver, RKS System, Schooling, Shields Down, Stance Change, Trace, Zen Mode, and Zero to Hero. If no opposing Pokemon has an Ability that can be copied, this Ability will activate as soon as one does.*/
 public class Trace extends PokemonBattleEffect{

/*@Override
 void onStart(pokemon) {
      if (pokemon.adjacentFoes().some((foeActive) => foeActive.ability === "noability")) {
        this.effectState.gaveUp = true;
      }
      if (pokemon.hasItem("Ability Shield")) {
        this.add("-block", pokemon, "item: Ability Shield");
        this.effectState.gaveUp = true;
      }
    }*/
/*@Override
 void onUpdate(pokemon) {
      if (!pokemon.isStarted || this.effectState.gaveUp)
        return;
      const additionalBannedAbilities = [
        // Zen Mode included here for compatability with Gen 5-6
        "noability",
        "commander",
        "flowergift",
        "forecast",
        "hungerswitch",
        "illusion",
        "imposter",
        "neutralizinggas",
        "powerofalchemy",
        "receiver",
        "trace",
        "zenmode"
      ];
      const possibleTargets = pokemon.adjacentFoes().filter((target2) => !target2.getAbility().isPermanent && !additionalBannedAbilities.includes(target2.ability));
      if (!possibleTargets.length)
        return;
      const target = this.sample(possibleTargets);
      const ability = target.getAbility();
      if (pokemon.setAbility(ability)) {
        this.add("-ability", pokemon, ability, "[from] ability: Trace", "[of] " + target);
      }
    }*/
public Trace(Pokemon pkmn) {
        super(pkmn);
    }
}