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
/*Holder's Grass-type attacks have 1.2x power.*/
 public class Miracle_Seed extends PokemonBattleEffect{

/*@Override
 void onBasePower(basePower, user, Pokemon target, move) {
      if (move.type === "Grass") {
        return this.chainModify([4915, 4096]);
      }
    }*/
public Miracle_Seed(Pokemon pkmn) {
        super(pkmn);
    }
}