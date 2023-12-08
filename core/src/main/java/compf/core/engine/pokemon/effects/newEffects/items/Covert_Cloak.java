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
/*Holder is not affected by the secondary effect of another Pokemon's attack.*/
 public class Covert_Cloak extends PokemonBattleEffect{

/*@Override
 void onModifySecondaries(secondaries) {
      this.debug("Covert Cloak prevent secondary");
      return secondaries.filter((effect) => !!(effect.self || effect.dustproof));
    }*/
public Covert_Cloak(Pokemon pkmn) {
        super(pkmn);
    }
}