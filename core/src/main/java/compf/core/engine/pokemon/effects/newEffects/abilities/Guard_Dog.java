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
/*This Pokemon is immune to the effect of the Intimidate Ability and raises its Attack by 1 stage instead. This Pokemon cannot be forced to switch out by another Pokemon's attack or item.*/
 public class Guard_Dog extends PokemonBattleEffect{

/*@Override
 void onDragOut(pokemon) {
      this.add("-activate", pokemon, "ability: Guard Dog");
      return null;
    }*/
/*@Override
 void onTryBoost(boost, Pokemon target, Pokemon source, effect) {
      if (effect.name === "Intimidate" && boost.atk) {
        delete boost.atk;
        this.boost({ atk: 1 }, target, target, null, false, true);
      }
    }*/
public Guard_Dog(Pokemon pkmn) {
        super(pkmn);
    }
}