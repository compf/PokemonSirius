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
/*This Pokemon cannot be infatuated or taunted. Gaining this Ability while infatuated or taunted cures it. This Pokemon is immune to the effect of the Intimidate Ability.*/
 public class Oblivious extends PokemonBattleEffect{

/*@Override
 void onUpdate(pokemon) {
      if (pokemon.volatiles["attract"]) {
        this.add("-activate", pokemon, "ability: Oblivious");
        pokemon.removeVolatile("attract");
        this.add("-end", pokemon, "move: Attract", "[from] ability: Oblivious");
      }
      if (pokemon.volatiles["taunt"]) {
        this.add("-activate", pokemon, "ability: Oblivious");
        pokemon.removeVolatile("taunt");
      }
    }*/
/*@Override
 void onImmunity(type, pokemon) {
      if (type === "attract")
        return false;
    }*/
/*@Override
 void onTryHit(pokemon, Pokemon target, move) {
      if (move.id === "attract" || move.id === "captivate" || move.id === "taunt") {
        this.add("-immune", pokemon, "[from] ability: Oblivious");
        return null;
      }
    }*/
/*@Override
 void onTryBoost(boost, Pokemon target, Pokemon source, effect) {
      if (effect.name === "Intimidate" && boost.atk) {
        delete boost.atk;
        this.add("-fail", target, "unboost", "Attack", "[from] ability: Oblivious", "[of] " + target);
      }
    }*/
public Oblivious(Pokemon pkmn) {
        super(pkmn);
    }
}