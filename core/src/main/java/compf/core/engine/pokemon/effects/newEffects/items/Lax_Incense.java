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
/*The accuracy of attacks against the holder is 0.9x.*/
 public class Lax_Incense extends PokemonBattleEffect{

/*@Override
 void onModifyAccuracy(accuracy) {
      if (typeof accuracy !== "number")
        return;
      this.debug("lax incense - decreasing accuracy");
      return this.chainModify([3686, 4096]);
    }*/
public Lax_Incense(Pokemon pkmn) {
        super(pkmn);
    }
}