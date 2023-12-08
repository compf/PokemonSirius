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
 public class Battery extends PokemonBattleEffect{

/*@Override
 void onAllyBasePower(basePower, attacker, defender, move) {
      if (attacker !== this.effectState.target && move.category === "Special") {
        this.debug("Battery boost");
        return this.chainModify([5325, 4096]);
      }
    }*/
public Battery(Pokemon pkmn) {
        super(pkmn);
    }
}