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
/*While this Pokemon is active, the power of Fairy-type moves used by active Pokemon is multiplied by 1.33.*/
 public class Fairy_Aura extends PokemonBattleEffect{

/*@Override
 void onStart(pokemon) {
      if (this.suppressingAbility(pokemon))
        return;
      this.add("-ability", pokemon, "Fairy Aura");
    }*/
/*@Override
 void onAnyBasePower(basePower, Pokemon source, Pokemon target, move) {
      if (target === source || move.category === "Status" || move.type !== "Fairy")
        return;
      if (!move.auraBooster?.hasAbility("Fairy Aura"))
        move.auraBooster = this.effectState.target;
      if (move.auraBooster !== this.effectState.target)
        return;
      return this.chainModify([move.hasAuraBreak ? 3072 : 5448, 4096]);
    }*/
public Fairy_Aura(Pokemon pkmn) {
        super(pkmn);
    }
}