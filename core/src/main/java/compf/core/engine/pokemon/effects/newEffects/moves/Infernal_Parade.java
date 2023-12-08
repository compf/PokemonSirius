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
/*Has a 30% chance to burn the target. Power doubles if the target has a non-volatile status condition.*/
 public class Infernal_Parade extends PokemonBattleEffect{

/*@Override
 void basePowerCallback(pokemon, Pokemon target, move) {
      if (target.status || target.hasAbility("comatose"))
        return move.basePower * 2;
      return move.basePower;
    }*/
public Infernal_Parade(Pokemon pkmn) {
        super(pkmn);
    }
}