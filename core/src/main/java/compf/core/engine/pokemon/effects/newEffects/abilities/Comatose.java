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
/*This Pokemon is considered to be asleep and cannot become affected by a non-volatile status condition or Yawn.*/
 public class Comatose extends PokemonBattleEffect{

/*@Override
 void onStart(pokemon) {
      this.add("-ability", pokemon, "Comatose");
    }*/
/*@Override
 void onSetStatus(status, Pokemon target, Pokemon source, effect) {
      if (effect?.status) {
        this.add("-immune", target, "[from] ability: Comatose");
      }
      return false;
    }*/
public Comatose(Pokemon pkmn) {
        super(pkmn);
    }
}