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
/*Raises the Attack and Special Attack of Pokemon on the user's side with the Plus or Minus Abilities by 1 stage.*/
 public class Gear_Up extends PokemonBattleEffect{

/*@Override
 void onHitSide(side, Pokemon source, move) {
      const targets = side.allies().filter((target) => target.hasAbility(["plus", "minus"]) && (!target.volatiles["maxguard"] || this.runEvent("TryHit", Pokemon target, source, move)));
      if (!targets.length)
        return false;
      let didSomething = false;
      for (const target of targets) {
        didSomething = this.boost({ atk: 1, spa: 1 }, target, source, Move move, false, true) || didSomething;
      }
      return didSomething;
    }*/
public Gear_Up(Pokemon pkmn) {
        super(pkmn);
    }
}