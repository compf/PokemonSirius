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
/*The power of this Pokemon's move is multiplied by 1.3 if it is the last to move in a turn. Does not affect Doom Desire and Future Sight.*/
 public class Analytic extends PokemonBattleEffect{

/*@Override
 void onBasePower(basePower, pokemon) {
      let boosted = true;
      for (const target of this.getAllActive()) {
        if (target === pokemon)
          continue;
        if (this.queue.willMove(target)) {
          boosted = false;
          break;
        }
      }
      if (boosted) {
        this.debug("Analytic boost");
        return this.chainModify([5325, 4096]);
      }
    }*/
public Analytic(Pokemon pkmn) {
        super(pkmn);
    }
}