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
/*(Gen 2) Holder wakes up if it is asleep. Single use.*/
 public class Mint_Berry extends PokemonBattleEffect{

/*@Override
 void onUpdate(pokemon) {
      if (pokemon.status === "slp") {
        pokemon.eatItem();
      }
    }*/
/*@Override
 void onEat(pokemon) {
      if (pokemon.status === "slp") {
        pokemon.cureStatus();
      }
    }*/
public Mint_Berry(Pokemon pkmn) {
        super(pkmn);
    }
}