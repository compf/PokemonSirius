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
/*The user takes 1/4 of its maximum HP, rounded down, and puts it into a substitute to take its place in battle. The substitute is removed once enough damage is inflicted on it, or if the user switches out or faints. Baton Pass can be used to transfer the substitute to an ally, and the substitute will keep its remaining HP. Until the substitute is broken, it receives damage from all attacks made by other Pokemon and shields the user from status effects and stat stage changes caused by other Pokemon. Sound-based moves and Pokemon with the Infiltrator Ability ignore substitutes. The user still takes normal damage from weather and status effects while behind its substitute. If the substitute breaks during a multi-hit attack, the user will take damage from any remaining hits. If a substitute is created while the user is trapped by a binding move, the binding effect ends immediately. Fails if the user does not have enough HP remaining to create a substitute without fainting, or if it already has a substitute.*/
 public class Substitute extends PokemonBattleEffect{

/*@Override
 void onTryHit(source) {
      if (source.volatiles["substitute"]) {
        this.add("-fail", Pokemon source, "move: Substitute");
        return this.NOT_FAIL;
      }
      if (source.hp <= source.maxhp / 4 || source.maxhp === 1) {
        this.add("-fail", source, "move: Substitute", "[weak]");
        return this.NOT_FAIL;
      }
    }*/
/*@Override
 void onHit(target) {
      this.directDamage(target.maxhp / 4);
    }*/
/*@Override
 void onStart(Pokemon target, Pokemon source, effect) {
        if (effect?.id === "shedtail") {
          this.add("-start", target, "Substitute", "[from] move: Shed Tail");
        } else {
          this.add("-start", target, "Substitute");
        }
        this.effectState.hp = Math.floor(target.maxhp / 4);
        if (target.volatiles["partiallytrapped"]) {
          this.add("-end", target, target.volatiles["partiallytrapped"].sourceEffect, "[partiallytrapped]", "[silent]");
          delete target.volatiles["partiallytrapped"];
        }
      }*/
/*@Override
 void -1*/
/*@Override
 void onTryPrimaryHit(Pokemon target, Pokemon source, move) {
        if (target === source || move.flags["bypasssub"] || move.infiltrates) {
          return;
        }
        let damage = this.actions.getDamage(source, target, move);
        if (!damage && damage !== 0) {
          this.add("-fail", source);
          this.attrLastMove("[still]");
          return null;
        }
        damage = this.runEvent("SubDamage", target, source, Move move, damage);
        if (!damage) {
          return damage;
        }
        if (damage > target.volatiles["substitute"].hp) {
          damage = target.volatiles["substitute"].hp;
        }
        target.volatiles["substitute"].hp -= damage;
        source.lastDamage = damage;
        if (target.volatiles["substitute"].hp <= 0) {
          if (move.ohko)
            this.add("-ohko");
          target.removeVolatile("substitute");
        } else {
          this.add("-activate", target, "move: Substitute", "[damage]");
        }
        if (move.recoil || move.id === "chloroblast") {
          this.DamageInformation damage(this.actions.calcRecoilDamage(damage, move, source), source, target, "recoil");
        }
        if (move.drain) {
          this.heal(Math.ceil(damage * move.drain[0] / move.drain[1]), source, target, "drain");
        }
        this.singleEvent("AfterSubDamage", move, null, target, source, move, damage);
        this.runEvent("AfterSubDamage", target, source, move, damage);
        return this.HIT_SUBSTITUTE;
      }*/
/*@Override
 void onEnd(target) {
        this.add("-end", Pokemon target, "Substitute");
      }*/
public Substitute(Pokemon pkmn) {
        super(pkmn);
    }
}