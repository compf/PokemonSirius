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
/*Deals damage to the last opposing Pokemon to hit the user with a physical attack this turn equal to twice the HP lost by the user from that attack. If the user did not lose HP from the attack, this move deals 1 HP of damage instead. If that opposing Pokemon's position is no longer in use and there is another opposing Pokemon on the field, the damage is done to it instead. Only the last hit of a multi-hit attack is counted. Fails if the user was not hit by an opposing Pokemon's physical attack this turn.*/
 public class Counter extends PokemonBattleEffect{

/*@Override
 void damageCallback(pokemon) {
      if (!pokemon.volatiles["counter"])
        return 0;
      return pokemon.volatiles["counter"].damage || 1;
    }*/
/*@Override
 void beforeTurnCallback(pokemon) {
      pokemon.addVolatile("counter");
    }*/
/*@Override
 void onTry(source) {
      if (!source.volatiles["counter"])
        return false;
      if (source.volatiles["counter"].slot === null)
        return false;
    }*/
/*@Override
 void 1*/
/*@Override
 void true*/
/*@Override
 void onStart(Pokemon target, Pokemon source, move) {
        this.effectState.slot = null;
        this.effectState.damage = 0;
      }*/
/*@Override
 void -1*/
/*@Override
 void onRedirectTarget(Pokemon target, Pokemon source, source2, move) {
        if (move.id !== "counter")
          return;
        if (source !== this.effectState.target || !this.effectState.slot)
          return;
        return this.getAtSlot(this.effectState.slot);
      }*/
/*@Override
 void onDamagingHit(DamageInformation damage, Pokemon target, Pokemon source, move) {
        if (!source.isAlly(target) && this.getCategory(move) === "Physical") {
          this.effectState.slot = source.getSlot();
          this.effectState.damage = 2 * damage;
        }
      }*/
public Counter(Pokemon pkmn) {
        super(pkmn);
    }
}