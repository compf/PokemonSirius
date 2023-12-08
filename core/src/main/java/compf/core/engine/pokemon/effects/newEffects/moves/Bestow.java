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
/*The target receives the user's held item. Fails if the user has no item or is holding a Mail or Z-Crystal, if the target is already holding an item, if the user is a Kyogre holding a Blue Orb, a Groudon holding a Red Orb, a Giratina holding a Griseous Orb, an Arceus holding a Plate, a Genesect holding a Drive, a Silvally holding a Memory, a Pokemon that can Mega Evolve holding the Mega Stone for its species, or if the target is one of those Pokemon and the user is holding the respective item.*/
 public class Bestow extends PokemonBattleEffect{

/*@Override
 void onHit(Pokemon target, Pokemon source, move) {
      if (target.item) {
        return false;
      }
      const myItem = source.takeItem();
      if (!myItem)
        return false;
      if (!this.singleEvent("TakeItem", myItem, source.itemState, target, source, Move move, myItem) || !target.setItem(myItem)) {
        source.item = myItem.id;
        return false;
      }
      this.add("-item", target, myItem.name, "[from] move: Bestow", "[of] " + source);
    }*/
public Bestow(Pokemon pkmn) {
        super(pkmn);
    }
}