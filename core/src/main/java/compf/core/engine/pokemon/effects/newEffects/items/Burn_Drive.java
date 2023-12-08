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
/*Holder's Techno Blast is Fire type.*/
 public class Burn_Drive extends PokemonBattleEffect{

/*@Override
 void onTakeItem(item, pokemon, source) {
      if (source && source.baseSpecies.num === 649 || pokemon.baseSpecies.num === 649) {
        return false;
      }
      return true;
    }*/
public Burn_Drive(Pokemon pkmn) {
        super(pkmn);
    }
}