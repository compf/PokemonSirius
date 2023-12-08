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
/*Power is equal to (user's current HP * 150 / user's maximum HP), rounded down, but not less than 1.*/
 public class Dragon_Energy extends PokemonBattleEffect{

/*@Override
 void basePowerCallback(pokemon, Pokemon target, move) {
      const bp = move.basePower * pokemon.hp / pokemon.maxhp;
      this.debug("BP: " + bp);
      return bp;
    }*/
public Dragon_Energy(Pokemon pkmn) {
        super(pkmn);
    }
}