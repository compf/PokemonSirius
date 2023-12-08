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
/*Power is equal to the base move's Max Move power. If this move is successful, each Pokemon on the opposing side is prevented from switching for four or five turns (seven turns if the user is holding Grip Claw), even if they have a substitute. Causes damage equal to 1/8 of their maximum HP (1/6 if the user is holding Binding Band), rounded down, at the end of each turn during effect. They can still switch out if they are holding Shed Shell or use Baton Pass, Flip Turn, Parting Shot, Teleport, U-turn, or Volt Switch. The effect ends for a target if it leaves the field, or if it uses Rapid Spin or Substitute successfully. This effect is not stackable or reset by using this or another binding move.*/
 public class G_Max_Centiferno extends PokemonBattleEffect{

public G_Max_Centiferno(Pokemon pkmn) {
        super(pkmn);
    }
}