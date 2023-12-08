package compf.core.engine.pokemon.effects.newEffects.abilities;

import compf.core.engine.BattleAction;
    import compf.core.engine.pokemon.PokemonStat;
    import compf.core.engine.pokemon.Pokemon;
    import compf.core.engine.pokemon.effects.EffectParam;
    import compf.core.engine.pokemon.effects.PokemonBattleEffect;
    import compf.core.engine.pokemon.moves.DamageInformation;
    import compf.core.engine.pokemon.moves.Schedule;
    import compf.core.engine.pokemon.moves.Schedule.ScheduleItem;
    import compf.core.etc.services.SharedInformation;
/*This Pokemon's Speed is raised by 1 stage at the end of each full turn it has been on the field.*/
 public class Speed_Boost extends PokemonBattleEffect{

/*@Override
 void onResidual(pokemon) {
      if (pokemon.activeTurns) {
        this.boost({ spe: 1 });
      }
    }*/
public Speed_Boost(Pokemon pkmn) {
        super(pkmn);
    }
}