package compf.core.engine.pokemon.effects.newEffects.abilities;

import compf.core.engine.BattleAction;
    import compf.core.engine.pokemon.PokemonStat;
    import compf.core.engine.pokemon.Pokemon;
    import compf.core.engine.pokemon.effects.EffectParam;
    import compf.core.engine.pokemon.effects.PokemonBattleEffect;
    import compf.core.engine.pokemon.moves.DamageInformation;
    import compf.core.engine.pokemon.moves.Schedule;
    import compf.core.engine.pokemon.moves.Schedule.ScheduleItem;
    import compf.core.etc.services.SharedInformation;
/*This Pokemon's Attack is multiplied by 1.5, but it can only select the first move it executes. These effects are prevented while this Pokemon is Dynamaxed.*/
 public class Gorilla_Tactics extends PokemonBattleEffect{

/*@Override
 void onStart(pokemon) {
      pokemon.abilityState.choiceLock = "";
    }*/
/*@Override
 void onBeforeMove(pokemon, Pokemon target, move) {
      if (move.isZOrMaxPowered || move.id === "struggle")
        return;
      if (pokemon.abilityState.choiceLock && pokemon.abilityState.choiceLock !== move.id) {
        this.addMove("move", pokemon, move.name);
        this.attrLastMove("[still]");
        this.debug("Disabled by Gorilla Tactics");
        this.add("-fail", pokemon);
        return false;
      }
    }*/
/*@Override
 void onModifyMove(Move move, pokemon) {
      if (pokemon.abilityState.choiceLock || move.isZOrMaxPowered || move.id === "struggle")
        return;
      pokemon.abilityState.choiceLock = move.id;
    }*/
/*@Override
 void onModifyAtk(atk, pokemon) {
      if (pokemon.volatiles["dynamax"])
        return;
      this.debug("Gorilla Tactics Atk Boost");
      return this.chainModify(1.5);
    }*/
/*@Override
 void onDisableMove(pokemon) {
      if (!pokemon.abilityState.choiceLock)
        return;
      if (pokemon.volatiles["dynamax"])
        return;
      for (const moveSlot of pokemon.moveSlots) {
        if (moveSlot.id !== pokemon.abilityState.choiceLock) {
          pokemon.disableMove(moveSlot.id, false, this.effectState.sourceEffect);
        }
      }
    }*/
/*@Override
 void onEnd(pokemon) {
      pokemon.abilityState.choiceLock = "";
    }*/
public Gorilla_Tactics(Pokemon pkmn) {
        super(pkmn);
    }
}