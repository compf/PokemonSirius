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
 public class Slush_Rush extends PokemonBattleEffect{

/*@Override
 void onModifySpe(spe, pokemon) {
      if (this.field.isWeather(["hail", "snow"])) {
        return this.chainModify(2);
      }
    }*/
public Slush_Rush(Pokemon pkmn) {
        super(pkmn);
    }
}