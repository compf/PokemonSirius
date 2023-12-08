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
/*If Sandstorm is active, this Pokemon's Ground-, Rock-, and Steel-type attacks have their power multiplied by 1.3. This Pokemon takes no damage from Sandstorm.*/
 public class Sand_Force extends PokemonBattleEffect{

/*@Override
 void onBasePower(basePower, attacker, defender, move) {
      if (this.field.isWeather("sandstorm")) {
        if (move.type === "Rock" || move.type === "Ground" || move.type === "Steel") {
          this.debug("Sand Force boost");
          return this.chainModify([5325, 4096]);
        }
      }
    }*/
/*@Override
 void onImmunity(type, pokemon) {
      if (type === "sandstorm")
        return false;
    }*/
public Sand_Force(Pokemon pkmn) {
        super(pkmn);
    }
}