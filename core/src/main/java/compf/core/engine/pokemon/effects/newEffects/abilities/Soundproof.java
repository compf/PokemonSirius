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
 public class Soundproof extends PokemonBattleEffect{

/*@Override
 void onTryHit(Pokemon target, Pokemon source, move) {
      if (target !== source && move.flags["sound"]) {
        this.add("-immune", target, "[from] ability: Soundproof");
        return null;
      }
    }*/
/*@Override
 void onAllyTryHitSide(Pokemon target, Pokemon source, move) {
      if (move.flags["sound"]) {
        this.add("-immune", this.effectState.target, "[from] ability: Soundproof");
      }
    }*/
public Soundproof(Pokemon pkmn) {
        super(pkmn);
    }
}