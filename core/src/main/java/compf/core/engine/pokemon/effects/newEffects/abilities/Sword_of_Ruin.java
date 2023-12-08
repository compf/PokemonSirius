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
 public class Sword_of_Ruin extends PokemonBattleEffect{

/*@Override
 void onStart(pokemon) {
      if (this.suppressingAbility(pokemon))
        return;
      this.add("-ability", pokemon, "Sword of Ruin");
    }*/
/*@Override
 void onAnyModifyDef(def, Pokemon target, Pokemon source, move) {
      const abilityHolder = this.effectState.target;
      if (target.hasAbility("Sword of Ruin"))
        return;
      if (!move.ruinedDef?.hasAbility("Sword of Ruin"))
        move.ruinedDef = abilityHolder;
      if (move.ruinedDef !== abilityHolder)
        return;
      this.debug("Sword of Ruin Def drop");
      return this.chainModify(0.75);
    }*/
public Sword_of_Ruin(Pokemon pkmn) {
        super(pkmn);
    }
}