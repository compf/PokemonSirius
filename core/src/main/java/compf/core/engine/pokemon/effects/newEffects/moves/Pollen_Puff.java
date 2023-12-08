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
/*If the target is an ally, this move restores 1/2 of its maximum HP, rounded down, instead of dealing damage.*/
 public class Pollen_Puff extends PokemonBattleEffect{

/*@Override
 void onTryHit(Pokemon target, Pokemon source, move) {
      if (source.isAlly(target)) {
        move.basePower = 0;
        move.infiltrates = true;
      }
    }*/
/*@Override
 void onTryMove(Pokemon source, Pokemon target, move) {
      if (source.isAlly(target) && source.volatiles["healblock"]) {
        this.attrLastMove("[still]");
        this.add("cant", source, "move: Heal Block", move);
        return false;
      }
    }*/
/*@Override
 void onHit(Pokemon target, Pokemon source, move) {
      if (source.isAlly(target)) {
        if (!this.heal(Math.floor(target.baseMaxhp * 0.5))) {
          if (target.volatiles["healblock"] && target.hp !== target.maxhp) {
            this.attrLastMove("[still]");
            this.add("cant", source, "move: Heal Block", move);
          } else {
            this.add("-immune", target);
          }
          return this.NOT_FAIL;
        }
      }
    }*/
public Pollen_Puff(Pokemon pkmn) {
        super(pkmn);
    }
}