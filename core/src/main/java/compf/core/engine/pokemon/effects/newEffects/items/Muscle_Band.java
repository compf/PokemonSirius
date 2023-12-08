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
/*Holder's physical attacks have 1.1x power.*/
 public class Muscle_Band extends PokemonBattleEffect{

/*@Override
 void onBasePower(basePower, user, Pokemon target, move) {
      if (move.category === "Physical") {
        return this.chainModify([4505, 4096]);
      }
    }*/
public Muscle_Band(Pokemon pkmn) {
        super(pkmn);
    }
}