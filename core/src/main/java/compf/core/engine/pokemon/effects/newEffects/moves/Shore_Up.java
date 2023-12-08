package compf.core.engine.pokemon.effects.newEffects.moves;

import compf.core.engine.BattleAction;
    import compf.core.engine.pokemon.PokemonStat;
    import compf.core.engine.pokemon.Pokemon;
    import compf.core.engine.pokemon.effects.EffectParam;
    import compf.core.engine.pokemon.effects.PokemonBattleEffect;
    import compf.core.engine.pokemon.moves.DamageInformation;
    import compf.core.engine.pokemon.moves.Schedule;
    import compf.core.engine.pokemon.moves.Schedule.ScheduleItem;
    import compf.core.etc.services.SharedInformation;
/*The user restores 1/2 of its maximum HP, rounded half down. If the weather is Sandstorm, the user instead restores 2/3 of its maximum HP, rounded half down.*/
 public class Shore_Up extends PokemonBattleEffect{

/*@Override
 void onHit(pokemon) {
      let factor = 0.5;
      if (this.field.isWeather("sandstorm")) {
        factor = 0.667;
      }
      const success = !!this.heal(this.modify(pokemon.maxhp, factor));
      if (!success) {
        this.add("-fail", pokemon, "heal");
        return this.NOT_FAIL;
      }
      return success;
    }*/
public Shore_Up(Pokemon pkmn) {
        super(pkmn);
    }
}