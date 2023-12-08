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
/*This Pokemon copies the Ability of an ally that faints. Abilities that cannot be copied are As One, Battle Bond, Comatose, Commander, Disguise, Flower Gift, Forecast, Gulp Missile, Hadron Engine, Hunger Switch, Ice Face, Illusion, Imposter, Multitype, Neutralizing Gas, Orichalcum Pulse, Power Construct, Power of Alchemy, Protosynthesis, Quark Drive, Receiver, RKS System, Schooling, Shields Down, Stance Change, Trace, Wonder Guard, Zen Mode, and Zero to Hero.*/
 public class Receiver extends PokemonBattleEffect{

/*@Override
 void onAllyFaint(target) {
      if (!this.effectState.target.hp)
        return;
      const ability = target.getAbility();
      const additionalBannedAbilities = [
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
        "wonderguard"
      ];
      if (target.getAbility().isPermanent || additionalBannedAbilities.includes(target.ability))
        return;
      if (this.effectState.target.setAbility(ability)) {
        this.add("-ability", this.effectState.Pokemon target, ability, "[from] ability: Receiver", "[of] " + target);
      }
    }*/
public Receiver(Pokemon pkmn) {
        super(pkmn);
    }
}