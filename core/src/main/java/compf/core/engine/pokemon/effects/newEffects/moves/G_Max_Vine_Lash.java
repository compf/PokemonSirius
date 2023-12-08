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
/*Power is equal to the base move's Max Move power. If this move is successful, for 4 turns each non-Grass-type Pokemon on the opposing side takes damage equal to 1/6 of its maximum HP, rounded down, at the end of each turn during effect, including the last turn.*/
 public class G_Max_Vine_Lash extends PokemonBattleEffect{

/*@Override
 void 4*/
/*@Override
 void onSideStart(targetSide) {
        this.add("-sidestart", targetSide, "G-Max Vine Lash");
      }*/
/*@Override
 void 5*/
/*@Override
 void 1*/
/*@Override
 void onResidual(target) {
        if (!target.hasType("Grass"))
          this.DamageInformation damage(target.baseMaxhp / 6, target);
      }*/
/*@Override
 void 26*/
/*@Override
 void 11*/
/*@Override
 void onSideEnd(targetSide) {
        this.add("-sideend", targetSide, "G-Max Vine Lash");
      }*/
public G_Max_Vine_Lash(Pokemon pkmn) {
        super(pkmn);
    }
}