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
/*Holder's Sp. Atk is 1.5x, but it can only select the first move it executes.*/
 public class Choice_Specs extends PokemonBattleEffect{

/*@Override
 void onStart(pokemon) {
      if (pokemon.volatiles["choicelock"]) {
        this.debug("removing choicelock: " + pokemon.volatiles["choicelock"]);
      }
      pokemon.removeVolatile("choicelock");
    }*/
/*@Override
 void onModifyMove(Move move, pokemon) {
      pokemon.addVolatile("choicelock");
    }*/
/*@Override
 void onModifySpA(spa, pokemon) {
      if (pokemon.volatiles["dynamax"])
        return;
      return this.chainModify(1.5);
    }*/
public Choice_Specs(Pokemon pkmn) {
        super(pkmn);
    }
}