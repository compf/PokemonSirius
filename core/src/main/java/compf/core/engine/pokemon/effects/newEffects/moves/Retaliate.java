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
/*Power doubles if one of the user's party members fainted last turn.*/
 public class Retaliate extends PokemonBattleEffect{

/*@Override
 void onBasePower(basePower, pokemon) {
      if (pokemon.side.faintedLastTurn) {
        this.debug("Boosted for a faint last turn");
        return this.chainModify(2);
      }
    }*/
public Retaliate(Pokemon pkmn) {
        super(pkmn);
    }
}