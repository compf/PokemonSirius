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
 public class Tablets_of_Ruin extends PokemonBattleEffect{

/*@Override
 void onStart(pokemon) {
      if (this.suppressingAbility(pokemon))
        return;
      this.add("-ability", pokemon, "Tablets of Ruin");
    }*/
/*@Override
 void onAnyModifyAtk(atk, Pokemon source, Pokemon target, move) {
      const abilityHolder = this.effectState.target;
      if (source.hasAbility("Tablets of Ruin"))
        return;
      if (!move.ruinedAtk)
        move.ruinedAtk = abilityHolder;
      if (move.ruinedAtk !== abilityHolder)
        return;
      this.debug("Tablets of Ruin Atk drop");
      return this.chainModify(0.75);
    }*/
public Tablets_of_Ruin(Pokemon pkmn) {
        super(pkmn);
    }
}