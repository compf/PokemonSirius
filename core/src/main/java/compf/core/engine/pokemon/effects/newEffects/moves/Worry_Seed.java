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
/*Causes the target's Ability to become Insomnia. Fails if the target's Ability is As One, Battle Bond, Comatose, Commander, Disguise, Gulp Missile, Hadron Engine, Ice Face, Insomnia, Multitype, Orichalcum Pulse, Power Construct, Protosynthesis, Quark Drive, RKS System, Schooling, Shields Down, Stance Change, Truant, Zen Mode, or Zero to Hero.*/
 public class Worry_Seed extends PokemonBattleEffect{

/*@Override
 void onTryImmunity(target) {
      if (target.ability === "truant" || target.ability === "insomnia") {
        return false;
      }
    }*/
/*@Override
 void onTryHit(target) {
      if (target.getAbility().isPermanent) {
        return false;
      }
    }*/
/*@Override
 void onHit(pokemon) {
      const oldAbility = pokemon.setAbility("insomnia");
      if (oldAbility) {
        this.add("-ability", pokemon, "Insomnia", "[from] move: Worry Seed");
        if (pokemon.status === "slp") {
          pokemon.cureStatus();
        }
        return;
      }
      return oldAbility;
    }*/
public Worry_Seed(Pokemon pkmn) {
        super(pkmn);
    }
}