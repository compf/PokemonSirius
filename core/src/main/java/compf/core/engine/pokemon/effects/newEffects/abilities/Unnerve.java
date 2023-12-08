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
/*While this Pokemon is active, it prevents opposing Pokemon from using their Berries. This Ability activates before hazards and other Abilities take effect.*/
 public class Unnerve extends PokemonBattleEffect{

/*@Override
 void onPreStart(pokemon) {
      this.add("-ability", pokemon, "Unnerve");
      this.effectState.unnerved = true;
    }*/
/*@Override
 void onStart(pokemon) {
      if (this.effectState.unnerved)
        return;
      this.add("-ability", pokemon, "Unnerve");
      this.effectState.unnerved = true;
    }*/
/*@Override
 void onEnd() {
      this.effectState.unnerved = false;
    }*/
/*@Override
 void onFoeTryEatItem() {
      return !this.effectState.unnerved;
    }*/
public Unnerve(Pokemon pkmn) {
        super(pkmn);
    }
}