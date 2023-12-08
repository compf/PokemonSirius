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
/*Prevents the target from selecting the same move for use two turns in a row. This effect ends when the target is no longer active.*/
 public class Torment extends PokemonBattleEffect{

/*@Override
 void true*/
/*@Override
 void onStart(pokemon, Pokemon source, effect) {
        if (pokemon.volatiles["dynamax"]) {
          delete pokemon.volatiles["torment"];
          return false;
        }
        if (effect?.id === "gmaxmeltdown")
          this.effectState.duration = 3;
        this.add("-start", pokemon, "Torment");
      }*/
/*@Override
 void onEnd(pokemon) {
        this.add("-end", pokemon, "Torment");
      }*/
/*@Override
 void onDisableMove(pokemon) {
        if (pokemon.lastMove && pokemon.lastMove.id !== "struggle")
          pokemon.disableMove(pokemon.lastMove.id);
      }*/
public Torment(Pokemon pkmn) {
        super(pkmn);
    }
}