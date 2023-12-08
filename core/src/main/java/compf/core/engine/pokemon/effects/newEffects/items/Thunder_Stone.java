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
/*Evolves Pikachu into Raichu or Alolan Raichu, Eevee into Jolteon, Eelektrik into Eelektross, and Charjabug into Vikavolt when used.*/
 public class Thunder_Stone extends PokemonBattleEffect{

public Thunder_Stone(Pokemon pkmn) {
        super(pkmn);
    }
}