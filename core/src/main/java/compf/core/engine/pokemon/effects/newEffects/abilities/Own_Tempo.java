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
/*This Pokemon cannot be confused. Gaining this Ability while confused cures it. This Pokemon is immune to the effect of the Intimidate Ability.*/
 public class Own_Tempo extends PokemonBattleEffect{

/*@Override
 void onUpdate(pokemon) {
      if (pokemon.volatiles["confusion"]) {
        this.add("-activate", pokemon, "ability: Own Tempo");
        pokemon.removeVolatile("confusion");
      }
    }*/
/*@Override
 void onTryAddVolatile(status, pokemon) {
      if (status.id === "confusion")
        return null;
    }*/
/*@Override
 void onHit(Pokemon target, Pokemon source, move) {
      if (move?.volatileStatus === "confusion") {
        this.add("-immune", target, "confusion", "[from] ability: Own Tempo");
      }
    }*/
/*@Override
 void onTryBoost(boost, Pokemon target, Pokemon source, effect) {
      if (effect.name === "Intimidate" && boost.atk) {
        delete boost.atk;
        this.add("-fail", target, "unboost", "Attack", "[from] ability: Own Tempo", "[of] " + target);
      }
    }*/
public Own_Tempo(Pokemon pkmn) {
        super(pkmn);
    }
}