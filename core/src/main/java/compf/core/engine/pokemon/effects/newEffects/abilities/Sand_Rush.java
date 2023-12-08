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
/*If Sandstorm is active, this Pokemon's Speed is doubled. This Pokemon takes no damage from Sandstorm.*/
 public class Sand_Rush extends PokemonBattleEffect{

/*@Override
 void onModifySpe(spe, pokemon) {
      if (this.field.isWeather("sandstorm")) {
        return this.chainModify(2);
      }
    }*/
/*@Override
 void onImmunity(type, pokemon) {
      if (type === "sandstorm")
        return false;
    }*/
public Sand_Rush(Pokemon pkmn) {
        super(pkmn);
    }
}