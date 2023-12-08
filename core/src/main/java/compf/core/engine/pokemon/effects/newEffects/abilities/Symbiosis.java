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
/*If an ally uses its item, this Pokemon gives its item to that ally immediately. Does not activate if the ally's item was stolen or knocked off, or if the ally used an Eject Button or Eject Pack.*/
 public class Symbiosis extends PokemonBattleEffect{

/*@Override
 void onAllyAfterUseItem(item, pokemon) {
      if (pokemon.switchFlag)
        return;
      const source = this.effectState.target;
      const myItem = source.takeItem();
      if (!myItem)
        return;
      if (!this.singleEvent("TakeItem", myItem, source.itemState, pokemon, Pokemon source, this.effect, myItem) || !pokemon.setItem(myItem)) {
        source.item = myItem.id;
        return;
      }
      this.add("-activate", source, "ability: Symbiosis", myItem, "[of] " + pokemon);
    }*/
public Symbiosis(Pokemon pkmn) {
        super(pkmn);
    }
}