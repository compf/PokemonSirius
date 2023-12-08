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
/*The target restores 1/2 of its maximum HP, rounded half up. If the user has the Mega Launcher Ability, the target instead restores 3/4 of its maximum HP, rounded half down.*/
 public class Heal_Pulse extends PokemonBattleEffect{

/*@Override
 void onHit(Pokemon target, source) {
      let success = false;
      if (source.hasAbility("megalauncher")) {
        success = !!this.heal(this.modify(target.baseMaxhp, 0.75));
      } else {
        success = !!this.heal(Math.ceil(target.baseMaxhp * 0.5));
      }
      if (success && !target.isAlly(source)) {
        target.staleness = "external";
      }
      if (!success) {
        this.add("-fail", target, "heal");
        return this.NOT_FAIL;
      }
      return success;
    }*/
public Heal_Pulse(Pokemon pkmn) {
        super(pkmn);
    }
}