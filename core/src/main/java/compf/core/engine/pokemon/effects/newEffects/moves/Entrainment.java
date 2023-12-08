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
/*Causes the target's Ability to become the same as the user's. Fails if the target's Ability is As One, Battle Bond, Comatose, Commander, Disguise, Gulp Missile, Hadron Engine, Ice Face, Multitype, Orichalcum Pulse, Power Construct, Protosynthesis, Quark Drive, RKS System, Schooling, Shields Down, Stance Change, Truant, Zen Mode, Zero to Hero, or the same Ability as the user, or if the user's Ability is As One, Battle Bond, Comatose, Commander, Disguise, Flower Gift, Forecast, Gulp Missile, Hadron Engine, Hunger Switch, Ice Face, Illusion, Imposter, Multitype, Neutralizing Gas, Orichalcum Pulse, Power Construct, Power of Alchemy, Protosynthesis, Quark Drive, Receiver, RKS System, Schooling, Shields Down, Stance Change, Trace, Zen Mode, or Zero to Hero.*/
 public class Entrainment extends PokemonBattleEffect{

/*@Override
 void onTryHit(Pokemon target, source) {
      if (target === source || target.volatiles["dynamax"])
        return false;
      const additionalBannedSourceAbilities = [
        // Zen Mode included here for compatability with Gen 5-6
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
      if (target.ability === source.ability || target.getAbility().isPermanent || target.ability === "truant" || source.getAbility().isPermanent || additionalBannedSourceAbilities.includes(source.ability)) {
        return false;
      }
    }*/
/*@Override
 void onHit(Pokemon target, source) {
      const oldAbility = target.setAbility(source.ability);
      if (oldAbility) {
        this.add("-ability", target, target.getAbility().name, "[from] move: Entrainment");
        if (!target.isAlly(source))
          target.volatileStaleness = "external";
        return;
      }
      return oldAbility;
    }*/
public Entrainment(Pokemon pkmn) {
        super(pkmn);
    }
}