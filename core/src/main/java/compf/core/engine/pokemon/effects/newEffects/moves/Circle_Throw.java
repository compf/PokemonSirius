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
/*If both the user and the target have not fainted, the target is forced to switch out and be replaced with a random unfainted ally. This effect fails if the target is under the effect of Ingrain, has the Suction Cups Ability, or this move hit a substitute.*/
 public class Circle_Throw extends PokemonBattleEffect{

public Circle_Throw(Pokemon pkmn) {
        super(pkmn);
    }
}