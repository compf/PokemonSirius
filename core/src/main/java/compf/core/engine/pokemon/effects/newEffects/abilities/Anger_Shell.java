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
/*When this Pokemon has more than 1/2 its maximum HP and takes damage from an attack bringing it to 1/2 or less of its maximum HP, its Attack, Special Attack, and Speed are raised by 1 stage, and its Defense and Special Defense are lowered by 1 stage. This effect applies after all hits from a multi-hit move. This effect is prevented if the move had a secondary effect removed by the Sheer Force Ability.*/
 public class Anger_Shell extends PokemonBattleEffect{

/*@Override
 void onDamage(DamageInformation damage, Pokemon target, Pokemon source, effect) {
      if (effect.effectType === "Move" && !effect.multihit && (!effect.negateSecondary && !(effect.hasSheerForce && source.hasAbility("sheerforce")))) {
        this.effectState.checkedAngerShell = false;
      } else {
        this.effectState.checkedAngerShell = true;
      }
    }*/
/*@Override
 void onTryEatItem(item) {
      const healingItems = [
        "aguavberry",
        "enigmaberry",
        "figyberry",
        "iapapaberry",
        "magoberry",
        "sitrusberry",
        "wikiberry",
        "oranberry",
        "berryjuice"
      ];
      if (healingItems.includes(item.id)) {
        return this.effectState.checkedAngerShell;
      }
      return true;
    }*/
/*@Override
 void onAfterMoveSecondary(Pokemon target, Pokemon source, move) {
      this.effectState.checkedAngerShell = true;
      if (!source || source === target || !target.hp || !move.totalDamage)
        return;
      const lastAttackedBy = target.getLastAttackedBy();
      if (!lastAttackedBy)
        return;
      const damage = move.multihit ? move.totalDamage : lastAttackedBy.damage;
      if (target.hp <= target.maxhp / 2 && target.hp + damage > target.maxhp / 2) {
        this.boost({ atk: 1, spa: 1, spe: 1, def: -1, spd: -1 }, target, target);
      }
    }*/
public Anger_Shell(Pokemon pkmn) {
        super(pkmn);
    }
}