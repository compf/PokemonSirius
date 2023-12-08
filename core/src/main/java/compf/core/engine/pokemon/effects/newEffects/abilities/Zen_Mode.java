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
/*If this Pokemon is a Darmanitan or Galarian Darmanitan, it changes to Zen Mode if it has 1/2 or less of its maximum HP at the end of a turn. If Darmanitan's HP is above 1/2 of its maximum HP at the end of a turn, it changes back to Standard Mode.*/
 public class Zen_Mode extends PokemonBattleEffect{

/*@Override
 void onResidual(pokemon) {
      if (pokemon.baseSpecies.baseSpecies !== "Darmanitan" || pokemon.transformed) {
        return;
      }
      if (pokemon.hp <= pokemon.maxhp / 2 && !["Zen", "Galar-Zen"].includes(pokemon.species.forme)) {
        pokemon.addVolatile("zenmode");
      } else if (pokemon.hp > pokemon.maxhp / 2 && ["Zen", "Galar-Zen"].includes(pokemon.species.forme)) {
        pokemon.addVolatile("zenmode");
        pokemon.removeVolatile("zenmode");
      }
    }*/
/*@Override
 void onEnd(pokemon) {
        if (["Zen", "Galar-Zen"].includes(pokemon.species.forme)) {
          pokemon.formeChange(pokemon.species.battleOnly);
        }
      }*/
/*@Override
 void onStart(pokemon) {
        if (!pokemon.species.name.includes("Galar")) {
          if (pokemon.species.id !== "darmanitanzen")
            pokemon.formeChange("Darmanitan-Zen");
        } else {
          if (pokemon.species.id !== "darmanitangalarzen")
            pokemon.formeChange("Darmanitan-Galar-Zen");
        }
      }*/
public Zen_Mode(Pokemon pkmn) {
        super(pkmn);
    }
}