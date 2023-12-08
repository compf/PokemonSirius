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
/*Raises the user's Attack, Defense, Special Attack, Special Defense, and Speed by 1 stage in exchange for the user losing 33% of its maximum HP, rounded down. Fails if the user would faint or if its Attack, Defense, Special Attack, Special Defense, and Speed stat stages would not change.*/
 public class Clangorous_Soul extends PokemonBattleEffect{

/*@Override
 void onTry(source) {
      if (source.hp <= source.maxhp * 33 / 100 || source.maxhp === 1)
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
      this.directDamage(pokemon.maxhp * 33 / 100);
    }*/
public Clangorous_Soul(Pokemon pkmn) {
        super(pkmn);
    }
}