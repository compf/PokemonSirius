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
/*Causes the target to lose 1/4 of its maximum HP, rounded down, at the end of each turn as long as it is asleep. This move does not affect the target unless it is asleep. The effect ends when the target wakes up, even if it falls asleep again in the same turn.*/
 public class Nightmare extends PokemonBattleEffect{

/*@Override
 void true*/
/*@Override
 void onStart(pokemon) {
        if (pokemon.status !== "slp" && !pokemon.hasAbility("comatose")) {
          return false;
        }
        this.add("-start", pokemon, "Nightmare");
      }*/
/*@Override
 void 11*/
/*@Override
 void onResidual(pokemon) {
        this.DamageInformation damage(pokemon.baseMaxhp / 4);
      }*/
public Nightmare(Pokemon pkmn) {
        super(pkmn);
    }
}