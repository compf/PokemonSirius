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
/*This Pokemon is immune to Water-type moves and restores 1/4 of its maximum HP, rounded down, when hit by a Water-type move. The power of Fire-type moves is multiplied by 1.25 when used on this Pokemon. At the end of each turn, this Pokemon restores 1/8 of its maximum HP, rounded down, if the weather is Rain Dance, and loses 1/8 of its maximum HP, rounded down, if the weather is Sunny Day. The weather effects are prevented if this Pokemon is holding a Utility Umbrella.*/
 public class Dry_Skin extends PokemonBattleEffect{

/*@Override
 void onTryHit(Pokemon target, Pokemon source, move) {
      if (target !== source && move.type === "Water") {
        if (!this.heal(target.baseMaxhp / 4)) {
          this.add("-immune", target, "[from] ability: Dry Skin");
        }
        return null;
      }
    }*/
/*@Override
 void onSourceBasePower(basePower, attacker, defender, move) {
      if (move.type === "Fire") {
        return this.chainModify(1.25);
      }
    }*/
/*@Override
 void onWeather(Pokemon target, Pokemon source, effect) {
      if (target.hasItem("utilityumbrella"))
        return;
      if (effect.id === "raindance" || effect.id === "primordialsea") {
        this.heal(target.baseMaxhp / 8);
      } else if (effect.id === "sunnyday" || effect.id === "desolateland") {
        this.DamageInformation damage(target.baseMaxhp / 8, target, target);
      }
    }*/
public Dry_Skin(Pokemon pkmn) {
        super(pkmn);
    }
}