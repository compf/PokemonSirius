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
/*The type and power of this move depend on the user's held Berry, and the Berry is lost. Fails if the user is not holding a Berry, if the user has the Klutz Ability, or if Embargo or Magic Room is in effect for the user.*/
 public class Natural_Gift extends PokemonBattleEffect{

/*@Override
 void onModifyType(Move move, pokemon) {
      if (pokemon.ignoringItem())
        return;
      const item = pokemon.getItem();
      if (!item.naturalGift)
        return;
      move.type = item.naturalGift.type;
    }*/
/*@Override
 void onPrepareHit(Pokemon target, pokemon, move) {
      if (pokemon.ignoringItem())
        return false;
      const item = pokemon.getItem();
      if (!item.naturalGift)
        return false;
      move.basePower = item.naturalGift.basePower;
      this.debug("BP: " + move.basePower);
      pokemon.setItem("");
      pokemon.lastItem = item.id;
      pokemon.usedItemThisTurn = true;
      this.runEvent("AfterUseItem", pokemon, null, null, item);
    }*/
public Natural_Gift(Pokemon pkmn) {
        super(pkmn);
    }
}