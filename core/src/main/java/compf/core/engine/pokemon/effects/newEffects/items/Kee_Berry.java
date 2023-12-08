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
/*Raises holder's Defense by 1 stage after it is hit by a physical attack. Single use.*/
 public class Kee_Berry extends PokemonBattleEffect{

/*@Override
 void onAfterMoveSecondary(Pokemon target, Pokemon source, move) {
      if (move.category === "Physical") {
        if (move.id === "present" && move.heal)
          return;
        target.eatItem();
      }
    }*/
/*@Override
 void onEat(pokemon) {
      this.boost({ def: 1 });
    }*/
public Kee_Berry(Pokemon pkmn) {
        super(pkmn);
    }
}