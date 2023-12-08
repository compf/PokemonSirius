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
 public class Victory_Star extends PokemonBattleEffect{

/*@Override
 void onAnyModifyAccuracy(accuracy, Pokemon target, source) {
      if (source.isAlly(this.effectState.target) && typeof accuracy === "number") {
        return this.chainModify([4506, 4096]);
      }
    }*/
public Victory_Star(Pokemon pkmn) {
        super(pkmn);
    }
}