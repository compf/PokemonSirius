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
/*If held by an Altaria, this item allows it to Mega Evolve in battle.*/
 public class Altarianite extends PokemonBattleEffect{

/*@Override
 void onTakeItem(item, source) {
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    }*/
public Altarianite(Pokemon pkmn) {
        super(pkmn);
    }
}