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
/*For 5 turns, the weather becomes Snow. The user switches out even if it is trapped and is replaced immediately by a selected party member. The user does not switch out if there are no unfainted party members.*/
 public class Chilly_Reception extends PokemonBattleEffect{

public Chilly_Reception(Pokemon pkmn) {
        super(pkmn);
    }
}