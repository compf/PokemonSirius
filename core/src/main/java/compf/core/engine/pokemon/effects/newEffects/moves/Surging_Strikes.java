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
/*Hits three times. This move is always a critical hit unless the target is under the effect of Lucky Chant or has the Battle Armor or Shell Armor Abilities.*/
 public class Surging_Strikes extends PokemonBattleEffect{

public Surging_Strikes(Pokemon pkmn) {
        super(pkmn);
    }
}