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
/*This attack charges on the first turn and executes on the second. On the first turn, the user avoids all attacks other than Gust, Hurricane, Sky Uppercut, Smack Down, Thousand Arrows, Thunder, and Twister, and Gust and Twister have doubled power when used against it. If the user is holding a Power Herb, the move completes in one turn.*/
 public class Fly extends PokemonBattleEffect{

/*@Override
 void onTryMove(attacker, defender, move) {
      if (attacker.removeVolatile(move.id)) {
        return;
      }
      this.add("-prepare", attacker, move.name);
      if (!this.runEvent("ChargeMove", attacker, defender, move)) {
        return;
      }
      attacker.addVolatile("twoturnmove", defender);
      return null;
    }*/
/*@Override
 void 2*/
/*@Override
 void onInvulnerability(Pokemon target, Pokemon source, move) {
        if (["gust", "twister", "skyuppercut", "thunder", "hurricane", "smackdown", "thousandarrows"].includes(move.id)) {
          return;
        }
        return false;
      }*/
/*@Override
 void onSourceModifyDamage(DamageInformation damage, Pokemon source, Pokemon target, move) {
        if (move.id === "gust" || move.id === "twister") {
          return this.chainModify(2);
        }
      }*/
public Fly(Pokemon pkmn) {
        super(pkmn);
    }
}