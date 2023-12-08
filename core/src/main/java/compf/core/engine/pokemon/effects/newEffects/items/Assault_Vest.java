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
/*Holder's Sp. Def is 1.5x, but it can only select damaging moves.*/
 public class Assault_Vest extends PokemonBattleEffect{

/*@Override
 void onModifySpD(spd) {
      return this.chainModify(1.5);
    }*/
/*@Override
 void onDisableMove(pokemon) {
      for (const moveSlot of pokemon.moveSlots) {
        if (this.dex.moves.get(moveSlot.move).category === "Status") {
          pokemon.disableMove(moveSlot.id);
        }
      }
    }*/
public Assault_Vest(Pokemon pkmn) {
        super(pkmn);
    }
}