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
/*Raises holder's Sp. Def by 1 stage after it is hit by a special attack. Single use.*/
 public class Maranga_Berry extends PokemonBattleEffect{

/*@Override
 void onAfterMoveSecondary(Pokemon target, Pokemon source, move) {
      if (move.category === "Special") {
        target.eatItem();
      }
    }*/
/*@Override
 void onEat(pokemon) {
      this.boost({ spd: 1 });
    }*/
public Maranga_Berry(Pokemon pkmn) {
        super(pkmn);
    }
}