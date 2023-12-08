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
/*The user swaps its held item with the target's held item. Fails if either the user or the target is holding a Mail or Z-Crystal, if neither is holding an item, if the user is trying to give or take a Mega Stone to or from the species that can Mega Evolve with it, or if the user is trying to give or take a Blue Orb, a Red Orb, a Griseous Orb, a Plate, a Drive, or a Memory to or from a Kyogre, a Groudon, a Giratina, an Arceus, a Genesect, or a Silvally, respectively. The target is immune to this move if it has the Sticky Hold Ability.*/
 public class Switcheroo extends PokemonBattleEffect{

/*@Override
 void onTryImmunity(target) {
      return !target.hasAbility("stickyhold");
    }*/
/*@Override
 void onHit(Pokemon target, Pokemon source, move) {
      const yourItem = target.takeItem(source);
      const myItem = source.takeItem();
      if (target.item || source.item || !yourItem && !myItem) {
        if (yourItem)
          target.item = yourItem.id;
        if (myItem)
          source.item = myItem.id;
        return false;
      }
      if (myItem && !this.singleEvent("TakeItem", myItem, source.itemState, target, source, Move move, myItem) || yourItem && !this.singleEvent("TakeItem", yourItem, target.itemState, source, target, move, yourItem)) {
        if (yourItem)
          target.item = yourItem.id;
        if (myItem)
          source.item = myItem.id;
        return false;
      }
      this.add("-activate", source, "move: Trick", "[of] " + target);
      if (myItem) {
        target.setItem(myItem);
        this.add("-item", target, myItem, "[from] move: Switcheroo");
      } else {
        this.add("-enditem", target, yourItem, "[silent]", "[from] move: Switcheroo");
      }
      if (yourItem) {
        source.setItem(yourItem);
        this.add("-item", source, yourItem, "[from] move: Switcheroo");
      } else {
        this.add("-enditem", source, myItem, "[silent]", "[from] move: Switcheroo");
      }
    }*/
public Switcheroo(Pokemon pkmn) {
        super(pkmn);
    }
}