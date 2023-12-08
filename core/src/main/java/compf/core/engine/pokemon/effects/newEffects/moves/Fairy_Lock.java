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
/*Prevents all active Pokemon from switching next turn. A Pokemon can still switch out if it is holding Shed Shell or uses Baton Pass, Flip Turn, Parting Shot, Teleport, U-turn, or Volt Switch. Fails if the effect is already active.*/
 public class Fairy_Lock extends PokemonBattleEffect{

/*@Override
 void 2*/
/*@Override
 void onFieldStart(target) {
        this.add("-fieldactivate", "move: Fairy Lock");
      }*/
/*@Override
 void onTrapPokemon(pokemon) {
        pokemon.tryTrap();
      }*/
public Fairy_Lock(Pokemon pkmn) {
        super(pkmn);
    }
}