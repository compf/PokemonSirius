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
/*Power is equal to the base move's Max Move power. If this move is successful, the Attack of each Pokemon on the opposing side is lowered by 1 stage, even if they have a substitute. This effect does not happen if the user is not Dynamaxed. If this move is used as a base move, it deals damage with a power of 0.*/
 public class Max_Wyrmwind extends PokemonBattleEffect{

public Max_Wyrmwind(Pokemon pkmn) {
        super(pkmn);
    }
}