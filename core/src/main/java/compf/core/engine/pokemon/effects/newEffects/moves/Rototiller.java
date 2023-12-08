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
/*Raises the Attack and Special Attack of all grounded Grass-type Pokemon on the field by 1 stage.*/
 public class Rototiller extends PokemonBattleEffect{

/*@Override
 void onHitField(Pokemon target, source) {
      const targets = [];
      let anyAirborne = false;
      for (const pokemon of this.getAllActive()) {
        if (!pokemon.runImmunity("Ground")) {
          this.add("-immune", pokemon);
          anyAirborne = true;
          continue;
        }
        if (pokemon.hasType("Grass")) {
          targets.push(pokemon);
        }
      }
      if (!targets.length && !anyAirborne)
        return false;
      for (const pokemon of targets) {
        this.boost({ atk: 1, spa: 1 }, pokemon, source);
      }
    }*/
public Rototiller(Pokemon pkmn) {
        super(pkmn);
    }
}