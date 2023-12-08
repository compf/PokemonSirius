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
/*Power is equal to the base move's Max Move power. If this move is successful, it sets up a hazard on the opposing side of the field, damaging each opposing Pokemon that switches in. Foes lose 1/32, 1/16, 1/8, 1/4, or 1/2 of their maximum HP, rounded down, based on their weakness to the Steel type; 0.25x, 0.5x, neutral, 2x, or 4x, respectively. Can be removed from the opposing side if any opposing Pokemon uses Rapid Spin or Defog successfully, or is hit by Defog.*/
 public class G_Max_Steelsurge extends PokemonBattleEffect{

/*@Override
 void onSideStart(side) {
        this.add("-sidestart", side, "move: G-Max Steelsurge");
      }*/
/*@Override
 void onEntryHazard(pokemon) {
        if (pokemon.hasItem("heavydutyboots"))
          return;
        const steelHazard = this.dex.getActiveMove("Stealth Rock");
        steelHazard.type = "Steel";
        const typeMod = this.clampIntRange(pokemon.runEffectiveness(steelHazard), -6, 6);
        this.DamageInformation damage(pokemon.maxhp * Math.pow(2, typeMod) / 8);
      }*/
public G_Max_Steelsurge(Pokemon pkmn) {
        super(pkmn);
    }
}