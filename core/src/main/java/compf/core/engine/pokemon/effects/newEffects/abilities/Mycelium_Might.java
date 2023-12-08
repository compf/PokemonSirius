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
/*This Pokemon's Status moves ignore certain Abilities of other Pokemon, and go last among Pokemon using the same or greater priority moves.*/
 public class Mycelium_Might extends PokemonBattleEffect{

/*@Override
 void onFractionalPriority(priority, pokemon, Pokemon target, move) {
      if (move.category === "Status") {
        return -0.1;
      }
    }*/
/*@Override
 void onModifyMove(move) {
      if (move.category === "Status") {
        move.ignoreAbility = true;
      }
    }*/
public Mycelium_Might(Pokemon pkmn) {
        super(pkmn);
    }
}