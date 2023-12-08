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
/*Restores 20 HP when at 1/2 max HP or less. Single use.*/
 public class Berry_Juice extends PokemonBattleEffect{

/*@Override
 void onUpdate(pokemon) {
      if (pokemon.hp <= pokemon.maxhp / 2) {
        if (this.runEvent("TryHeal", pokemon, null, this.effect, 20) && pokemon.useItem()) {
          this.heal(20);
        }
      }
    }*/
public Berry_Juice(Pokemon pkmn) {
        super(pkmn);
    }
}