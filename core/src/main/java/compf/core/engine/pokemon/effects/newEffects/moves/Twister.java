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
/*Has a 20% chance to make the target flinch. Power doubles if the target is using Bounce, Fly, or Sky Drop, or is under the effect of Sky Drop.*/
 public class Twister extends PokemonBattleEffect{

public Twister(Pokemon pkmn) {
        super(pkmn);
    }
}