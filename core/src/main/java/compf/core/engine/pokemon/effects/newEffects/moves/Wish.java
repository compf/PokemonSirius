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
/*At the end of the next turn, the Pokemon at the user's position has 1/2 of the user's maximum HP restored to it, rounded down. Fails if this move is already in effect for the user's position.*/
 public class Wish extends PokemonBattleEffect{

/*@Override
 void 2*/
/*@Override
 void onStart(pokemon, source) {
        this.effectState.hp = source.maxhp / 2;
      }*/
/*@Override
 void 4*/
/*@Override
 void onEnd(target) {
        if (target && !target.fainted) {
          const damage = this.heal(this.effectState.hp, Pokemon target, target);
          if (damage) {
            this.add("-heal", target, target.getHealth, "[from] move: Wish", "[wisher] " + this.effectState.source.name);
          }
        }
      }*/
public Wish(Pokemon pkmn) {
        super(pkmn);
    }
}