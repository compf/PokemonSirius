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
/*(Gen 2) Holder cures itself if it is confused or has a status condition. Single use.*/
 public class Miracle_Berry extends PokemonBattleEffect{

/*@Override
 void onUpdate(pokemon) {
      if (pokemon.status || pokemon.volatiles["confusion"]) {
        pokemon.eatItem();
      }
    }*/
/*@Override
 void onEat(pokemon) {
      pokemon.cureStatus();
      pokemon.removeVolatile("confusion");
    }*/
public Miracle_Berry(Pokemon pkmn) {
        super(pkmn);
    }
}