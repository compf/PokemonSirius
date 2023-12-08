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
/*Power doubles if the user is burned, paralyzed, or poisoned. The physical damage halving effect from the user's burn is ignored.*/
 public class Facade extends PokemonBattleEffect{

/*@Override
 void onBasePower(basePower, pokemon) {
      if (pokemon.status && pokemon.status !== "slp") {
        return this.chainModify(2);
      }
    }*/
public Facade(Pokemon pkmn) {
        super(pkmn);
    }
}