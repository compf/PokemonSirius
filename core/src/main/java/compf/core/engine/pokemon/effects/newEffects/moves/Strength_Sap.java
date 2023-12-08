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
/*Lowers the target's Attack by 1 stage. The user restores its HP equal to the target's Attack stat calculated with its stat stage before this move was used. If Big Root is held by the user, the HP recovered is 1.3x normal, rounded half down. Fails if the target's Attack stat stage is -6.*/
 public class Strength_Sap extends PokemonBattleEffect{

/*@Override
 void onHit(Pokemon target, source) {
      if (target.boosts.atk === -6)
        return false;
      const atk = target.getStat("atk", false, true);
      const success = this.boost({ atk: -1 }, target, Pokemon source, null, false, true);
      return !!(this.heal(atk, source, target) || success);
    }*/
public Strength_Sap(Pokemon pkmn) {
        super(pkmn);
    }
}