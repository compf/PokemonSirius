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
/*Prevents the target from switching out. The target can still switch out if it is holding Shed Shell or uses Baton Pass, Flip Turn, Parting Shot, Teleport, U-turn, or Volt Switch. If the target leaves the field using Baton Pass, the replacement will remain trapped. The effect ends if the user leaves the field.*/
 public class Spirit_Shackle extends PokemonBattleEffect{

public Spirit_Shackle(Pokemon pkmn) {
        super(pkmn);
    }
}