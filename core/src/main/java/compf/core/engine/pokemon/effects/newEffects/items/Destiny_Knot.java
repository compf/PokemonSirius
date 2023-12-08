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
/*If holder becomes infatuated, the other Pokemon also becomes infatuated.*/
 public class Destiny_Knot extends PokemonBattleEffect{

/*@Override
 void onAttract(Pokemon target, source) {
      this.debug("attract intercepted: " + target + " from " + source);
      if (!source || source === target)
        return;
      if (!source.volatiles["attract"])
        source.addVolatile("attract", target);
    }*/
public Destiny_Knot(Pokemon pkmn) {
        super(pkmn);
    }
}