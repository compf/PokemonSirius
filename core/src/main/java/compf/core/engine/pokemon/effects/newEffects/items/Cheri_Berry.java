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
/*Holder cures itself if it is paralyzed. Single use.*/
 public class Cheri_Berry extends PokemonBattleEffect{

/*@Override
 void onUpdate(pokemon) {
      if (pokemon.status === "par") {
        pokemon.eatItem();
      }
    }*/
/*@Override
 void onEat(pokemon) {
      if (pokemon.status === "par") {
        pokemon.cureStatus();
      }
    }*/
public Cheri_Berry(Pokemon pkmn) {
        super(pkmn);
    }
}