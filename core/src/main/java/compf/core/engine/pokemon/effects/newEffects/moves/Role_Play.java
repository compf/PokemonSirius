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
/*The user's Ability changes to match the target's Ability. Fails if the user's Ability is As One, Battle Bond, Comatose, Commander, Disguise, Gulp Missile, Hadron Engine, Ice Face, Multitype, Orichalcum Pulse, Power Construct, Protosynthesis, Quark Drive, RKS System, Schooling, Shields Down, Stance Change, Zen Mode, Zero to Hero, or already matches the target, or if the target's Ability is As One, Battle Bond, Comatose, Commander, Disguise, Flower Gift, Forecast, Gulp Missile, Hadron Engine, Hunger Switch, Ice Face, Illusion, Imposter, Multitype, Neutralizing Gas, Orichalcum Pulse, Power Construct, Power of Alchemy, Protosynthesis, Quark Drive, Receiver, RKS System, Schooling, Shields Down, Stance Change, Trace, Wonder Guard, Zen Mode, or Zero to Hero.*/
 public class Role_Play extends PokemonBattleEffect{

/*@Override
 void onTryHit(Pokemon target, source) {
      if (target.ability === source.ability)
        return false;
      const additionalBannedTargetAbilities = [
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
        "wonderguard",
        "zenmode"
      ];
      if (target.getAbility().isPermanent || additionalBannedTargetAbilities.includes(target.ability) || source.getAbility().isPermanent) {
        return false;
      }
    }*/
/*@Override
 void onHit(Pokemon target, source) {
      const oldAbility = source.setAbility(target.ability);
      if (oldAbility) {
        this.add("-ability", Pokemon source, source.getAbility().name, "[from] move: Role Play", "[of] " + target);
        return;
      }
      return oldAbility;
    }*/
public Role_Play(Pokemon pkmn) {
        super(pkmn);
    }
}