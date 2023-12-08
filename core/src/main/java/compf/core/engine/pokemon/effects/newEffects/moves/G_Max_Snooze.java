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
/*Power is equal to the base move's Max Move power. If this move is successful, there is a 50% chance the effect of Yawn begins on the target, even if it has a substitute.*/
 public class G_Max_Snooze extends PokemonBattleEffect{

/*@Override
 void onHit(target) {
      if (target.status || !target.runStatusImmunity("slp"))
        return;
      if (this.random(2) === 0)
        return;
      target.addVolatile("yawn");
    }*/
/*@Override
 void onAfterSubDamage(DamageInformation damage, target) {
      if (target.status || !target.runStatusImmunity("slp"))
        return;
      if (this.random(2) === 0)
        return;
      target.addVolatile("yawn");
    }*/
public G_Max_Snooze(Pokemon pkmn) {
        super(pkmn);
    }
}