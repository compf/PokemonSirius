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
/*If this Pokemon loses its held item for any reason, its Speed is doubled as long as it remains active, has this Ability, and is not holding an item.*/
 public class Unburden extends PokemonBattleEffect{

/*@Override
 void onAfterUseItem(item, pokemon) {
      if (pokemon !== this.effectState.target)
        return;
      pokemon.addVolatile("unburden");
    }*/
/*@Override
 void onTakeItem(item, pokemon) {
      pokemon.addVolatile("unburden");
    }*/
/*@Override
 void onEnd(pokemon) {
      pokemon.removeVolatile("unburden");
    }*/
/*@Override
 void onModifySpe(spe, pokemon) {
        if (!pokemon.item && !pokemon.ignoringAbility()) {
          return this.chainModify(2);
        }
      }*/
public Unburden(Pokemon pkmn) {
        super(pkmn);
    }
}