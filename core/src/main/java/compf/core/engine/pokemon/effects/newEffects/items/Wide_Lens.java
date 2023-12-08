package compf.core.engine.pokemon.effects.newEffects.items;

import compf.core.engine.BattleAction;
    import compf.core.engine.pokemon.PokemonStat;
    import compf.core.engine.pokemon.Pokemon;
    import compf.core.engine.pokemon.effects.EffectParam;
    import compf.core.engine.pokemon.effects.PokemonBattleEffect;
    import compf.core.engine.pokemon.moves.DamageInformation;
    import compf.core.engine.pokemon.moves.Schedule;
    import compf.core.engine.pokemon.moves.Schedule.ScheduleItem;
    import compf.core.etc.services.SharedInformation;
/*The accuracy of attacks by the holder is 1.1x.*/
 public class Wide_Lens extends PokemonBattleEffect{

/*@Override
 void onSourceModifyAccuracy(accuracy) {
      if (typeof accuracy === "number") {
        return this.chainModify([4505, 4096]);
      }
    }*/
public Wide_Lens(Pokemon pkmn) {
        super(pkmn);
    }
}