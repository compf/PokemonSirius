package compf.core.engine.pokemon.effects.newEffects.moves;

import compf.core.engine.BattleAction;
    import compf.core.engine.pokemon.PokemonStat;
    import compf.core.engine.pokemon.Pokemon;
    import compf.core.engine.pokemon.effects.EffectParam;
    import compf.core.engine.pokemon.effects.PokemonBattleEffect;
    import compf.core.engine.pokemon.moves.DamageInformation;
    import compf.core.engine.pokemon.moves.Schedule;
    import compf.core.engine.pokemon.moves.Schedule.ScheduleItem;
    import compf.core.etc.services.SharedInformation;
/*The target loses its held item if it is a Berry or a Gem. This move cannot cause Pokemon with the Sticky Hold Ability to lose their held item. Items lost to this move cannot be regained with Recycle or the Harvest Ability.*/
 public class Incinerate extends PokemonBattleEffect{

/*@Override
 void onHit(pokemon, source) {
      const item = pokemon.getItem();
      if ((item.isBerry || item.isGem) && pokemon.takeItem(source)) {
        this.add("-enditem", pokemon, item.name, "[from] move: Incinerate");
      }
    }*/
public Incinerate(Pokemon pkmn) {
        super(pkmn);
    }
}