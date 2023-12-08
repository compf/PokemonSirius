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
/*Raises the user's Attack and Speed by 1 stage. Removes subtitutes from all active Pokemon and ends the effects of Spikes, Stealth Rock, Sticky Web, and Toxic Spikes for both sides.*/
 public class Tidy_Up extends PokemonBattleEffect{

/*@Override
 void onHit(pokemon) {
      let success = false;
      for (const active of this.getAllActive()) {
        if (active.removeVolatile("substitute"))
          success = true;
      }
      const removeAll = ["spikes", "toxicspikes", "stealthrock", "stickyweb", "gmaxsteelsurge"];
      const sides = [pokemon.side, ...pokemon.side.foeSidesWithConditions()];
      for (const side of sides) {
        for (const sideCondition of removeAll) {
          if (side.removeSideCondition(sideCondition)) {
            this.add("-sideend", side, this.dex.conditions.get(sideCondition).name);
            success = true;
          }
        }
      }
      if (success)
        this.add("-activate", pokemon, "move: Tidy Up");
      return !!this.boost({ atk: 1, spe: 1 }, pokemon, pokemon, null, false, true) || success;
    }*/
public Tidy_Up(Pokemon pkmn) {
        super(pkmn);
    }
}