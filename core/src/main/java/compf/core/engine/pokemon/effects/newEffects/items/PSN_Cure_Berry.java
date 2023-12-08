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
/*(Gen 2) Holder is cured if it is poisoned. Single use.*/
 public class PSN_Cure_Berry extends PokemonBattleEffect{

/*@Override
 void onUpdate(pokemon) {
      if (pokemon.status === "psn" || pokemon.status === "tox") {
        pokemon.eatItem();
      }
    }*/
/*@Override
 void onEat(pokemon) {
      if (pokemon.status === "psn" || pokemon.status === "tox") {
        pokemon.cureStatus();
      }
    }*/
public PSN_Cure_Berry(Pokemon pkmn) {
        super(pkmn);
    }
}