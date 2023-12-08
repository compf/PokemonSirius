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
/*undefined*/
 public class Screen_Cleaner extends PokemonBattleEffect{

/*@Override
 void onStart(pokemon) {
      let activated = false;
      for (const sideCondition of ["reflect", "lightscreen", "auroraveil"]) {
        for (const side of [pokemon.side, ...pokemon.side.foeSidesWithConditions()]) {
          if (side.getSideCondition(sideCondition)) {
            if (!activated) {
              this.add("-activate", pokemon, "ability: Screen Cleaner");
              activated = true;
            }
            side.removeSideCondition(sideCondition);
          }
        }
      }
    }*/
public Screen_Cleaner(Pokemon pkmn) {
        super(pkmn);
    }
}