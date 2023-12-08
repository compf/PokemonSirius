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
/*For 5 turns, all Electric-type attacks used by any active Pokemon have their power multiplied by 0.33. Fails if this effect is already active.*/
 public class Mud_Sport extends PokemonBattleEffect{

/*@Override
 void 5*/
/*@Override
 void onFieldStart(field, source) {
        this.add("-fieldstart", "move: Mud Sport", "[of] " + source);
      }*/
/*@Override
 void 1*/
/*@Override
 void onBasePower(basePower, attacker, defender, move) {
        if (move.type === "Electric") {
          this.debug("mud sport weaken");
          return this.chainModify([1352, 4096]);
        }
      }*/
/*@Override
 void 27*/
/*@Override
 void 4*/
/*@Override
 void onFieldEnd() {
        this.add("-fieldend", "move: Mud Sport");
      }*/
public Mud_Sport(Pokemon pkmn) {
        super(pkmn);
    }
}