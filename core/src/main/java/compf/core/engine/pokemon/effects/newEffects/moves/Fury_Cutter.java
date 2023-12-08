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
/*Power doubles with each successful hit, up to a maximum of 160 power. The power is reset if this move misses or another move is used.*/
 public class Fury_Cutter extends PokemonBattleEffect{

/*@Override
 void basePowerCallback(pokemon, Pokemon target, move) {
      if (!pokemon.volatiles["furycutter"] || move.hit === 1) {
        pokemon.addVolatile("furycutter");
      }
      const bp = this.clampIntRange(move.basePower * pokemon.volatiles["furycutter"].multiplier, 1, 160);
      this.debug("BP: " + bp);
      return bp;
    }*/
/*@Override
 void 2*/
/*@Override
 void onStart() {
        this.effectState.multiplier = 1;
      }*/
/*@Override
 void onRestart() {
        if (this.effectState.multiplier < 4) {
          this.effectState.multiplier <<= 1;
        }
        this.effectState.duration = 2;
      }*/
public Fury_Cutter(Pokemon pkmn) {
        super(pkmn);
    }
}