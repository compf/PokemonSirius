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
/*If this attack was successful and the user has not fainted, it steals the target's held item if the user is not holding one. The target's item is not stolen if it is a Mail or Z-Crystal, or if the target is a Kyogre holding a Blue Orb, a Groudon holding a Red Orb, a Giratina holding a Griseous Orb, an Arceus holding a Plate, a Genesect holding a Drive, a Silvally holding a Memory, or a Pokemon that can Mega Evolve holding the Mega Stone for its species. Items lost to this move cannot be regained with Recycle or the Harvest Ability.*/
 public class Covet extends PokemonBattleEffect{

/*@Override
 void onAfterHit(Pokemon target, Pokemon source, move) {
      if (source.item || source.volatiles["gem"]) {
        return;
      }
      const yourItem = target.takeItem(source);
      if (!yourItem) {
        return;
      }
      if (!this.singleEvent("TakeItem", yourItem, target.itemState, source, target, Move move, yourItem) || !source.setItem(yourItem)) {
        target.item = yourItem.id;
        return;
      }
      this.add("-item", source, yourItem, "[from] move: Covet", "[of] " + target);
    }*/
public Covet(Pokemon pkmn) {
        super(pkmn);
    }
}