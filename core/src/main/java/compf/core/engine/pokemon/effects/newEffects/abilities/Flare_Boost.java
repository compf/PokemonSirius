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
/*While this Pokemon is burned, the power of its special attacks is multiplied by 1.5.*/
 public class Flare_Boost extends PokemonBattleEffect{

/*@Override
 void onBasePower(basePower, attacker, defender, move) {
      if (attacker.status === "brn" && move.category === "Special") {
        return this.chainModify(1.5);
      }
    }*/
public Flare_Boost(Pokemon pkmn) {
        super(pkmn);
    }
}