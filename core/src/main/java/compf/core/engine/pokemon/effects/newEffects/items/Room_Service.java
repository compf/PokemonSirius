package compf.core.engine.pokemon.effects.newEffects.items;

import compf.core.engine.BattleAction;
    import compf.core.engine.pokemon.PokemonStat;
    import compf.core.engine.pokemon.Pokemon;
    import compf.core.engine.pokemon.effects.EffectParam;
    import compf.core.engine.pokemon.effects.PokemonBattleEffect;
    import compf.core.engine.pokemon.moves.DamageInformation;
    import compf.core.engine.pokemon.moves.Schedule;
    import compf.core.engine.pokemon.moves.Schedule.ScheduleItem;
    import compf.core.etc.services.SharedInformation;
/*If Trick Room is active, the holder's Speed is lowered by 1 stage. Single use.*/
 public class Room_Service extends PokemonBattleEffect{

/*@Override
 void onStart(pokemon) {
      if (!pokemon.ignoringItem() && this.field.getPseudoWeather("trickroom")) {
        pokemon.useItem();
      }
    }*/
/*@Override
 void onAnyPseudoWeatherChange() {
      const pokemon = this.effectState.target;
      if (this.field.getPseudoWeather("trickroom")) {
        pokemon.useItem(pokemon);
      }
    }*/
public Room_Service(Pokemon pkmn) {
        super(pkmn);
    }
}