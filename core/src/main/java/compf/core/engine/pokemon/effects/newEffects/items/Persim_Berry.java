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
/*Holder is cured if it is confused. Single use.*/
 public class Persim_Berry extends PokemonBattleEffect{

/*@Override
 void onUpdate(pokemon) {
      if (pokemon.volatiles["confusion"]) {
        pokemon.eatItem();
      }
    }*/
/*@Override
 void onEat(pokemon) {
      pokemon.removeVolatile("confusion");
    }*/
public Persim_Berry(Pokemon pkmn) {
        super(pkmn);
    }
}