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
 public class Bulletproof extends PokemonBattleEffect{

/*@Override
 void onTryHit(pokemon, Pokemon target, move) {
      if (move.flags["bullet"]) {
        this.add("-immune", pokemon, "[from] ability: Bulletproof");
        return null;
      }
    }*/
public Bulletproof(Pokemon pkmn) {
        super(pkmn);
    }
}