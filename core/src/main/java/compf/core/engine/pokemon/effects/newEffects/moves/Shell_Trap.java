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
/*Fails unless the user is hit by a physical attack from an opponent this turn before it can execute the move. If the user was hit and has not fainted, it attacks immediately after being hit, and the effect ends. If the opponent's physical attack had a secondary effect removed by the Sheer Force Ability, it does not count for the purposes of this effect.*/
 public class Shell_Trap extends PokemonBattleEffect{

/*@Override
 void priorityChargeCallback(pokemon) {
      pokemon.addVolatile("shelltrap");
    }*/
/*@Override
 void onTryMove(pokemon) {
      if (!pokemon.volatiles["shelltrap"]?.gotHit) {
        this.attrLastMove("[still]");
        this.add("cant", pokemon, "Shell Trap", "Shell Trap");
        return null;
      }
    }*/
/*@Override
 void 1*/
/*@Override
 void onStart(pokemon) {
        this.add("-singleturn", pokemon, "move: Shell Trap");
      }*/
/*@Override
 void onHit(pokemon, Pokemon source, move) {
        if (!pokemon.isAlly(source) && move.category === "Physical") {
          this.effectState.gotHit = true;
          const action = this.queue.willMove(pokemon);
          if (action) {
            this.queue.prioritizeAction(action);
          }
        }
      }*/
public Shell_Trap(Pokemon pkmn) {
        super(pkmn);
    }
}