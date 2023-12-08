package compf.core.engine.pokemon.effects.newEffects.items;

import compf.core.engine.BattleAction;
    import compf.core.engine.pokemon.PokemonStat;
    import compf.core.engine.pokemon.Pokemon;
    import compf.core.engine.pokemon.effects.EffectParam;
    import compf.core.engine.pokemon.effects.PokemonBattleEffect;
    import compf.core.engine.pokemon.moves.DamageInformation;
    import compf.core.engine.pokemon.moves.Schedule;
    import compf.core.engine.pokemon.moves.Schedule.ScheduleItem;
    import compf.core.etc.services.SharedInformation;
/*Activates the Protosynthesis or Quark Drive Abilities. Single use.*/
 public class Booster_Energy extends PokemonBattleEffect{

/*@Override
 void onStart() {
      this.effectState.started = true;
    }*/
/*@Override
 void onUpdate(pokemon) {
      if (!this.effectState.started || pokemon.transformed)
        return;
      if (this.queue.peek(true)?.choice === "runSwitch")
        return;
      if (pokemon.hasAbility("protosynthesis") && !this.field.isWeather("sunnyday") && pokemon.useItem()) {
        pokemon.addVolatile("protosynthesis");
      }
      if (pokemon.hasAbility("quarkdrive") && !this.field.isTerrain("electricterrain") && pokemon.useItem()) {
        pokemon.addVolatile("quarkdrive");
      }
    }*/
/*@Override
 void onTakeItem(item, source) {
      if (source.baseSpecies.tags.includes("Paradox"))
        return false;
      return true;
    }*/
public Booster_Energy(Pokemon pkmn) {
        super(pkmn);
    }
}