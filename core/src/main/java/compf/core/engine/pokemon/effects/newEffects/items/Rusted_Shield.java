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
/*If held by a Zamazenta, this item changes its forme to Crowned Shield.*/
 public class Rusted_Shield extends PokemonBattleEffect{

/*@Override
 void onTakeItem(item, pokemon, source) {
      if (source && source.baseSpecies.num === 889 || pokemon.baseSpecies.num === 889) {
        return false;
      }
      return true;
    }*/
public Rusted_Shield(Pokemon pkmn) {
        super(pkmn);
    }
}