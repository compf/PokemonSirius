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
/*Each active Pokemon receives a perish count of 4 if it doesn't already have a perish count. At the end of each turn including the turn used, the perish count of all active Pokemon lowers by 1 and Pokemon faint if the number reaches 0. The perish count is removed from Pokemon that switch out. If a Pokemon uses Baton Pass while it has a perish count, the replacement will gain the perish count and continue to count down.*/
 public class Perish_Song extends PokemonBattleEffect{

/*@Override
 void onHitField(Pokemon target, Pokemon source, move) {
      let result = false;
      let message = false;
      for (const pokemon of this.getAllActive()) {
        if (this.runEvent("Invulnerability", pokemon, source, move) === false) {
          this.add("-miss", source, pokemon);
          result = true;
        } else if (this.runEvent("TryHit", pokemon, source, move) === null) {
          result = true;
        } else if (!pokemon.volatiles["perishsong"]) {
          pokemon.addVolatile("perishsong");
          this.add("-start", pokemon, "perish3", "[silent]");
          result = true;
          message = true;
        }
      }
      if (!result)
        return false;
      if (message)
        this.add("-fieldactivate", "move: Perish Song");
    }*/
/*@Override
 void 4*/
/*@Override
 void onEnd(target) {
        this.add("-start", Pokemon target, "perish0");
        target.faint();
      }*/
/*@Override
 void 24*/
/*@Override
 void onResidual(pokemon) {
        const duration = pokemon.volatiles["perishsong"].duration;
        this.add("-start", pokemon, "perish" + duration);
      }*/
public Perish_Song(Pokemon pkmn) {
        super(pkmn);
    }
}