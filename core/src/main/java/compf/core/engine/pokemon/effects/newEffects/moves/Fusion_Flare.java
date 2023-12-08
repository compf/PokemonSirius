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
/*Power doubles if the last move used by any Pokemon this turn was Fusion Bolt.*/
 public class Fusion_Flare extends PokemonBattleEffect{

/*@Override
 void onBasePower(basePower, pokemon) {
      if (this.lastSuccessfulMoveThisTurn === "fusionbolt") {
        this.debug("double power");
        return this.chainModify(2);
      }
    }*/
public Fusion_Flare(Pokemon pkmn) {
        super(pkmn);
    }
}