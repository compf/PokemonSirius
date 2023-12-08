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
/*If the target lost HP, the user takes recoil damage equal to 1/4 the HP lost by the target, rounded half up, but not less than 1 HP.*/
 public class Wild_Charge extends PokemonBattleEffect{

public Wild_Charge(Pokemon pkmn) {
        super(pkmn);
    }
}