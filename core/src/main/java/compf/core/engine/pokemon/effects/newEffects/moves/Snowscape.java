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
/*For 5 turns, the weather becomes Snow. During the effect, the Defense of Ice-type Pokemon is multiplied by 1.5 when taking damage from a physical attack. Lasts for 8 turns if the user is holding Icy Rock. Fails if the current weather is Snow.*/
 public class Snowscape extends PokemonBattleEffect{

public Snowscape(Pokemon pkmn) {
        super(pkmn);
    }
}