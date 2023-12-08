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
/*If the user moves after the target, the target's Ability is rendered ineffective as long as it remains active. If the target uses Baton Pass, the replacement will remain under this effect. If the target's Ability is As One, Battle Bond, Comatose, Commander, Disguise, Gulp Missile, Hadron Engine, Ice Face, Multitype, Orichalcum Pulse, Power Construct, Protosynthesis, Quark Drive, RKS System, Schooling, Shields Down, Stance Change, Zen Mode, or Zero to Hero, this effect does not happen, and receiving the effect through Baton Pass ends the effect immediately.*/
 public class Core_Enforcer extends PokemonBattleEffect{

/*@Override
 void onHit(target) {
      if (target.getAbility().isPermanent)
        return;
      if (target.newlySwitched || this.queue.willMove(target))
        return;
      target.addVolatile("gastroacid");
    }*/
/*@Override
 void onAfterSubDamage(DamageInformation damage, target) {
      if (target.getAbility().isPermanent)
        return;
      if (target.newlySwitched || this.queue.willMove(target))
        return;
      target.addVolatile("gastroacid");
    }*/
public Core_Enforcer(Pokemon pkmn) {
        super(pkmn);
    }
}