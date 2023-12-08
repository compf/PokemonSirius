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
/*This Pokemon is immune to wind moves and raises its Attack by 1 stage when hit by a wind move or when Tailwind begins on this Pokemon's side.*/
 public class Wind_Rider extends PokemonBattleEffect{

/*@Override
 void onStart(pokemon) {
      if (pokemon.side.sideConditions["tailwind"]) {
        this.boost({ atk: 1 }, pokemon, pokemon);
      }
    }*/
/*@Override
 void onTryHit(Pokemon target, Pokemon source, move) {
      if (target !== source && move.flags["wind"]) {
        if (!this.boost({ atk: 1 }, target, target)) {
          this.add("-immune", target, "[from] ability: Wind Rider");
        }
        return null;
      }
    }*/
/*@Override
 void onAllySideConditionStart(Pokemon target, Pokemon source, sideCondition) {
      const pokemon = this.effectState.target;
      if (sideCondition.id === "tailwind") {
        this.boost({ atk: 1 }, pokemon, pokemon);
      }
    }*/
public Wind_Rider(Pokemon pkmn) {
        super(pkmn);
    }
}