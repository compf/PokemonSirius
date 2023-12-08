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
/*undefined*/
 public class Shield_Dust extends PokemonBattleEffect{

/*@Override
 void onModifySecondaries(secondaries) {
      this.debug("Shield Dust prevent secondary");
      return secondaries.filter((effect) => !!(effect.self || effect.dustproof));
    }*/
public Shield_Dust(Pokemon pkmn) {
        super(pkmn);
    }
}