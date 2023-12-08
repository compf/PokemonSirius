package compf.core.engine.pokemon.effects.newEffects.items;

import compf.core.engine.BattleAction;
    import compf.core.engine.pokemon.PokemonStat;
    import compf.core.engine.pokemon.Pokemon;
    import compf.core.engine.pokemon.effects.EffectParam;
    import compf.core.engine.pokemon.effects.PokemonBattleEffect;
    import compf.core.engine.pokemon.moves.DamageInformation;
    import compf.core.engine.pokemon.moves.Schedule;
    import compf.core.engine.pokemon.moves.Schedule.ScheduleItem;
    import compf.core.etc.services.SharedInformation;
/*If holder is hit by a physical move, attacker loses 1/8 of its max HP. Single use.*/
 public class Jaboca_Berry extends PokemonBattleEffect{

/*@Override
 void onDamagingHit(DamageInformation damage, Pokemon target, Pokemon source, move) {
      if (move.category === "Physical" && source.hp && source.isActive && !source.hasAbility("magicguard")) {
        if (target.eatItem()) {
          this.damage(source.baseMaxhp / (target.hasAbility("ripen") ? 4 : 8), source, target);
        }
      }
    }*/
/*@Override
 void onEat() {
    }*/
public Jaboca_Berry(Pokemon pkmn) {
        super(pkmn);
    }
}