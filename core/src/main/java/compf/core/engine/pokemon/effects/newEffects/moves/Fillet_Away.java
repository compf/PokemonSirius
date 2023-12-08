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
/*Raises the user's Attack, Special Attack, and Speed by 2 stages in exchange for the user losing 1/2 of its maximum HP, rounded down. Fails if the user would faint or if its Attack, Special Attack, and Speed stat stages would not change.*/
 public class Fillet_Away extends PokemonBattleEffect{

/*@Override
 void onTry(source) {
      if (source.hp <= source.maxhp / 2 || source.maxhp === 1)
        return false;
    }*/
/*@Override
 void onTryHit(pokemon, Pokemon target, move) {
      if (!this.boost(move.boosts))
        return null;
      delete move.boosts;
    }*/
/*@Override
 void onHit(pokemon) {
      this.directDamage(pokemon.maxhp / 2);
    }*/
public Fillet_Away(Pokemon pkmn) {
        super(pkmn);
    }
}