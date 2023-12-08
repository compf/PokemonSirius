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
/*If the current weather is Sunny Day and the user is not holding Utility Umbrella, this move's damage is multiplied by 1.5 instead of halved for being Water type.*/
 public class Hydro_Steam extends PokemonBattleEffect{

public Hydro_Steam(Pokemon pkmn) {
        super(pkmn);
    }
}