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
/*Causes the target's Ability to become Simple. Fails if the target's Ability is As One, Battle Bond, Comatose, Commander, Disguise, Gulp Missile, Hadron Engine, Ice Face, Multitype, Orichalcum Pulse, Power Construct, Protosynthesis, Quark Drive, RKS System, Schooling, Shields Down, Simple, Stance Change, Truant, Zen Mode, or Zero to Hero.*/
 public class Simple_Beam extends PokemonBattleEffect{

/*@Override
 void onTryHit(target) {
      if (target.getAbility().isPermanent || target.ability === "simple" || target.ability === "truant") {
        return false;
      }
    }*/
/*@Override
 void onHit(pokemon) {
      const oldAbility = pokemon.setAbility("simple");
      if (oldAbility) {
        this.add("-ability", pokemon, "Simple", "[from] move: Simple Beam");
        return;
      }
      return oldAbility;
    }*/
public Simple_Beam(Pokemon pkmn) {
        super(pkmn);
    }
}