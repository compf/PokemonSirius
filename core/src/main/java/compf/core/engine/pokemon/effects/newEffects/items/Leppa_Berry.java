package compf.core.engine.pokemon.effects.newEffects.items;

import compf.core.engine.BattleAction;
    import compf.core.engine.pokemon.PokemonStat;
    import compf.core.engine.pokemon.Pokemon;
    import compf.core.engine.pokemon.effects.EffectParam;
    import compf.core.engine.pokemon.effects.PokemonBattleEffect;
    import compf.core.engine.pokemon.moves.DamageInformation;
    import compf.core.engine.pokemon.moves.Schedule;
    import compf.core.engine.pokemon.moves.Schedule.ScheduleItem;
    import compf.core.etc.services.SharedInformation;
/*Restores 10 PP to the first of the holder's moves to reach 0 PP. Single use.*/
 public class Leppa_Berry extends PokemonBattleEffect{

/*@Override
 void onUpdate(pokemon) {
      if (!pokemon.hp)
        return;
      if (pokemon.moveSlots.some((move) => move.pp === 0)) {
        pokemon.eatItem();
      }
    }*/
/*@Override
 void onEat(pokemon) {
      const moveSlot = pokemon.moveSlots.find((move) => move.pp === 0) || pokemon.moveSlots.find((move) => move.pp < move.maxpp);
      if (!moveSlot)
        return;
      moveSlot.pp += 10;
      if (moveSlot.pp > moveSlot.maxpp)
        moveSlot.pp = moveSlot.maxpp;
      this.add("-activate", pokemon, "item: Leppa Berry", moveSlot.Move move, "[consumed]");
    }*/
public Leppa_Berry(Pokemon pkmn) {
        super(pkmn);
    }
}