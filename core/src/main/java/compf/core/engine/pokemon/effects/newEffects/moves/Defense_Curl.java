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
/*Raises the user's Defense by 1 stage. As long as the user remains active, the power of the user's Ice Ball and Rollout will be doubled (this effect is not stackable).*/
 public class Defense_Curl extends PokemonBattleEffect{

/*@Override
 void true*/
/*@Override
 void () => null*/
public Defense_Curl(Pokemon pkmn) {
        super(pkmn);
    }
}