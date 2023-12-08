package compf.core.engine.pokemon.effects.newEffects.abilities;

import compf.core.engine.BattleAction;
    import compf.core.engine.pokemon.PokemonStat;
    import compf.core.engine.pokemon.Pokemon;
    import compf.core.engine.pokemon.effects.EffectParam;
    import compf.core.engine.pokemon.effects.PokemonBattleEffect;
    import compf.core.engine.pokemon.moves.DamageInformation;
    import compf.core.engine.pokemon.moves.Schedule;
    import compf.core.engine.pokemon.moves.Schedule.ScheduleItem;
    import compf.core.etc.services.SharedInformation;
/*The duration of Gravity, Heal Block, Magic Room, Safeguard, Tailwind, Trick Room, and Wonder Room is increased by 2 turns if the effect is started by this Pokemon.*/
 public class Persistent extends PokemonBattleEffect{

public Persistent(Pokemon pkmn) {
        super(pkmn);
    }
}