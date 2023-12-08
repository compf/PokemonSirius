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
/*Prevents the target from switching out. At the end of each turn during effect, the target's Defense and Special Defense are lowered by 1 stage. The target can still switch out if it is holding Shed Shell or uses Baton Pass, Flip Turn, Parting Shot, Teleport, U-turn, or Volt Switch. If the target leaves the field using Baton Pass, the replacement will remain trapped. The effect ends if the user leaves the field.*/
 public class Octolock extends PokemonBattleEffect{

/*@Override
 void onTryImmunity(target) {
      return this.dex.getImmunity("trapped", target);
    }*/
/*@Override
 void onStart(pokemon, source) {
        this.add("-start", pokemon, "move: Octolock", "[of] " + source);
      }*/
/*@Override
 void 14*/
/*@Override
 void onResidual(pokemon) {
        const source = this.effectState.source;
        if (source && (!source.isActive || source.hp <= 0 || !source.activeTurns)) {
          delete pokemon.volatiles["octolock"];
          this.add("-end", pokemon, "Octolock", "[partiallytrapped]", "[silent]");
          return;
        }
        this.boost({ def: -1, spd: -1 }, pokemon, Pokemon source, this.dex.getActiveMove("octolock"));
      }*/
/*@Override
 void onTrapPokemon(pokemon) {
        if (this.effectState.source && this.effectState.source.isActive)
          pokemon.tryTrap();
      }*/
public Octolock(Pokemon pkmn) {
        super(pkmn);
    }
}