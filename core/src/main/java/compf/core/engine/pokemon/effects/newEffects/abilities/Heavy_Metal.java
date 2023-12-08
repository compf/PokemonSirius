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
/*This Pokemon's weight is doubled. This effect is calculated after the effect of Autotomize, and before the effect of Float Stone.*/
 public class Heavy_Metal extends PokemonBattleEffect{

/*@Override
 void onModifyWeight(weighthg) {
      return weighthg * 2;
    }*/
public Heavy_Metal(Pokemon pkmn) {
        super(pkmn);
    }
}