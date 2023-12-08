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
/*This Pokemon's attacks have their power multiplied by 1.25 against targets of the same gender or multiplied by 0.75 against targets of the opposite gender. There is no modifier if either this Pokemon or the target is genderless.*/
 public class Rivalry extends PokemonBattleEffect{

/*@Override
 void onBasePower(basePower, attacker, defender, move) {
      if (attacker.gender && defender.gender) {
        if (attacker.gender === defender.gender) {
          this.debug("Rivalry boost");
          return this.chainModify(1.25);
        } else {
          this.debug("Rivalry weaken");
          return this.chainModify(0.75);
        }
      }
    }*/
public Rivalry(Pokemon pkmn) {
        super(pkmn);
    }
}