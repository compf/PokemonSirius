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
/*Raises the Defense and Special Defense of Pokemon on the user's side with the Plus or Minus Abilities by 1 stage.*/
 public class Magnetic_Flux extends PokemonBattleEffect{

/*@Override
 void onHitSide(side, Pokemon source, move) {
      const targets = side.allies().filter((ally) => ally.hasAbility(["plus", "minus"]) && (!ally.volatiles["maxguard"] || this.runEvent("TryHit", ally, source, move)));
      if (!targets.length)
        return false;
      let didSomething = false;
      for (const target of targets) {
        didSomething = this.boost({ def: 1, spd: 1 }, Pokemon target, source, Move move, false, true) || didSomething;
      }
      return didSomething;
    }*/
public Magnetic_Flux(Pokemon pkmn) {
        super(pkmn);
    }
}