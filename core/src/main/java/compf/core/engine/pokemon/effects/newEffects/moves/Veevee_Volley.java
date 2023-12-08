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
/*Power is equal to the greater of (user's Happiness * 2/5), rounded down, or 1.*/
 public class Veevee_Volley extends PokemonBattleEffect{

/*@Override
 void basePowerCallback(pokemon) {
      const bp = Math.floor(pokemon.happiness * 10 / 25) || 1;
      this.debug("BP: " + bp);
      return bp;
    }*/
public Veevee_Volley(Pokemon pkmn) {
        super(pkmn);
    }
}