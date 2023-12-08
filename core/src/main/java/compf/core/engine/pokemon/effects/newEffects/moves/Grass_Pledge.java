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
/*If one of the user's allies chose to use Fire Pledge or Water Pledge this turn and has not moved yet, it takes its turn immediately after the user and the user's move does nothing. If combined with Fire Pledge, the ally uses Fire Pledge with 150 power and a sea of fire appears on the target's side for 4 turns, which causes damage to non-Fire types equal to 1/8 of their maximum HP, rounded down, at the end of each turn during effect, including the last turn. If combined with Water Pledge, the ally uses Grass Pledge with 150 power and a swamp appears on the target's side for 4 turns, which quarters the Speed of each Pokemon on that side. When used as a combined move, this move gains STAB no matter what the user's type is. This move does not consume the user's Grass Gem.*/
 public class Grass_Pledge extends PokemonBattleEffect{

/*@Override
 void basePowerCallback(Pokemon target, Pokemon source, move) {
      if (["waterpledge", "firepledge"].includes(move.sourceEffect)) {
        this.add("-combine");
        return 150;
      }
      return 80;
    }*/
/*@Override
 void onPrepareHit(Pokemon target, Pokemon source, move) {
      for (const action of this.queue.list) {
        if (!action.move || !action.pokemon?.isActive || action.pokemon.fainted || action.maxMove || action.zmove) {
          continue;
        }
        if (action.pokemon.isAlly(source) && ["waterpledge", "firepledge"].includes(action.move.id)) {
          this.queue.prioritizeAction(action, move);
          this.add("-waiting", source, action.pokemon);
          return null;
        }
      }
    }*/
/*@Override
 void onModifyMove(move) {
      if (move.sourceEffect === "waterpledge") {
        move.type = "Grass";
        move.forceSTAB = true;
        move.sideCondition = "grasspledge";
      }
      if (move.sourceEffect === "firepledge") {
        move.type = "Fire";
        move.forceSTAB = true;
        move.sideCondition = "firepledge";
      }
    }*/
/*@Override
 void 4*/
/*@Override
 void onSideStart(targetSide) {
        this.add("-sidestart", targetSide, "Grass Pledge");
      }*/
/*@Override
 void 26*/
/*@Override
 void 9*/
/*@Override
 void onSideEnd(targetSide) {
        this.add("-sideend", targetSide, "Grass Pledge");
      }*/
/*@Override
 void onModifySpe(spe, pokemon) {
        return this.chainModify(0.25);
      }*/
public Grass_Pledge(Pokemon pkmn) {
        super(pkmn);
    }
}