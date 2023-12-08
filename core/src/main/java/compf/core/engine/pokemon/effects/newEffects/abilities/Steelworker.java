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
 public class Steelworker extends PokemonBattleEffect{

/*@Override
 void onModifyAtk(atk, attacker, defender, move) {
      if (move.type === "Steel") {
        this.debug("Steelworker boost");
        return this.chainModify(1.5);
      }
    }*/
/*@Override
 void onModifySpA(atk, attacker, defender, move) {
      if (move.type === "Steel") {
        this.debug("Steelworker boost");
        return this.chainModify(1.5);
      }
    }*/
public Steelworker(Pokemon pkmn) {
        super(pkmn);
    }
}