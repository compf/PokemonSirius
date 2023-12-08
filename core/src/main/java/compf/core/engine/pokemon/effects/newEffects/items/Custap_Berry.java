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
/*Holder moves first in its priority bracket when at 1/4 max HP or less. Single use.*/
 public class Custap_Berry extends PokemonBattleEffect{

/*@Override
 void onFractionalPriority(priority, pokemon) {
      if (priority <= 0 && (pokemon.hp <= pokemon.maxhp / 4 || pokemon.hp <= pokemon.maxhp / 2 && pokemon.hasAbility("gluttony") && pokemon.abilityState.gluttony)) {
        if (pokemon.eatItem()) {
          this.add("-activate", pokemon, "item: Custap Berry", "[consumed]");
          return 0.1;
        }
      }
    }*/
/*@Override
 void onEat() {
    }*/
public Custap_Berry(Pokemon pkmn) {
        super(pkmn);
    }
}