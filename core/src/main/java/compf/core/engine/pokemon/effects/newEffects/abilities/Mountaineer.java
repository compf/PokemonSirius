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
 public class Mountaineer extends PokemonBattleEffect{

/*@Override
 void onDamage(DamageInformation damage, Pokemon target, Pokemon source, effect) {
      if (effect && effect.id === "stealthrock") {
        return false;
      }
    }*/
/*@Override
 void onTryHit(Pokemon target, Pokemon source, move) {
      if (move.type === "Rock" && !target.activeTurns) {
        this.add("-immune", target, "[from] ability: Mountaineer");
        return null;
      }
    }*/
public Mountaineer(Pokemon pkmn) {
        super(pkmn);
    }
}