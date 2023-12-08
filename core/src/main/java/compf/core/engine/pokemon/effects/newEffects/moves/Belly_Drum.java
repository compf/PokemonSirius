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
/*Raises the user's Attack by 12 stages in exchange for the user losing 1/2 of its maximum HP, rounded down. Fails if the user would faint or if its Attack stat stage is 6.*/
 public class Belly_Drum extends PokemonBattleEffect{

/*@Override
 void onHit(target) {
      if (target.hp <= target.maxhp / 2 || target.boosts.atk >= 6 || target.maxhp === 1) {
        return false;
      }
      this.directDamage(target.maxhp / 2);
      this.boost({ atk: 12 }, target);
    }*/
public Belly_Drum(Pokemon pkmn) {
        super(pkmn);
    }
}