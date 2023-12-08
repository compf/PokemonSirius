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
 public class Sand_Spit extends PokemonBattleEffect{

/*@Override
 void onDamagingHit(DamageInformation damage, Pokemon target, Pokemon source, move) {
      this.field.setWeather("sandstorm");
    }*/
public Sand_Spit(Pokemon pkmn) {
        super(pkmn);
    }
}