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
/*The user regains the item it last used. Fails if the user is holding an item, if the user has not held an item, if the item was a popped Air Balloon, if the item was picked up by a Pokemon with the Pickup Ability, or if the item was lost to Bug Bite, Corrosive Gas, Covet, Incinerate, Knock Off, Pluck, or Thief. Items thrown with Fling can be regained.*/
 public class Recycle extends PokemonBattleEffect{

/*@Override
 void onHit(pokemon) {
      if (pokemon.item || !pokemon.lastItem)
        return false;
      const item = pokemon.lastItem;
      pokemon.lastItem = "";
      this.add("-item", pokemon, this.dex.items.get(item), "[from] move: Recycle");
      pokemon.setItem(item);
    }*/
public Recycle(Pokemon pkmn) {
        super(pkmn);
    }
}