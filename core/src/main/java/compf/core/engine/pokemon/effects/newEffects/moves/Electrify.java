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
/*Causes the target's move to become Electric type this turn. Among effects that can change a move's type, this effect happens last. Fails if the target already moved this turn.*/
 public class Electrify extends PokemonBattleEffect{

/*@Override
 void onTryHit(target) {
      if (!this.queue.willMove(target) && target.activeTurns)
        return false;
    }*/
/*@Override
 void 1*/
/*@Override
 void onStart(target) {
        this.add("-singleturn", Pokemon target, "move: Electrify");
      }*/
/*@Override
 void -2*/
/*@Override
 void onModifyType(move) {
        if (move.id !== "struggle") {
          this.debug("Electrify making move type electric");
          move.type = "Electric";
        }
      }*/
public Electrify(Pokemon pkmn) {
        super(pkmn);
    }
}