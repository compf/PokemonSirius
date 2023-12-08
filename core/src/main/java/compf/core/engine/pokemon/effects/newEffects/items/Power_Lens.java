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
/*Holder's Speed is halved. The Klutz Ability does not ignore this effect.*/
 public class Power_Lens extends PokemonBattleEffect{

/*@Override
 void onModifySpe(spe) {
      return this.chainModify(0.5);
    }*/
public Power_Lens(Pokemon pkmn) {
        super(pkmn);
    }
}