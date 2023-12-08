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
/*undefined*/
 public class Pickup extends PokemonBattleEffect{

/*@Override
 void onResidual(pokemon) {
      if (pokemon.item)
        return;
      const pickupTargets = this.getAllActive().filter((target) => target.lastItem && target.usedItemThisTurn && pokemon.isAdjacent(target));
      if (!pickupTargets.length)
        return;
      const randomTarget = this.sample(pickupTargets);
      const item = randomTarget.lastItem;
      randomTarget.lastItem = "";
      this.add("-item", pokemon, this.dex.items.get(item), "[from] ability: Pickup");
      pokemon.setItem(item);
    }*/
public Pickup(Pokemon pkmn) {
        super(pkmn);
    }
}