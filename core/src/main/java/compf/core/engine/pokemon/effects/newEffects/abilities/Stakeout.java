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
/*undefined*/
 public class Stakeout extends PokemonBattleEffect{

/*@Override
 void onModifyAtk(atk, attacker, defender) {
      if (!defender.activeTurns) {
        this.debug("Stakeout boost");
        return this.chainModify(2);
      }
    }*/
/*@Override
 void onModifySpA(atk, attacker, defender) {
      if (!defender.activeTurns) {
        this.debug("Stakeout boost");
        return this.chainModify(2);
      }
    }*/
public Stakeout(Pokemon pkmn) {
        super(pkmn);
    }
}