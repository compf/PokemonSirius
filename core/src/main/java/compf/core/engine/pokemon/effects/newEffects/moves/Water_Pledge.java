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
/*If one of the user's allies chose to use Fire Pledge or Grass Pledge this turn and has not moved yet, it takes its turn immediately after the user and the user's move does nothing. If combined with Fire Pledge, the ally uses Water Pledge with 150 power and a rainbow appears on the user's side for 4 turns, which doubles secondary effect chances and stacks with the Serene Grace Ability, except effects that cause flinching can only have their chance doubled once. If combined with Grass Pledge, the ally uses Grass Pledge with 150 power and a swamp appears on the target's side for 4 turns, which quarters the Speed of each Pokemon on that side. When used as a combined move, this move gains STAB no matter what the user's type is. This move does not consume the user's Water Gem, and cannot be redirected by the Storm Drain Ability.*/
 public class Water_Pledge extends PokemonBattleEffect{

/*@Override
 void basePowerCallback(Pokemon target, Pokemon source, move) {
      if (["firepledge", "grasspledge"].includes(move.sourceEffect)) {
        this.add("-combine");
        return 150;
      }
      return 80;
    }*/
/*@Override
 void onPrepareHit(Pokemon target, Pokemon source, move) {
      for (const action of this.queue) {
        if (action.choice !== "move")
          continue;
        const otherMove = action.move;
        const otherMoveUser = action.pokemon;
        if (!otherMove || !action.pokemon || !otherMoveUser.isActive || otherMoveUser.fainted || action.maxMove || action.zmove) {
          continue;
        }
        if (otherMoveUser.isAlly(source) && ["firepledge", "grasspledge"].includes(otherMove.id)) {
          this.queue.prioritizeAction(action, move);
          this.add("-waiting", source, otherMoveUser);
          return null;
        }
      }
    }*/
/*@Override
 void onModifyMove(Move move, pokemon) {
        if (move.secondaries && move.id !== "secretpower") {
          this.debug("doubling secondary chance");
          for (const secondary of move.secondaries) {
            if (pokemon.hasAbility("serenegrace") && secondary.volatileStatus === "flinch")
              continue;
            if (secondary.chance)
              secondary.chance *= 2;
          }
          if (move.self?.chance)
            move.self.chance *= 2;
        }
      }*/
/*@Override
 void 4*/
/*@Override
 void onSideStart(targetSide) {
        this.add("-sidestart", targetSide, "Water Pledge");
      }*/
/*@Override
 void 26*/
/*@Override
 void 7*/
/*@Override
 void onSideEnd(targetSide) {
        this.add("-sideend", targetSide, "Water Pledge");
      }*/
public Water_Pledge(Pokemon pkmn) {
        super(pkmn);
    }
}