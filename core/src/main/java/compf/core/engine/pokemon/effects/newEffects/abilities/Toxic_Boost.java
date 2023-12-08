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
/*While this Pokemon is poisoned, the power of its physical attacks is multiplied by 1.5.*/
 public class Toxic_Boost extends PokemonBattleEffect{

/*@Override
 void onBasePower(basePower, attacker, defender, move) {
      if ((attacker.status === "psn" || attacker.status === "tox") && move.category === "Physical") {
        return this.chainModify(1.5);
      }
    }*/
public Toxic_Boost(Pokemon pkmn) {
        super(pkmn);
    }
}