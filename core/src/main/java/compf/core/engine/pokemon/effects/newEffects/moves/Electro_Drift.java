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
/*Damage is multiplied by 1.3333 if this move is super effective against the target.*/
 public class Electro_Drift extends PokemonBattleEffect{

/*@Override
 void onBasePower(basePower, Pokemon source, Pokemon target, move) {
      if (target.runEffectiveness(move) > 0) {
        this.debug(`electro drift super effective buff`);
        return this.chainModify([5461, 4096]);
      }
    }*/
public Electro_Drift(Pokemon pkmn) {
        super(pkmn);
    }
}