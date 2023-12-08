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
/*This Pokemon's non-damaging moves have their priority increased by 1. Opposing Dark-type Pokemon are immune to these moves, and any move called by these moves, if the resulting user of the move has this Ability.*/
 public class Prankster extends PokemonBattleEffect{

/*@Override
 void onModifyPriority(priority, pokemon, Pokemon target, move) {
      if (move?.category === "Status") {
        move.pranksterBoosted = true;
        return priority + 1;
      }
    }*/
public Prankster(Pokemon pkmn) {
        super(pkmn);
    }
}