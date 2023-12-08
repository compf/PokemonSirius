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
/*Badly poisons the target. If a Poison-type Pokemon uses this move, the target cannot avoid the attack, even if the target is in the middle of a two-turn move.*/
 public class Toxic extends PokemonBattleEffect{

public Toxic(Pokemon pkmn) {
        super(pkmn);
    }
}