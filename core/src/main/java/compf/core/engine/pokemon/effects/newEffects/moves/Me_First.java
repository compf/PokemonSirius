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
/*The user uses the move the target chose for use this turn against it, if possible, with its power multiplied by 1.5. The move must be a damaging move other than Beak Blast, Belch, Blazing Torque, Combat Torque, Comeuppance, Counter, Covet, Focus Punch, Magical Torque, Me First, Metal Burst, Mirror Coat, Noxious Torque, Shell Trap, Struggle, Thief, or Wicked Torque. Fails if the target moves before the user. Ignores the target's substitute for the purpose of copying the move.*/
 public class Me_First extends PokemonBattleEffect{

/*@Override
 void onTryHit(Pokemon target, pokemon) {
      const action = this.queue.willMove(target);
      if (!action)
        return false;
      const move = this.dex.getActiveMove(action.move.id);
      if (action.zmove || move.isZ || move.isMax)
        return false;
      if (target.volatiles["mustrecharge"])
        return false;
      if (move.category === "Status" || move.flags["failmefirst"])
        return false;
      pokemon.addVolatile("mefirst");
      this.actions.useMove(Move move, pokemon, target);
      return null;
    }*/
/*@Override
 void 1*/
/*@Override
 void 12*/
/*@Override
 void onBasePower(basePower) {
        return this.chainModify(1.5);
      }*/
public Me_First(Pokemon pkmn) {
        super(pkmn);
    }
}