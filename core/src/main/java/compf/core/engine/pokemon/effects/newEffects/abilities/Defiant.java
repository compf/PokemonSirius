package compf.core.engine.pokemon.effects.newEffects.abilities;

import compf.core.engine.BattleAction;
    import compf.core.engine.pokemon.PokemonStat;
    import compf.core.engine.pokemon.Pokemon;
    import compf.core.engine.pokemon.effects.EffectParam;
    import compf.core.engine.pokemon.effects.PokemonBattleEffect;
    import compf.core.engine.pokemon.moves.DamageInformation;
    import compf.core.engine.pokemon.moves.Schedule;
    import compf.core.engine.pokemon.moves.Schedule.ScheduleItem;
    import compf.core.etc.services.SharedInformation;
/*This Pokemon's Attack is raised by 2 stages for each of its stat stages that is lowered by an opposing Pokemon.*/
 public class Defiant extends PokemonBattleEffect{

/*@Override
 void onAfterEachBoost(boost, Pokemon target, Pokemon source, effect) {
      if (!source || target.isAlly(source)) {
        if (effect.id === "stickyweb") {
          this.hint("Court Change Sticky Web counts as lowering your own Speed, and Defiant only affects stats lowered by foes.", true, source.side);
        }
        return;
      }
      let statsLowered = false;
      let i;
      for (i in boost) {
        if (boost[i] < 0) {
          statsLowered = true;
        }
      }
      if (statsLowered) {
        this.boost({ atk: 2 }, target, target, null, false, true);
      }
    }*/
public Defiant(Pokemon pkmn) {
        super(pkmn);
    }
}