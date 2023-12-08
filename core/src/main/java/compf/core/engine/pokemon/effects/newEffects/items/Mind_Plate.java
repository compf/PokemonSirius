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
/*Holder's Psychic-type attacks have 1.2x power. Judgment is Psychic type.*/
 public class Mind_Plate extends PokemonBattleEffect{

/*@Override
 void onBasePower(basePower, user, Pokemon target, move) {
      if (move.type === "Psychic") {
        return this.chainModify([4915, 4096]);
      }
    }*/
/*@Override
 void onTakeItem(item, pokemon, source) {
      if (source && source.baseSpecies.num === 493 || pokemon.baseSpecies.num === 493) {
        return false;
      }
      return true;
    }*/
public Mind_Plate(Pokemon pkmn) {
        super(pkmn);
    }
}