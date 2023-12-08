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
 public class Wonder_Guard extends PokemonBattleEffect{

/*@Override
 void onTryHit(Pokemon target, Pokemon source, move) {
      if (target === source || move.category === "Status" || move.type === "???" || move.id === "struggle")
        return;
      if (move.id === "skydrop" && !source.volatiles["skydrop"])
        return;
      this.debug("Wonder Guard immunity: " + move.id);
      if (target.runEffectiveness(move) <= 0) {
        if (move.smartTarget) {
          move.smartTarget = false;
        } else {
          this.add("-immune", target, "[from] ability: Wonder Guard");
        }
        return null;
      }
    }*/
public Wonder_Guard(Pokemon pkmn) {
        super(pkmn);
    }
}