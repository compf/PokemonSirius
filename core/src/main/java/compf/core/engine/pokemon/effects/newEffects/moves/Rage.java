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
/*Once this move is successfully used, the user's Attack is raised by 1 stage every time it is hit by another Pokemon's attack as long as this move is chosen for use.*/
 public class Rage extends PokemonBattleEffect{

/*@Override
 void onStart(pokemon) {
        this.add("-singlemove", pokemon, "Rage");
      }*/
/*@Override
 void onHit(Pokemon target, Pokemon source, move) {
        if (target !== source && move.category !== "Status") {
          this.boost({ atk: 1 });
        }
      }*/
/*@Override
 void 100*/
/*@Override
 void onBeforeMove(pokemon) {
        this.debug("removing Rage before attack");
        pokemon.removeVolatile("rage");
      }*/
public Rage(Pokemon pkmn) {
        super(pkmn);
    }
}