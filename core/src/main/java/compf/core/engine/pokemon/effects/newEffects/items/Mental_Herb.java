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
/*Cures holder of Attract, Disable, Encore, Heal Block, Taunt, Torment. Single use.*/
 public class Mental_Herb extends PokemonBattleEffect{

/*@Override
 void onUpdate(pokemon) {
      const conditions = ["attract", "taunt", "encore", "torment", "disable", "healblock"];
      for (const firstCondition of conditions) {
        if (pokemon.volatiles[firstCondition]) {
          if (!pokemon.useItem())
            return;
          for (const secondCondition of conditions) {
            pokemon.removeVolatile(secondCondition);
            if (firstCondition === "attract" && secondCondition === "attract") {
              this.add("-end", pokemon, "move: Attract", "[from] item: Mental Herb");
            }
          }
          return;
        }
      }
    }*/
public Mental_Herb(Pokemon pkmn) {
        super(pkmn);
    }
}