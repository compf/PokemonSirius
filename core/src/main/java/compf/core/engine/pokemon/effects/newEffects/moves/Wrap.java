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
/*Prevents the target from switching for four or five turns (seven turns if the user is holding Grip Claw). Causes damage to the target equal to 1/8 of its maximum HP (1/6 if the user is holding Binding Band), rounded down, at the end of each turn during effect. The target can still switch out if it is holding Shed Shell or uses Baton Pass, Flip Turn, Parting Shot, Shed Tail, Teleport, U-turn, or Volt Switch. The effect ends if either the user or the target leaves the field, or if the target uses Mortal Spin, Rapid Spin, or Substitute successfully. This effect is not stackable or reset by using this or another binding move.*/
 public class Wrap extends PokemonBattleEffect{

public Wrap(Pokemon pkmn) {
        super(pkmn);
    }
}