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
/*Restores 1/4 max HP when at 1/2 max HP or less. Single use.*/
 public class Sitrus_Berry extends PokemonBattleEffect{

/*@Override
 void onUpdate(pokemon) {
      if (pokemon.hp <= pokemon.maxhp / 2) {
        pokemon.eatItem();
      }
    }*/
/*@Override
 void onTryEatItem(item, pokemon) {
      if (!this.runEvent("TryHeal", pokemon, null, this.effect, pokemon.baseMaxhp / 4))
        return false;
    }*/
/*@Override
 void onEat(pokemon) {
      this.heal(pokemon.baseMaxhp / 4);
    }*/
public Sitrus_Berry(Pokemon pkmn) {
        super(pkmn);
    }
}