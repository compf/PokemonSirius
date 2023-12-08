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
/*If the target is holding an item that can be removed from it, ignoring the Sticky Hold Ability, this move's power is multiplied by 1.5. If the user has not fainted, the target loses its held item. This move cannot cause Pokemon with the Sticky Hold Ability to lose their held item or cause a Kyogre, a Groudon, a Giratina, an Arceus, a Genesect, a Silvally, a Zacian, or a Zamazenta to lose their Blue Orb, Red Orb, Griseous Orb, Plate, Drive, Memory, Rusted Sword, or Rusted Shield respectively. Items lost to this move cannot be regained with Recycle or the Harvest Ability.*/
 public class Knock_Off extends PokemonBattleEffect{

/*@Override
 void onBasePower(basePower, Pokemon source, Pokemon target, move) {
      const item = target.getItem();
      if (!this.singleEvent("TakeItem", item, target.itemState, target, target, Move move, item))
        return;
      if (item.id) {
        return this.chainModify(1.5);
      }
    }*/
/*@Override
 void onAfterHit(Pokemon target, source) {
      if (source.hp) {
        const item = target.takeItem();
        if (item) {
          this.add("-enditem", target, item.name, "[from] move: Knock Off", "[of] " + source);
        }
      }
    }*/
public Knock_Off(Pokemon pkmn) {
        super(pkmn);
    }
}