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
/*The user and its ally's Abilities change to match the target's Ability. Does not change Ability if the user's or its ally's is As One, Battle Bond, Comatose, Commander, Disguise, Gulp Missile, Hadron Engine, Ice Face, Multitype, Orichalcum Pulse, Power Construct, Protosynthesis, Quark Drive, RKS System, Schooling, Shields Down, Stance Change, Zen Mode, Zero to Hero, or already matches the target. Fails if both the user and its ally's Ability already matches the target, or if the target's Ability is As One, Battle Bond, Comatose, Commander, Disguise, Flower Gift, Forecast, Gulp Missile, Hadron Engine, Hunger Switch, Ice Face, Illusion, Imposter, Multitype, Neutralizing Gas, Orichalcum Pulse, Power Construct, Power of Alchemy, Protosynthesis, Quark Drive, Receiver, RKS System, Schooling, Shields Down, Stance Change, Trace, Wonder Guard, Zen Mode, or Zero to Hero.*/
 public class Doodle extends PokemonBattleEffect{

/*@Override
 void onHit(Pokemon target, Pokemon source, move) {
      let success = false;
      for (const pokemon of source.alliesAndSelf()) {
        if (pokemon.ability === target.ability)
          continue;
        const oldAbility = pokemon.setAbility(target.ability);
        if (oldAbility) {
          this.add("-ability", pokemon, target.getAbility().name, "[from] move: Doodle");
          success = true;
        } else if (!success && oldAbility === null) {
          success = null;
        }
      }
      if (!success) {
        if (success === false) {
          this.add("-fail", source);
        }
        this.attrLastMove("[still]");
        return this.NOT_FAIL;
      }
    }*/
public Doodle(Pokemon pkmn) {
        super(pkmn);
    }
}