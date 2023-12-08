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
/*(Gen 2) Restores 10 HP when at 1/2 max HP or less. Single use.*/
 public class Berry extends PokemonBattleEffect{

/*@Override
 void onResidual(pokemon) {
      if (pokemon.hp <= pokemon.maxhp / 2) {
        pokemon.eatItem();
      }
    }*/
/*@Override
 void onTryEatItem(item, pokemon) {
      if (!this.runEvent("TryHeal", pokemon, null, this.effect, 10))
        return false;
    }*/
/*@Override
 void onEat(pokemon) {
      this.heal(10);
    }*/
public Berry(Pokemon pkmn) {
        super(pkmn);
    }
}