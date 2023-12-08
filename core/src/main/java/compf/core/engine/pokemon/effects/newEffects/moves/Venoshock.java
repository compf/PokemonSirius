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
/*Power doubles if the target is poisoned.*/
 public class Venoshock extends PokemonBattleEffect{

/*@Override
 void onBasePower(basePower, pokemon, target) {
      if (target.status === "psn" || target.status === "tox") {
        return this.chainModify(2);
      }
    }*/
public Venoshock(Pokemon pkmn) {
        super(pkmn);
    }
}