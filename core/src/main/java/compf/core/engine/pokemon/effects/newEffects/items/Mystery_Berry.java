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
/*(Gen 2) Restores 5 PP to the first of the holder's moves to reach 0 PP. Single use.*/
 public class Mystery_Berry extends PokemonBattleEffect{

/*@Override
 void onUpdate(pokemon) {
      if (!pokemon.hp)
        return;
      const moveSlot = pokemon.lastMove && pokemon.getMoveData(pokemon.lastMove.id);
      if (moveSlot && moveSlot.pp === 0) {
        pokemon.addVolatile("leppaberry");
        pokemon.volatiles["leppaberry"].moveSlot = moveSlot;
        pokemon.eatItem();
      }
    }*/
/*@Override
 void onEat(pokemon) {
      let moveSlot;
      if (pokemon.volatiles["leppaberry"]) {
        moveSlot = pokemon.volatiles["leppaberry"].moveSlot;
        pokemon.removeVolatile("leppaberry");
      } else {
        let pp = 99;
        for (const possibleMoveSlot of pokemon.moveSlots) {
          if (possibleMoveSlot.pp < pp) {
            moveSlot = possibleMoveSlot;
            pp = moveSlot.pp;
          }
        }
      }
      moveSlot.pp += 5;
      if (moveSlot.pp > moveSlot.maxpp)
        moveSlot.pp = moveSlot.maxpp;
      this.add("-activate", pokemon, "item: Mystery Berry", moveSlot.move);
    }*/
public Mystery_Berry(Pokemon pkmn) {
        super(pkmn);
    }
}