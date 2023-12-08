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
/*For 5 turns, the weather becomes Hail. At the end of each turn except the last, all active Pokemon lose 1/16 of their maximum HP, rounded down, unless they are an Ice type or have the Ice Body, Magic Guard, Overcoat, or Snow Cloak Abilities. Lasts for 8 turns if the user is holding Icy Rock. Fails if the current weather is Hail.*/
 public class Hail extends PokemonBattleEffect{

public Hail(Pokemon pkmn) {
        super(pkmn);
    }
}