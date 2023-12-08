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
/*This Pokemon has its non-volatile status condition cured at the end of each turn if Rain Dance is active. This effect is prevented if this Pokemon is holding a Utility Umbrella.*/
 public class Hydration extends PokemonBattleEffect{

/*@Override
 void onResidual(pokemon) {
      if (pokemon.status && ["raindance", "primordialsea"].includes(pokemon.effectiveWeather())) {
        this.debug("hydration");
        this.add("-activate", pokemon, "ability: Hydration");
        pokemon.cureStatus();
      }
    }*/
public Hydration(Pokemon pkmn) {
        super(pkmn);
    }
}