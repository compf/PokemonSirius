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
/*undefined*/
 public class Compound_Eyes extends PokemonBattleEffect{

/*@Override
 void onSourceModifyAccuracy(accuracy) {
      if (typeof accuracy !== "number")
        return;
      this.debug("compoundeyes - enhancing accuracy");
      return this.chainModify([5325, 4096]);
    }*/
public Compound_Eyes(Pokemon pkmn) {
        super(pkmn);
    }
}