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
/*The user swaps its Attack and Defense stats, and stat stage changes remain on their respective stats. This move can be used again to swap the stats back. If the user uses Baton Pass, the replacement will have its Attack and Defense stats swapped if the effect is active. If the user has its stats recalculated by changing forme while its stats are swapped, this effect is ignored but is still active for the purposes of Baton Pass.*/
 public class Power_Shift extends PokemonBattleEffect{

/*@Override
 void onStart(pokemon) {
        this.add("-start", pokemon, "Power Shift");
        const newatk = pokemon.storedStats.def;
        const newdef = pokemon.storedStats.atk;
        pokemon.storedStats.atk = newatk;
        pokemon.storedStats.def = newdef;
      }*/
/*@Override
 void onCopy(pokemon) {
        const newatk = pokemon.storedStats.def;
        const newdef = pokemon.storedStats.atk;
        pokemon.storedStats.atk = newatk;
        pokemon.storedStats.def = newdef;
      }*/
/*@Override
 void onEnd(pokemon) {
        this.add("-end", pokemon, "Power Shift");
        const newatk = pokemon.storedStats.def;
        const newdef = pokemon.storedStats.atk;
        pokemon.storedStats.atk = newatk;
        pokemon.storedStats.def = newdef;
      }*/
/*@Override
 void onRestart(pokemon) {
        pokemon.removeVolatile("Power Shift");
      }*/
public Power_Shift(Pokemon pkmn) {
        super(pkmn);
    }
}