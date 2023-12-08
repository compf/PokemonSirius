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
/*The user cures its non-volatile status condition. Raises the user's Special Attack and Special Defense by 1 stage.*/
 public class Take_Heart extends PokemonBattleEffect{

/*@Override
 void onHit(pokemon) {
      const success = !!this.boost({ spa: 1, spd: 1 });
      return pokemon.cureStatus() || success;
    }*/
public Take_Heart(Pokemon pkmn) {
        super(pkmn);
    }
}