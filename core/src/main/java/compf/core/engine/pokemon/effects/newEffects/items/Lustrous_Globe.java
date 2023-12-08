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
/*If held by a Palkia, its Water- and Dragon-type attacks have 1.2x power.*/
 public class Lustrous_Globe extends PokemonBattleEffect{

/*@Override
 void onBasePower(basePower, user, Pokemon target, move) {
      if (user.baseSpecies.num === 484 && (move.type === "Water" || move.type === "Dragon")) {
        return this.chainModify([4915, 4096]);
      }
    }*/
/*@Override
 void onTakeItem(item, pokemon, source) {
      if (source?.baseSpecies.num === 484 || pokemon.baseSpecies.num === 484) {
        return false;
      }
      return true;
    }*/
public Lustrous_Globe(Pokemon pkmn) {
        super(pkmn);
    }
}