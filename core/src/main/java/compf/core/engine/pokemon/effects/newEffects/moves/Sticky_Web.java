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
/*Sets up a hazard on the opposing side of the field, lowering the Speed by 1 stage of each opposing Pokemon that switches in, unless it is a Flying-type Pokemon or has the Levitate Ability. Fails if the effect is already active on the opposing side. Can be removed from the opposing side if any opposing Pokemon uses Mortal Spin, Rapid Spin, or Defog successfully, or is hit by Defog.*/
 public class Sticky_Web extends PokemonBattleEffect{

/*@Override
 void onSideStart(side) {
        this.add("-sidestart", side, "move: Sticky Web");
      }*/
/*@Override
 void onEntryHazard(pokemon) {
        if (!pokemon.isGrounded() || pokemon.hasItem("heavydutyboots"))
          return;
        this.add("-activate", pokemon, "move: Sticky Web");
        this.boost({ spe: -1 }, pokemon, this.effectState.Pokemon source, this.dex.getActiveMove("stickyweb"));
      }*/
public Sticky_Web(Pokemon pkmn) {
        super(pkmn);
    }
}