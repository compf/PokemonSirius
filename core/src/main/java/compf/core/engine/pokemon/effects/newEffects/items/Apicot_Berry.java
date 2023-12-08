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
/*Raises holder's Sp. Def by 1 stage when at 1/4 max HP or less. Single use.*/
 public class Apicot_Berry extends PokemonBattleEffect{

/*@Override
 void onUpdate(pokemon) {
      if (pokemon.hp <= pokemon.maxhp / 4 || pokemon.hp <= pokemon.maxhp / 2 && pokemon.hasAbility("gluttony") && pokemon.abilityState.gluttony) {
        pokemon.eatItem();
      }
    }*/
/*@Override
 void onEat(pokemon) {
      this.boost({ spd: 1 });
    }*/
public Apicot_Berry(Pokemon pkmn) {
        super(pkmn);
    }
}