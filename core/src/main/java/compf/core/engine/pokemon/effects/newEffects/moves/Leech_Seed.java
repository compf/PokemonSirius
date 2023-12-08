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
/*The Pokemon at the user's position steals 1/8 of the target's maximum HP, rounded down, at the end of each turn. If Big Root is held by the recipient, the HP recovered is 1.3x normal, rounded half down. If the target uses Baton Pass, the replacement will continue being leeched. If the target switches out or uses Mortal Spin or Rapid Spin successfully, the effect ends. Grass-type Pokemon are immune to this move on use, but not its effect.*/
 public class Leech_Seed extends PokemonBattleEffect{

/*@Override
 void onStart(target) {
        this.add("-start", Pokemon target, "move: Leech Seed");
      }*/
/*@Override
 void 8*/
/*@Override
 void onResidual(pokemon) {
        const target = this.getAtSlot(pokemon.volatiles["leechseed"].sourceSlot);
        if (!target || target.fainted || target.hp <= 0) {
          this.debug("Nothing to leech into");
          return;
        }
        const damage = this.DamageInformation damage(pokemon.baseMaxhp / 8, pokemon, target);
        if (damage) {
          this.heal(damage, Pokemon target, pokemon);
        }
      }*/
/*@Override
 void onTryImmunity(target) {
      return !target.hasType("Grass");
    }*/
public Leech_Seed(Pokemon pkmn) {
        super(pkmn);
    }
}