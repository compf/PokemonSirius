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
/*Sets up a hazard on the opposing side of the field, poisoning each opposing Pokemon that switches in, unless it is a Flying-type Pokemon or has the Levitate Ability. Can be used up to two times before failing. Opposing Pokemon become poisoned with one layer and badly poisoned with two layers. Can be removed from the opposing side if any opposing Pokemon uses Mortal Spin, Rapid Spin, or Defog successfully, is hit by Defog, or a grounded Poison-type Pokemon switches in. Safeguard prevents the opposing party from being poisoned on switch-in, but a substitute does not.*/
 public class Toxic_Spikes extends PokemonBattleEffect{

/*@Override
 void onSideStart(side) {
        this.add("-sidestart", side, "move: Toxic Spikes");
        this.effectState.layers = 1;
      }*/
/*@Override
 void onSideRestart(side) {
        if (this.effectState.layers >= 2)
          return false;
        this.add("-sidestart", side, "move: Toxic Spikes");
        this.effectState.layers++;
      }*/
/*@Override
 void onEntryHazard(pokemon) {
        if (!pokemon.isGrounded())
          return;
        if (pokemon.hasType("Poison")) {
          this.add("-sideend", pokemon.side, "move: Toxic Spikes", "[of] " + pokemon);
          pokemon.side.removeSideCondition("toxicspikes");
        } else if (pokemon.hasType("Steel") || pokemon.hasItem("heavydutyboots")) {
          return;
        } else if (this.effectState.layers >= 2) {
          pokemon.trySetStatus("tox", pokemon.side.foe.active[0]);
        } else {
          pokemon.trySetStatus("psn", pokemon.side.foe.active[0]);
        }
      }*/
public Toxic_Spikes(Pokemon pkmn) {
        super(pkmn);
    }
}