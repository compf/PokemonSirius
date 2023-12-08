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
/*This Pokemon's highest stat is raised by 1 stage if it attacks and knocks out another Pokemon. Stat stage changes are not considered. If multiple stats are tied, Attack, Defense, Special Attack, Special Defense, and Speed are prioritized in that order.*/
 public class Beast_Boost extends PokemonBattleEffect{

/*@Override
 void onSourceAfterFaint(length, Pokemon target, Pokemon source, effect) {
      if (effect && effect.effectType === "Move") {
        const bestStat = source.getBestStat(true, true);
        this.boost({ [bestStat]: length }, source);
      }
    }*/
public Beast_Boost(Pokemon pkmn) {
        super(pkmn);
    }
}