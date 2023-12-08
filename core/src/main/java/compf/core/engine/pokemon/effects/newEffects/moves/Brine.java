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
/*Power doubles if the target has less than or equal to half of its maximum HP remaining.*/
 public class Brine extends PokemonBattleEffect{

/*@Override
 void onBasePower(basePower, pokemon, target) {
      if (target.hp * 2 <= target.maxhp) {
        return this.chainModify(2);
      }
    }*/
public Brine(Pokemon pkmn) {
        super(pkmn);
    }
}