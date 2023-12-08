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
 public class Insomnia extends PokemonBattleEffect{

/*@Override
 void onUpdate(pokemon) {
      if (pokemon.status === "slp") {
        this.add("-activate", pokemon, "ability: Insomnia");
        pokemon.cureStatus();
      }
    }*/
/*@Override
 void onSetStatus(status, Pokemon target, Pokemon source, effect) {
      if (status.id !== "slp")
        return;
      if (effect?.status) {
        this.add("-immune", target, "[from] ability: Insomnia");
      }
      return false;
    }*/
/*@Override
 void onTryAddVolatile(status, target) {
      if (status.id === "yawn") {
        this.add("-immune", Pokemon target, "[from] ability: Insomnia");
        return null;
      }
    }*/
public Insomnia(Pokemon pkmn) {
        super(pkmn);
    }
}