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
/*The power of this move is based on the amount of PP remaining after normal PP reduction and the Pressure Ability resolve. 200 power for 0 PP, 80 power for 1 PP, 60 power for 2 PP, 50 power for 3 PP, and 40 power for 4 or more PP.*/
 public class Trump_Card extends PokemonBattleEffect{

/*@Override
 void basePowerCallback(Pokemon source, Pokemon target, move) {
      const callerMoveId = move.sourceEffect || move.id;
      const moveSlot = callerMoveId === "instruct" ? source.getMoveData(move.id) : source.getMoveData(callerMoveId);
      let bp;
      if (!moveSlot) {
        bp = 40;
      } else {
        switch (moveSlot.pp) {
          case 0:
            bp = 200;
            break;
          case 1:
            bp = 80;
            break;
          case 2:
            bp = 60;
            break;
          case 3:
            bp = 50;
            break;
          default:
            bp = 40;
            break;
        }
      }
      this.debug("BP: " + bp);
      return bp;
    }*/
public Trump_Card(Pokemon pkmn) {
        super(pkmn);
    }
}