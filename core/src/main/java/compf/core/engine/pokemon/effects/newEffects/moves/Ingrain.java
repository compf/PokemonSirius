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
/*The user has 1/16 of its maximum HP restored at the end of each turn, but it is prevented from switching out and other Pokemon cannot force the user to switch out. The user can still switch out if it uses Baton Pass, Flip Turn, Parting Shot, Teleport, U-turn, or Volt Switch. If the user leaves the field using Baton Pass, the replacement will remain trapped and still receive the healing effect. During the effect, the user can be hit normally by Ground-type attacks and be affected by Spikes, Toxic Spikes, and Sticky Web, even if the user is a Flying type or has the Levitate Ability.*/
 public class Ingrain extends PokemonBattleEffect{

/*@Override
 void onStart(pokemon) {
        this.add("-start", pokemon, "move: Ingrain");
      }*/
/*@Override
 void 7*/
/*@Override
 void onResidual(pokemon) {
        this.heal(pokemon.baseMaxhp / 16);
      }*/
/*@Override
 void onTrapPokemon(pokemon) {
        pokemon.tryTrap();
      }*/
/*@Override
 void onDragOut(pokemon) {
        this.add("-activate", pokemon, "move: Ingrain");
        return null;
      }*/
public Ingrain(Pokemon pkmn) {
        super(pkmn);
    }
}