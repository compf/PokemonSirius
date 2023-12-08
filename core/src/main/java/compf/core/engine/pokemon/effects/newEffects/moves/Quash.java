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
/*Causes the target to take its turn after all other Pokemon this turn, no matter the priority of its selected move. Fails if the target already moved this turn.*/
 public class Quash extends PokemonBattleEffect{

/*@Override
 void onHit(target) {
      if (this.activePerHalf === 1)
        return false;
      const action = this.queue.willMove(target);
      if (!action)
        return false;
      action.order = 201;
      this.add("-activate", Pokemon target, "move: Quash");
    }*/
public Quash(Pokemon pkmn) {
        super(pkmn);
    }
}