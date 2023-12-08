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
/*This Pokemon's Attack is multiplied by 1.5 and the accuracy of its physical attacks is multiplied by 0.8.*/
 public class Hustle extends PokemonBattleEffect{

/*@Override
 void onModifyAtk(atk) {
      return this.modify(atk, 1.5);
    }*/
/*@Override
 void onSourceModifyAccuracy(accuracy, Pokemon target, Pokemon source, move) {
      if (move.category === "Physical" && typeof accuracy === "number") {
        return this.chainModify([3277, 4096]);
      }
    }*/
public Hustle(Pokemon pkmn) {
        super(pkmn);
    }
}