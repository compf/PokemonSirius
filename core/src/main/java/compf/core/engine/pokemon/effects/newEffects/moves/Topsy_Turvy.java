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
/*The target's positive stat stages become negative and vice versa. Fails if all of the target's stat stages are 0.*/
 public class Topsy_Turvy extends PokemonBattleEffect{

/*@Override
 void onHit(target) {
      let success = false;
      let i;
      for (i in target.boosts) {
        if (target.boosts[i] === 0)
          continue;
        target.boosts[i] = -target.boosts[i];
        success = true;
      }
      if (!success)
        return false;
      this.add("-invertboost", Pokemon target, "[from] move: Topsy-Turvy");
    }*/
public Topsy_Turvy(Pokemon pkmn) {
        super(pkmn);
    }
}