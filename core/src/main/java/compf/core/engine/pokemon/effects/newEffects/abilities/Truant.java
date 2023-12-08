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
 public class Truant extends PokemonBattleEffect{

/*@Override
 void onStart(pokemon) {
      pokemon.removeVolatile("truant");
      if (pokemon.activeTurns && (pokemon.moveThisTurnResult !== void 0 || !this.queue.willMove(pokemon))) {
        pokemon.addVolatile("truant");
      }
    }*/
/*@Override
 void onBeforeMove(pokemon) {
      if (pokemon.removeVolatile("truant")) {
        this.add("cant", pokemon, "ability: Truant");
        return false;
      }
      pokemon.addVolatile("truant");
    }*/
public Truant(Pokemon pkmn) {
        super(pkmn);
    }
}