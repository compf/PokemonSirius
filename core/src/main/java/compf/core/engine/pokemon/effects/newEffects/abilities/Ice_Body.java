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
/*If Snow is active, this Pokemon restores 1/16 of its maximum HP, rounded down, at the end of each turn.*/
 public class Ice_Body extends PokemonBattleEffect{

/*@Override
 void onWeather(Pokemon target, Pokemon source, effect) {
      if (effect.id === "hail" || effect.id === "snow") {
        this.heal(target.baseMaxhp / 16);
      }
    }*/
/*@Override
 void onImmunity(type, pokemon) {
      if (type === "hail")
        return false;
    }*/
public Ice_Body(Pokemon pkmn) {
        super(pkmn);
    }
}