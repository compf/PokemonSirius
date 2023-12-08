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
/*If the current terrain is Electric Terrain and the target is grounded, this move's power is doubled.*/
 public class Rising_Voltage extends PokemonBattleEffect{

/*@Override
 void basePowerCallback(Pokemon source, Pokemon target, move) {
      if (this.field.isTerrain("electricterrain") && target.isGrounded()) {
        if (!source.isAlly(target))
          this.hint(`${move.name}'s BP doubled on grounded target.`);
        return move.basePower * 2;
      }
      return move.basePower;
    }*/
public Rising_Voltage(Pokemon pkmn) {
        super(pkmn);
    }
}