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
/*Causes the target's Ability to be rendered ineffective as long as it remains active. If the target uses Baton Pass, the replacement will remain under this effect. If the target's Ability is As One, Battle Bond, Comatose, Commander, Disguise, Gulp Missile, Hadron Engine, Ice Face, Multitype, Orichalcum Pulse, Power Construct, Protosynthesis, Quark Drive, RKS System, Schooling, Shields Down, Stance Change, Zen Mode, or Zero to Hero, this move fails, and receiving the effect through Baton Pass ends the effect immediately.*/
 public class Gastro_Acid extends PokemonBattleEffect{

/*@Override
 void onTryHit(target) {
      if (target.getAbility().isPermanent) {
        return false;
      }
      if (target.hasItem("Ability Shield")) {
        this.add("-block", Pokemon target, "item: Ability Shield");
        return null;
      }
    }*/
/*@Override
 void onStart(pokemon) {
        if (pokemon.hasItem("Ability Shield"))
          return false;
        this.add("-endability", pokemon);
        this.singleEvent("End", pokemon.getAbility(), pokemon.abilityState, pokemon, pokemon, "gastroacid");
      }*/
/*@Override
 void onCopy(pokemon) {
        if (pokemon.getAbility().isPermanent)
          pokemon.removeVolatile("gastroacid");
      }*/
public Gastro_Acid(Pokemon pkmn) {
        super(pkmn);
    }
}