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
/*The user and its party members are protected from non-damaging attacks made by other Pokemon, including allies, during this turn. Fails if the user moves last this turn or if this move is already in effect for the user's side.*/
 public class Crafty_Shield extends PokemonBattleEffect{

/*@Override
 void onTry() {
      return !!this.queue.willAct();
    }*/
/*@Override
 void 1*/
/*@Override
 void onSideStart(Pokemon target, source) {
        this.add("-singleturn", Pokemon source, "Crafty Shield");
      }*/
/*@Override
 void 3*/
/*@Override
 void onTryHit(Pokemon target, Pokemon source, move) {
        if (["self", "all"].includes(move.target) || move.category !== "Status")
          return;
        this.add("-activate", target, "move: Crafty Shield");
        return this.NOT_FAIL;
      }*/
public Crafty_Shield(Pokemon pkmn) {
        super(pkmn);
    }
}