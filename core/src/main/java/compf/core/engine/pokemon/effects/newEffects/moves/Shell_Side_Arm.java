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
/*Has a 20% chance to poison the target. This move becomes a physical attack that makes contact if the value of ((((2 * the user's level / 5 + 2) * 90 * X) / Y) / 50), where X is the user's Attack stat and Y is the target's Defense stat, is greater than the same value where X is the user's Special Attack stat and Y is the target's Special Defense stat. No stat modifiers other than stat stage changes are considered for this purpose. If the two values are equal, this move chooses a damage category at random.*/
 public class Shell_Side_Arm extends PokemonBattleEffect{

/*@Override
 void onPrepareHit(Pokemon target, Pokemon source, move) {
      if (!source.isAlly(target)) {
        this.attrLastMove("[anim] Shell Side Arm " + move.category);
      }
    }*/
/*@Override
 void onModifyMove(Move move, pokemon, target) {
      if (!target)
        return;
      const atk = pokemon.getStat("atk", false, true);
      const spa = pokemon.getStat("spa", false, true);
      const def = target.getStat("def", false, true);
      const spd = target.getStat("spd", false, true);
      const physical = Math.floor(Math.floor(Math.floor(Math.floor(2 * pokemon.level / 5 + 2) * 90 * atk) / def) / 50);
      const special = Math.floor(Math.floor(Math.floor(Math.floor(2 * pokemon.level / 5 + 2) * 90 * spa) / spd) / 50);
      if (physical > special || physical === special && this.random(2) === 0) {
        move.category = "Physical";
        move.flags.contact = 1;
      }
    }*/
/*@Override
 void onHit(Pokemon target, Pokemon source, move) {
      if (!source.isAlly(target))
        this.hint(move.category + " Shell Side Arm");
    }*/
/*@Override
 void onAfterSubDamage(DamageInformation damage, Pokemon target, Pokemon source, move) {
      if (!source.isAlly(target))
        this.hint(move.category + " Shell Side Arm");
    }*/
public Shell_Side_Arm(Pokemon pkmn) {
        super(pkmn);
    }
}