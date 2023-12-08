package compf.core.engine.pokemon.effects.newEffects.abilities;

import compf.core.engine.BattleAction;
    import compf.core.engine.pokemon.PokemonStat;
    import compf.core.engine.pokemon.Pokemon;
    import compf.core.engine.pokemon.effects.EffectParam;
    import compf.core.engine.pokemon.effects.PokemonBattleEffect;
    import compf.core.engine.pokemon.moves.DamageInformation;
    import compf.core.engine.pokemon.moves.Schedule;
    import compf.core.engine.pokemon.moves.Schedule.ScheduleItem;
    import compf.core.etc.services.SharedInformation;
/*If this Pokemon has no item, it steals the item off a Pokemon it hits with an attack. Does not affect Doom Desire and Future Sight.*/
 public class Magician extends PokemonBattleEffect{

/*@Override
 void onAfterMoveSecondarySelf(Pokemon source, Pokemon target, move) {
      if (!move || !target || source.switchFlag === true)
        return;
      if (target !== source && move.category !== "Status") {
        if (source.item || source.volatiles["gem"] || move.id === "fling")
          return;
        const yourItem = target.takeItem(source);
        if (!yourItem)
          return;
        if (!source.setItem(yourItem)) {
          target.item = yourItem.id;
          return;
        }
        this.add("-item", source, yourItem, "[from] ability: Magician", "[of] " + target);
      }
    }*/
public Magician(Pokemon pkmn) {
        super(pkmn);
    }
}