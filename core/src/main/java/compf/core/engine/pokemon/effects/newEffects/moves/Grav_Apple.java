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
/*Has a 100% chance to lower the target's Defense by 1 stage. Power is multiplied by 1.5 during Gravity's effect.*/
 public class Grav_Apple extends PokemonBattleEffect{

/*@Override
 void onBasePower(basePower) {
      if (this.field.getPseudoWeather("gravity")) {
        return this.chainModify(1.5);
      }
    }*/
public Grav_Apple(Pokemon pkmn) {
        super(pkmn);
    }
}