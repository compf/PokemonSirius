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
/*If the last item this Pokemon used is a Berry, there is a 50% chance it gets restored at the end of each turn. If Sunny Day is active, this chance is 100%.*/
 public class Harvest extends PokemonBattleEffect{

/*@Override
 void onResidual(pokemon) {
      if (this.field.isWeather(["sunnyday", "desolateland"]) || this.randomChance(1, 2)) {
        if (pokemon.hp && !pokemon.item && this.dex.items.get(pokemon.lastItem).isBerry) {
          pokemon.setItem(pokemon.lastItem);
          pokemon.lastItem = "";
          this.add("-item", pokemon, pokemon.getItem(), "[from] ability: Harvest");
        }
      }
    }*/
public Harvest(Pokemon pkmn) {
        super(pkmn);
    }
}