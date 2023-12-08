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
 public class Water_Veil extends PokemonBattleEffect{

/*@Override
 void onUpdate(pokemon) {
      if (pokemon.status === "brn") {
        this.add("-activate", pokemon, "ability: Water Veil");
        pokemon.cureStatus();
      }
    }*/
/*@Override
 void onSetStatus(status, Pokemon target, Pokemon source, effect) {
      if (status.id !== "brn")
        return;
      if (effect?.status) {
        this.add("-immune", target, "[from] ability: Water Veil");
      }
      return false;
    }*/
public Water_Veil(Pokemon pkmn) {
        super(pkmn);
    }
}