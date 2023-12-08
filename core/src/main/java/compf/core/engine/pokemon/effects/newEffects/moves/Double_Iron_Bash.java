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
/*Hits twice. If the first hit breaks the target's substitute, it will take damage for the second hit. Has a 30% chance to make the target flinch.*/
 public class Double_Iron_Bash extends PokemonBattleEffect{

public Double_Iron_Bash(Pokemon pkmn) {
        super(pkmn);
    }
}