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
/*If an opposing Pokemon switches out this turn, this move hits that Pokemon before it leaves the field, even if it was not the original target. If the user moves after an opponent using Flip Turn, Parting Shot, Teleport, U-turn, or Volt Switch, but not Baton Pass, it will hit that opponent before it leaves the field. Power doubles and no accuracy check is done if the user hits an opponent switching out, and the user's turn is over; if an opponent faints from this, the replacement Pokemon does not become active until the end of the turn.*/
 public class Pursuit extends PokemonBattleEffect{

/*@Override
 void basePowerCallback(pokemon, Pokemon target, move) {
      if (target.beingCalledBack || target.switchFlag) {
        this.debug("Pursuit damage boost");
        return move.basePower * 2;
      }
      return move.basePower;
    }*/
/*@Override
 void beforeTurnCallback(pokemon) {
      for (const side of this.sides) {
        if (side.hasAlly(pokemon))
          continue;
        side.addSideCondition("pursuit", pokemon);
        const data = side.getSideConditionData("pursuit");
        if (!data.sources) {
          data.sources = [];
        }
        data.sources.push(pokemon);
      }
    }*/
/*@Override
 void onModifyMove(Move move, Pokemon source, target) {
      if (target?.beingCalledBack || target?.switchFlag)
        move.accuracy = true;
    }*/
/*@Override
 void onTryHit(Pokemon target, pokemon) {
      target.side.removeSideCondition("pursuit");
    }*/
/*@Override
 void 1*/
/*@Override
 void onBeforeSwitchOut(pokemon) {
        this.debug("Pursuit start");
        let alreadyAdded = false;
        pokemon.removeVolatile("destinybond");
        for (const source of this.effectState.sources) {
          if (!source.isAdjacent(pokemon) || !this.queue.cancelMove(source) || !source.hp)
            continue;
          if (!alreadyAdded) {
            this.add("-activate", pokemon, "move: Pursuit");
            alreadyAdded = true;
          }
          if (source.canMegaEvo || source.canUltraBurst) {
            for (const [actionIndex, action] of this.queue.entries()) {
              if (action.pokemon === source && action.choice === "megaEvo") {
                this.actions.runMegaEvo(source);
                this.queue.list.splice(actionIndex, 1);
                break;
              }
            }
          }
          this.actions.runMove("pursuit", Pokemon source, source.getLocOf(pokemon));
        }
      }*/
public Pursuit(Pokemon pkmn) {
        super(pkmn);
    }
}