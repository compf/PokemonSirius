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
/*This Pokemon and its allies cannot be poisoned. Gaining this Ability while this Pokemon or its ally is poisoned cures them. If this Ability is being ignored during an effect that causes poison, this Pokemon is cured immediately but its ally is not.*/
 public class Pastel_Veil extends PokemonBattleEffect{

/*@Override
 void onStart(pokemon) {
      for (const ally of pokemon.alliesAndSelf()) {
        if (["psn", "tox"].includes(ally.status)) {
          this.add("-activate", pokemon, "ability: Pastel Veil");
          ally.cureStatus();
        }
      }
    }*/
/*@Override
 void onUpdate(pokemon) {
      if (["psn", "tox"].includes(pokemon.status)) {
        this.add("-activate", pokemon, "ability: Pastel Veil");
        pokemon.cureStatus();
      }
    }*/
/*@Override
 void onAllySwitchIn(pokemon) {
      if (["psn", "tox"].includes(pokemon.status)) {
        this.add("-activate", this.effectState.Pokemon target, "ability: Pastel Veil");
        pokemon.cureStatus();
      }
    }*/
/*@Override
 void onSetStatus(status, Pokemon target, Pokemon source, effect) {
      if (!["psn", "tox"].includes(status.id))
        return;
      if (effect?.status) {
        this.add("-immune", target, "[from] ability: Pastel Veil");
      }
      return false;
    }*/
/*@Override
 void onAllySetStatus(status, Pokemon target, Pokemon source, effect) {
      if (!["psn", "tox"].includes(status.id))
        return;
      if (effect?.status) {
        const effectHolder = this.effectState.target;
        this.add("-block", target, "ability: Pastel Veil", "[of] " + effectHolder);
      }
      return false;
    }*/
public Pastel_Veil(Pokemon pkmn) {
        super(pkmn);
    }
}