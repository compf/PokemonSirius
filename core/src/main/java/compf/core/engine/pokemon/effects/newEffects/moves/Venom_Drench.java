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
/*Lowers the target's Attack, Special Attack, and Speed by 1 stage if the target is poisoned. Fails if the target is not poisoned.*/
 public class Venom_Drench extends PokemonBattleEffect{

/*@Override
 void onHit(Pokemon target, Pokemon source, move) {
      if (target.status === "psn" || target.status === "tox") {
        return !!this.boost({ atk: -1, spa: -1, spe: -1 }, target, source, move);
      }
      return false;
    }*/
public Venom_Drench(Pokemon pkmn) {
        super(pkmn);
    }
}