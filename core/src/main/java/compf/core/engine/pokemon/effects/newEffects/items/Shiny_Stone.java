package compf.core.engine.pokemon.effects.newEffects.items;

import compf.core.engine.BattleAction;
    import compf.core.engine.pokemon.PokemonStat;
    import compf.core.engine.pokemon.Pokemon;
    import compf.core.engine.pokemon.effects.EffectParam;
    import compf.core.engine.pokemon.effects.PokemonBattleEffect;
    import compf.core.engine.pokemon.moves.DamageInformation;
    import compf.core.engine.pokemon.moves.Schedule;
    import compf.core.engine.pokemon.moves.Schedule.ScheduleItem;
    import compf.core.etc.services.SharedInformation;
/*Evolves Togetic into Togekiss, Roselia into Roserade, Minccino into Cinccino, and Floette into Florges when used.*/
 public class Shiny_Stone extends PokemonBattleEffect{

public Shiny_Stone(Pokemon pkmn) {
        super(pkmn);
    }
}