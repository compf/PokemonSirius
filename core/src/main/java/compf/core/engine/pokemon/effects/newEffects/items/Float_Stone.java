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
/*Holder's weight is halved.*/
 public class Float_Stone extends PokemonBattleEffect{

/*@Override
 void onModifyWeight(weighthg) {
      return this.trunc(weighthg / 2);
    }*/
public Float_Stone(Pokemon pkmn) {
        super(pkmn);
    }
}