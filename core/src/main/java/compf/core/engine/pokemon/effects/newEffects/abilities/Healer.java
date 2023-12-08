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
/*30% chance this Pokemon's ally has its non-volatile status condition cured at the end of each turn.*/
 public class Healer extends PokemonBattleEffect{

/*@Override
 void onResidual(pokemon) {
      for (const allyActive of pokemon.adjacentAllies()) {
        if (allyActive.status && this.randomChance(3, 10)) {
          this.add("-activate", pokemon, "ability: Healer");
          allyActive.cureStatus();
        }
      }
    }*/
public Healer(Pokemon pkmn) {
        super(pkmn);
    }
}