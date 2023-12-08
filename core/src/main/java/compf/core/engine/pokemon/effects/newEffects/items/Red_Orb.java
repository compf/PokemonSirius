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
/*If held by a Groudon, this item triggers its Primal Reversion in battle.*/
 public class Red_Orb extends PokemonBattleEffect{

/*@Override
 void onSwitchIn(pokemon) {
      if (pokemon.isActive && pokemon.baseSpecies.name === "Groudon") {
        this.queue.insertChoice({ choice: "runPrimal", pokemon });
      }
    }*/
/*@Override
 void onPrimal(pokemon) {
      pokemon.formeChange("Groudon-Primal", this.effect, true);
    }*/
/*@Override
 void onTakeItem(item, source) {
      if (source.baseSpecies.baseSpecies === "Groudon")
        return false;
      return true;
    }*/
public Red_Orb(Pokemon pkmn) {
        super(pkmn);
    }
}