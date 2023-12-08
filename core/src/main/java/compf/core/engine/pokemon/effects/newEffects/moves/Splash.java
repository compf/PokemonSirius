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
/*undefined*/
 public class Splash extends PokemonBattleEffect{

/*@Override
 void onTry(Pokemon source, Pokemon target, move) {
      if (this.field.getPseudoWeather("Gravity")) {
        this.add("cant", source, "move: Gravity", move);
        return null;
      }
    }*/
/*@Override
 void onTryHit(Pokemon target, source) {
      this.add("-nothing");
    }*/
public Splash(Pokemon pkmn) {
        super(pkmn);
    }
}