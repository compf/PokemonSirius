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
/*Raises the user's Attack, Defense, Special Attack, Special Defense, and Speed by 1 stage, but it becomes prevented from switching out. The user can still switch out if it uses Baton Pass, Flip Turn, Parting Shot, Teleport, U-turn, or Volt Switch. If the user leaves the field using Baton Pass, the replacement will remain trapped. Fails if the user has already been prevented from switching by this effect.*/
 public class No_Retreat extends PokemonBattleEffect{

/*@Override
 void onTry(Pokemon source, Pokemon target, move) {
      if (source.volatiles["noretreat"])
        return false;
      if (source.volatiles["trapped"]) {
        delete move.volatileStatus;
      }
    }*/
/*@Override
 void onStart(pokemon) {
        this.add("-start", pokemon, "move: No Retreat");
      }*/
/*@Override
 void onTrapPokemon(pokemon) {
        pokemon.tryTrap();
      }*/
public No_Retreat(Pokemon pkmn) {
        super(pkmn);
    }
}