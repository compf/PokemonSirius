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
/*If this Pokemon is a Cramorant, it changes forme when it hits a target with Surf or uses the first turn of Dive successfully. It becomes Gulping Form with an Arrokuda in its mouth if it has more than 1/2 of its maximum HP remaining, or Gorging Form with a Pikachu in its mouth if it has 1/2 or less of its maximum HP remaining. If Cramorant gets hit in Gulping or Gorging Form, it spits the Arrokuda or Pikachu at its attacker, even if it has no HP remaining. The projectile deals damage equal to 1/4 of the target's maximum HP, rounded down; this damage is blocked by the Magic Guard Ability but not by a substitute. An Arrokuda also lowers the target's Defense by 1 stage, and a Pikachu paralyzes the target. Cramorant will return to normal if it spits out a projectile, switches out, or Dynamaxes.*/
 public class Gulp_Missile extends PokemonBattleEffect{

/*@Override
 void onDamagingHit(DamageInformation damage, Pokemon target, Pokemon source, move) {
      if (!source.hp || !source.isActive || target.transformed || target.isSemiInvulnerable())
        return;
      if (["cramorantgulping", "cramorantgorging"].includes(target.species.id)) {
        this.damage(source.baseMaxhp / 4, source, target);
        if (target.species.id === "cramorantgulping") {
          this.boost({ def: -1 }, source, target, null, true);
        } else {
          source.trySetStatus("par", target, move);
        }
        target.formeChange("cramorant", move);
      }
    }*/
/*@Override
 void onSourceTryPrimaryHit(Pokemon target, Pokemon source, effect) {
      if (effect && effect.id === "surf" && source.hasAbility("gulpmissile") && source.species.name === "Cramorant" && !source.transformed) {
        const forme = source.hp <= source.maxhp / 2 ? "cramorantgorging" : "cramorantgulping";
        source.formeChange(forme, effect);
      }
    }*/
public Gulp_Missile(Pokemon pkmn) {
        super(pkmn);
    }
}