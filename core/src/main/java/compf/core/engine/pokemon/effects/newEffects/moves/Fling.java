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
/*The power of this move is based on the user's held item. The held item is lost and it activates for the target if applicable. If there is no target or the target avoids this move by protecting itself, the user's held item is still lost. The user can regain a thrown item with Recycle or the Harvest Ability. Fails if the user has no held item, if the held item cannot be thrown, if the user is under the effect of Embargo or Magic Room, or if the user has the Klutz Ability.*/
 public class Fling extends PokemonBattleEffect{

/*@Override
 void onPrepareHit(Pokemon target, Pokemon source, move) {
      if (source.ignoringItem())
        return false;
      const item = source.getItem();
      if (!this.singleEvent("TakeItem", item, source.itemState, source, source, Move move, item))
        return false;
      if (!item.fling)
        return false;
      move.basePower = item.fling.basePower;
      this.debug("BP: " + move.basePower);
      if (item.isBerry) {
        move.onHit = function(foe) {
          if (this.singleEvent("Eat", item, null, foe, null, null)) {
            this.runEvent("EatItem", foe, null, null, item);
            if (item.id === "leppaberry")
              foe.staleness = "external";
          }
          if (item.onEat)
            foe.ateBerry = true;
        };
      } else if (item.fling.effect) {
        move.onHit = item.fling.effect;
      } else {
        if (!move.secondaries)
          move.secondaries = [];
        if (item.fling.status) {
          move.secondaries.push({ status: item.fling.status });
        } else if (item.fling.volatileStatus) {
          move.secondaries.push({ volatileStatus: item.fling.volatileStatus });
        }
      }
      source.addVolatile("fling");
    }*/
/*@Override
 void onUpdate(pokemon) {
        const item = pokemon.getItem();
        pokemon.setItem("");
        pokemon.lastItem = item.id;
        pokemon.usedItemThisTurn = true;
        this.add("-enditem", pokemon, item.name, "[from] move: Fling");
        this.runEvent("AfterUseItem", pokemon, null, null, item);
        pokemon.removeVolatile("fling");
      }*/
public Fling(Pokemon pkmn) {
        super(pkmn);
    }
}