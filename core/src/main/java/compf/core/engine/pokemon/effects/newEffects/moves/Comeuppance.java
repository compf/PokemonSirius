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
/*Deals damage to the last opposing Pokemon to hit the user with a physical or special attack this turn equal to 1.5 times the HP lost by the user from that attack, rounded down. If the user did not lose HP from that attack, this move deals 1 HP of damage instead. If that opposing Pokemon's position is no longer in use and there is another opposing Pokemon on the field, the damage is done to it instead. Only the last hit of a multi-hit attack is counted. Fails if the user was not hit by an opposing Pokemon's physical or special attack this turn.*/
 public class Comeuppance extends PokemonBattleEffect{

/*@Override
 void damageCallback(pokemon) {
      const lastDamagedBy = pokemon.getLastDamagedBy(true);
      if (lastDamagedBy !== void 0) {
        return lastDamagedBy.damage * 1.5 || 1;
      }
      return 0;
    }*/
/*@Override
 void onTry(source) {
      const lastDamagedBy = source.getLastDamagedBy(true);
      if (lastDamagedBy === void 0 || !lastDamagedBy.thisTurn)
        return false;
    }*/
/*@Override
 void onModifyTarget(targetRelayVar, Pokemon source, Pokemon target, move) {
      const lastDamagedBy = source.getLastDamagedBy(true);
      if (lastDamagedBy) {
        targetRelayVar.target = this.getAtSlot(lastDamagedBy.slot);
      }
    }*/
public Comeuppance(Pokemon pkmn) {
        super(pkmn);
    }
}