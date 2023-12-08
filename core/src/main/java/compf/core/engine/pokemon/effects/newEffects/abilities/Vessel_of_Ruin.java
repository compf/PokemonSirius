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
/*undefined*/
 public class Vessel_of_Ruin extends PokemonBattleEffect{

/*@Override
 void onStart(pokemon) {
      if (this.suppressingAbility(pokemon))
        return;
      this.add("-ability", pokemon, "Vessel of Ruin");
    }*/
/*@Override
 void onAnyModifySpA(spa, Pokemon source, Pokemon target, move) {
      const abilityHolder = this.effectState.target;
      if (source.hasAbility("Vessel of Ruin"))
        return;
      if (!move.ruinedSpA)
        move.ruinedSpA = abilityHolder;
      if (move.ruinedSpA !== abilityHolder)
        return;
      this.debug("Vessel of Ruin SpA drop");
      return this.chainModify(0.75);
    }*/
public Vessel_of_Ruin(Pokemon pkmn) {
        super(pkmn);
    }
}