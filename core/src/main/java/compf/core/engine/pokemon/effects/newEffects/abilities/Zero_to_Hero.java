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
 public class Zero_to_Hero extends PokemonBattleEffect{

/*@Override
 void onSwitchOut(pokemon) {
      if (pokemon.baseSpecies.baseSpecies !== "Palafin" || pokemon.transformed)
        return;
      if (pokemon.species.forme !== "Hero") {
        pokemon.formeChange("Palafin-Hero", this.effect, true);
      }
    }*/
/*@Override
 void onSwitchIn() {
      this.effectState.switchingIn = true;
    }*/
/*@Override
 void onStart(pokemon) {
      if (!this.effectState.switchingIn)
        return;
      this.effectState.switchingIn = false;
      if (pokemon.baseSpecies.baseSpecies !== "Palafin" || pokemon.transformed)
        return;
      if (!this.effectState.heroMessageDisplayed && pokemon.species.forme === "Hero") {
        this.add("-activate", pokemon, "ability: Zero to Hero");
        this.effectState.heroMessageDisplayed = true;
      }
    }*/
public Zero_to_Hero(Pokemon pkmn) {
        super(pkmn);
    }
}