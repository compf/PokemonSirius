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
/*undefined*/
 public class Cud_Chew extends PokemonBattleEffect{

/*@Override
 void onEatItem(item, pokemon) {
      if (item.isBerry && pokemon.addVolatile("cudchew")) {
        pokemon.volatiles["cudchew"].berry = item;
      }
    }*/
/*@Override
 void onEnd(pokemon) {
        if (pokemon.hp) {
          const item = this.effectState.berry;
          this.add("-activate", pokemon, "ability: Cud Chew");
          this.add("-enditem", pokemon, item.name, "[eat]");
          if (this.singleEvent("Eat", item, null, pokemon, null, null)) {
            this.runEvent("EatItem", pokemon, null, null, item);
          }
          if (item.onEat)
            pokemon.ateBerry = true;
        }
      }*/
/*@Override
 void true*/
/*@Override
 void 2*/
/*@Override
 void onRestart() {
        this.effectState.duration = 2;
      }*/
/*@Override
 void 28*/
/*@Override
 void 2*/
public Cud_Chew(Pokemon pkmn) {
        super(pkmn);
    }
}