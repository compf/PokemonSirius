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
/*If held by a Venomicon, its Poison- and Flying-type attacks have 1.2x power.*/
 public class Vile_Vial extends PokemonBattleEffect{

/*@Override
 void onBasePower(basePower, user, Pokemon target, move) {
      if (user.baseSpecies.num === -66 && ["Poison", "Flying"].includes(move.type)) {
        return this.chainModify([4915, 4096]);
      }
    }*/
/*@Override
 void onTakeItem(item, pokemon, source) {
      if (source?.baseSpecies.num === -66 || pokemon.baseSpecies.num === -66) {
        return false;
      }
      return true;
    }*/
public Vile_Vial(Pokemon pkmn) {
        super(pkmn);
    }
}