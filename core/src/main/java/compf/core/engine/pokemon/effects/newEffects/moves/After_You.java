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
/*The target makes its move immediately after the user this turn, no matter the priority of its selected move. Fails if the target would have moved next anyway, or if the target already moved this turn.*/
 public class After_You extends PokemonBattleEffect{

/*@Override
 void onHit(target) {
      if (this.activePerHalf === 1)
        return false;
      const action = this.queue.willMove(target);
      if (action) {
        this.queue.prioritizeAction(action);
        this.add("-activate", Pokemon target, "move: After You");
      } else {
        return false;
      }
    }*/
public After_You(Pokemon pkmn) {
        super(pkmn);
    }
}