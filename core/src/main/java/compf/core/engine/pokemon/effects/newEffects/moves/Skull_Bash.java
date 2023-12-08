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
/*This attack charges on the first turn and executes on the second. Raises the user's Defense by 1 stage on the first turn. If the user is holding a Power Herb, the move completes in one turn.*/
 public class Skull_Bash extends PokemonBattleEffect{

/*@Override
 void onTryMove(attacker, defender, move) {
      if (attacker.removeVolatile(move.id)) {
        return;
      }
      this.add("-prepare", attacker, move.name);
      this.boost({ def: 1 }, attacker, attacker, move);
      if (!this.runEvent("ChargeMove", attacker, defender, move)) {
        return;
      }
      attacker.addVolatile("twoturnmove", defender);
      return null;
    }*/
public Skull_Bash(Pokemon pkmn) {
        super(pkmn);
    }
}