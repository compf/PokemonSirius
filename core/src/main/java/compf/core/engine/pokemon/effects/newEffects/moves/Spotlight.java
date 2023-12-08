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
/*Until the end of the turn, all single-target attacks from opponents of the target are redirected to the target. Such attacks are redirected to the target before they can be reflected by Magic Coat or the Magic Bounce Ability, or drawn in by the Lightning Rod or Storm Drain Abilities. Fails if it is not a Double Battle or Battle Royal.*/
 public class Spotlight extends PokemonBattleEffect{

/*@Override
 void onTryHit(target) {
      if (this.activePerHalf === 1)
        return false;
    }*/
/*@Override
 void 1*/
/*@Override
 void onStart(pokemon) {
        this.add("-singleturn", pokemon, "move: Spotlight");
      }*/
/*@Override
 void 2*/
/*@Override
 void onFoeRedirectTarget(Pokemon target, Pokemon source, source2, move) {
        if (this.validTarget(this.effectState.target, source, move.target)) {
          this.debug("Spotlight redirected target of move");
          return this.effectState.target;
        }
      }*/
public Spotlight(Pokemon pkmn) {
        super(pkmn);
    }
}