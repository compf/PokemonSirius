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
/*If Rain Dance is active, this Pokemon's Speed is doubled. This effect is prevented if this Pokemon is holding a Utility Umbrella.*/
 public class Swift_Swim extends PokemonBattleEffect{

/*@Override
 void onModifySpe(spe, pokemon) {
      if (["raindance", "primordialsea"].includes(pokemon.effectiveWeather())) {
        return this.chainModify(2);
      }
    }*/
public Swift_Swim(Pokemon pkmn) {
        super(pkmn);
    }
}