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
/*On switch-in, if this Pokemon is a Wishiwashi that is level 20 or above and has more than 1/4 of its maximum HP left, it changes to School Form. If it is in School Form and its HP drops to 1/4 of its maximum HP or less, it changes to Solo Form at the end of the turn. If it is in Solo Form and its HP is greater than 1/4 its maximum HP at the end of the turn, it changes to School Form.*/
 public class Schooling extends PokemonBattleEffect{

/*@Override
 void onStart(pokemon) {
      if (pokemon.baseSpecies.baseSpecies !== "Wishiwashi" || pokemon.level < 20 || pokemon.transformed)
        return;
      if (pokemon.hp > pokemon.maxhp / 4) {
        if (pokemon.species.id === "wishiwashi") {
          pokemon.formeChange("Wishiwashi-School");
        }
      } else {
        if (pokemon.species.id === "wishiwashischool") {
          pokemon.formeChange("Wishiwashi");
        }
      }
    }*/
/*@Override
 void onResidual(pokemon) {
      if (pokemon.baseSpecies.baseSpecies !== "Wishiwashi" || pokemon.level < 20 || pokemon.transformed || !pokemon.hp)
        return;
      if (pokemon.hp > pokemon.maxhp / 4) {
        if (pokemon.species.id === "wishiwashi") {
          pokemon.formeChange("Wishiwashi-School");
        }
      } else {
        if (pokemon.species.id === "wishiwashischool") {
          pokemon.formeChange("Wishiwashi");
        }
      }
    }*/
public Schooling(Pokemon pkmn) {
        super(pkmn);
    }
}