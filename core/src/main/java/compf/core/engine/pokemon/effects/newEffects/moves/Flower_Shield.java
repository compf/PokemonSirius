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
/*Raises the Defense of all active Grass-type Pokemon by 1 stage. Fails if there are no active Grass-type Pokemon.*/
 public class Flower_Shield extends PokemonBattleEffect{

/*@Override
 void onHitField(t, Pokemon source, move) {
      const targets = [];
      for (const pokemon of this.getAllActive()) {
        if (pokemon.hasType("Grass") && (!pokemon.volatiles["maxguard"] || this.runEvent("TryHit", pokemon, source, move))) {
          targets.push(pokemon);
        }
      }
      let success = false;
      for (const target of targets) {
        success = this.boost({ def: 1 }, Pokemon target, source, move) || success;
      }
      return success;
    }*/
public Flower_Shield(Pokemon pkmn) {
        super(pkmn);
    }
}