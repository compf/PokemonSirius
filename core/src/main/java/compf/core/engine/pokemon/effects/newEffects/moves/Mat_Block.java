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
/*The user and its party members are protected from damaging attacks made by other Pokemon, including allies, during this turn. Fails unless it is the user's first turn on the field, if the user moves last this turn, or if this move is already in effect for the user's side.*/
 public class Mat_Block extends PokemonBattleEffect{

/*@Override
 void onTry(source) {
      if (source.activeMoveActions > 1) {
        this.hint("Mat Block only works on your first turn out.");
        return false;
      }
      return !!this.queue.willAct();
    }*/
/*@Override
 void 1*/
/*@Override
 void onSideStart(Pokemon target, source) {
        this.add("-singleturn", Pokemon source, "Mat Block");
      }*/
/*@Override
 void 3*/
/*@Override
 void onTryHit(Pokemon target, Pokemon source, move) {
        if (!move.flags["protect"]) {
          if (["gmaxoneblow", "gmaxrapidflow"].includes(move.id))
            return;
          if (move.isZ || move.isMax)
            target.getMoveHitData(move).zBrokeProtect = true;
          return;
        }
        if (move && (move.target === "self" || move.category === "Status"))
          return;
        this.add("-activate", target, "move: Mat Block", move.name);
        const lockedmove = source.getVolatile("lockedmove");
        if (lockedmove) {
          if (source.volatiles["lockedmove"].duration === 2) {
            delete source.volatiles["lockedmove"];
          }
        }
        return this.NOT_FAIL;
      }*/
public Mat_Block(Pokemon pkmn) {
        super(pkmn);
    }
}