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
/*This Pokemon is immune to Water-type moves and raises its Special Attack by 1 stage when hit by a Water-type move. If this Pokemon is not the target of a single-target Water-type move used by another Pokemon, this Pokemon redirects that move to itself if it is within the range of that move. If multiple Pokemon could redirect with this Ability, it goes to the one with the highest Speed, or in the case of a tie to the one that has had this Ability active longer.*/
 public class Storm_Drain extends PokemonBattleEffect{

/*@Override
 void onTryHit(Pokemon target, Pokemon source, move) {
      if (target !== source && move.type === "Water") {
        if (!this.boost({ spa: 1 })) {
          this.add("-immune", target, "[from] ability: Storm Drain");
        }
        return null;
      }
    }*/
/*@Override
 void onAnyRedirectTarget(Pokemon target, Pokemon source, source2, move) {
      if (move.type !== "Water" || move.flags["pledgecombo"])
        return;
      const redirectTarget = ["randomNormal", "adjacentFoe"].includes(move.target) ? "normal" : move.target;
      if (this.validTarget(this.effectState.target, source, redirectTarget)) {
        if (move.smartTarget)
          move.smartTarget = false;
        if (this.effectState.target !== target) {
          this.add("-activate", this.effectState.target, "ability: Storm Drain");
        }
        return this.effectState.target;
      }
    }*/
public Storm_Drain(Pokemon pkmn) {
        super(pkmn);
    }
}