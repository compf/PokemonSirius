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
/*Restores 1/3 max HP at 1/4 max HP or less; confuses if -Spe Nature. Single use.*/
 public class Mago_Berry extends PokemonBattleEffect{

/*@Override
 void onUpdate(pokemon) {
      if (pokemon.hp <= pokemon.maxhp / 4 || pokemon.hp <= pokemon.maxhp / 2 && pokemon.hasAbility("gluttony") && pokemon.abilityState.gluttony) {
        pokemon.eatItem();
      }
    }*/
/*@Override
 void onTryEatItem(item, pokemon) {
      if (!this.runEvent("TryHeal", pokemon, null, this.effect, pokemon.baseMaxhp / 3))
        return false;
    }*/
/*@Override
 void onEat(pokemon) {
      this.heal(pokemon.baseMaxhp / 3);
      if (pokemon.getNature().minus === "spe") {
        pokemon.addVolatile("confusion");
      }
    }*/
public Mago_Berry(Pokemon pkmn) {
        super(pkmn);
    }
}