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
/*The user recovers 1/2 the HP lost by the target, rounded half up. If Big Root is held by the user, the HP recovered is 1.3x normal, rounded half down.*/
 public class Parabolic_Charge extends PokemonBattleEffect{

public Parabolic_Charge(Pokemon pkmn) {
        super(pkmn);
    }
}