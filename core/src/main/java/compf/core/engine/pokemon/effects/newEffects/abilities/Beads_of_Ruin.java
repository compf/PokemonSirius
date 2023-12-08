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
 public class Beads_of_Ruin extends PokemonBattleEffect{

/*@Override
 void onStart(pokemon) {
      if (this.suppressingAbility(pokemon))
        return;
      this.add("-ability", pokemon, "Beads of Ruin");
    }*/
/*@Override
 void onAnyModifySpD(spd, Pokemon target, Pokemon source, move) {
      const abilityHolder = this.effectState.target;
      if (target.hasAbility("Beads of Ruin"))
        return;
      if (!move.ruinedSpD?.hasAbility("Beads of Ruin"))
        move.ruinedSpD = abilityHolder;
      if (move.ruinedSpD !== abilityHolder)
        return;
      this.debug("Beads of Ruin SpD drop");
      return this.chainModify(0.75);
    }*/
public Beads_of_Ruin(Pokemon pkmn) {
        super(pkmn);
    }
}