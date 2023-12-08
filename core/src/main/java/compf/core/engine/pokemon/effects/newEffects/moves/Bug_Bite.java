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
/*If this move is successful and the user has not fainted, it steals the target's held Berry if it is holding one and eats it immediately, gaining its effects even if the user's item is being ignored. Items lost to this move cannot be regained with Recycle or the Harvest Ability.*/
 public class Bug_Bite extends PokemonBattleEffect{

/*@Override
 void onHit(Pokemon target, source) {
      const item = target.getItem();
      if (source.hp && item.isBerry && target.takeItem(source)) {
        this.add("-enditem", target, item.name, "[from] stealeat", "[move] Bug Bite", "[of] " + source);
        if (this.singleEvent("Eat", item, null, Pokemon source, null, null)) {
          this.runEvent("EatItem", source, null, null, item);
          if (item.id === "leppaberry")
            target.staleness = "external";
        }
        if (item.onEat)
          source.ateBerry = true;
      }
    }*/
public Bug_Bite(Pokemon pkmn) {
        super(pkmn);
    }
}