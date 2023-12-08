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
/*Power doubles if the user had a stat stage lowered this turn.*/
 public class Lash_Out extends PokemonBattleEffect{

/*@Override
 void onBasePower(basePower, source) {
      if (source.statsLoweredThisTurn) {
        this.debug("lashout buff");
        return this.chainModify(2);
      }
    }*/
public Lash_Out(Pokemon pkmn) {
        super(pkmn);
    }
}