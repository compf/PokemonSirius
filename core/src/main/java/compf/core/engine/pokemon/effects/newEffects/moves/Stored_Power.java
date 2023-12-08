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
/*Power is equal to 20+(X*20), where X is the user's total stat stage changes that are greater than 0.*/
 public class Stored_Power extends PokemonBattleEffect{

/*@Override
 void basePowerCallback(pokemon, Pokemon target, move) {
      const bp = move.basePower + 20 * pokemon.positiveBoosts();
      this.debug("BP: " + bp);
      return bp;
    }*/
public Stored_Power(Pokemon pkmn) {
        super(pkmn);
    }
}