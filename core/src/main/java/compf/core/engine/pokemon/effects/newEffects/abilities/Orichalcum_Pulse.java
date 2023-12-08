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
 public class Orichalcum_Pulse extends PokemonBattleEffect{

/*@Override
 void onStart(pokemon) {
      if (this.field.setWeather("sunnyday")) {
        this.add("-activate", pokemon, "Orichalcum Pulse", "[source]");
      } else if (this.field.isWeather("sunnyday")) {
        this.add("-activate", pokemon, "ability: Orichalcum Pulse");
      }
    }*/
/*@Override
 void onModifyAtk(atk, pokemon) {
      if (["sunnyday", "desolateland"].includes(pokemon.effectiveWeather())) {
        this.debug("Orichalcum boost");
        return this.chainModify([5461, 4096]);
      }
    }*/
public Orichalcum_Pulse(Pokemon pkmn) {
        super(pkmn);
    }
}