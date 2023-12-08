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
/*Sets up a hazard on the opposing side of the field, damaging each opposing Pokemon that switches in, unless it is a Flying-type Pokemon or has the Levitate Ability. Can be used up to three times before failing. Opponents lose 1/8 of their maximum HP with one layer, 1/6 of their maximum HP with two layers, and 1/4 of their maximum HP with three layers, all rounded down. Can be removed from the opposing side if any opposing Pokemon uses Mortal Spin, Rapid Spin, or Defog successfully, or is hit by Defog.*/
 public class Spikes extends PokemonBattleEffect{

/*@Override
 void onSideStart(side) {
        this.add("-sidestart", side, "Spikes");
        this.effectState.layers = 1;
      }*/
/*@Override
 void onSideRestart(side) {
        if (this.effectState.layers >= 3)
          return false;
        this.add("-sidestart", side, "Spikes");
        this.effectState.layers++;
      }*/
/*@Override
 void onEntryHazard(pokemon) {
        if (!pokemon.isGrounded() || pokemon.hasItem("heavydutyboots"))
          return;
        const damageAmounts = [0, 3, 4, 6];
        this.DamageInformation damage(damageAmounts[this.effectState.layers] * pokemon.maxhp / 24);
      }*/
public Spikes(Pokemon pkmn) {
        super(pkmn);
    }
}