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
/*If held by a Zacian, this item changes its forme to Crowned Sword.*/
 public class Rusted_Sword extends PokemonBattleEffect{

/*@Override
 void onTakeItem(item, pokemon, source) {
      if (source && source.baseSpecies.num === 888 || pokemon.baseSpecies.num === 888) {
        return false;
      }
      return true;
    }*/
public Rusted_Sword(Pokemon pkmn) {
        super(pkmn);
    }
}