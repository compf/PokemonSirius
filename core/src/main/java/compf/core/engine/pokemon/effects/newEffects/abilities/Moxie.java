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
/*This Pokemon's Attack is raised by 1 stage if it attacks and knocks out another Pokemon.*/
 public class Moxie extends PokemonBattleEffect{

/*@Override
 void onSourceAfterFaint(length, Pokemon target, Pokemon source, effect) {
      if (effect && effect.effectType === "Move") {
        this.boost({ atk: length }, source);
      }
    }*/
public Moxie(Pokemon pkmn) {
        super(pkmn);
    }
}