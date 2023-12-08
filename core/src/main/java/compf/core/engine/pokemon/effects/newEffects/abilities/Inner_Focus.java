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
/*This Pokemon cannot be made to flinch. This Pokemon is immune to the effect of the Intimidate Ability.*/
 public class Inner_Focus extends PokemonBattleEffect{

/*@Override
 void onTryAddVolatile(status, pokemon) {
      if (status.id === "flinch")
        return null;
    }*/
/*@Override
 void onTryBoost(boost, Pokemon target, Pokemon source, effect) {
      if (effect.name === "Intimidate" && boost.atk) {
        delete boost.atk;
        this.add("-fail", target, "unboost", "Attack", "[from] ability: Inner Focus", "[of] " + target);
      }
    }*/
public Inner_Focus(Pokemon pkmn) {
        super(pkmn);
    }
}