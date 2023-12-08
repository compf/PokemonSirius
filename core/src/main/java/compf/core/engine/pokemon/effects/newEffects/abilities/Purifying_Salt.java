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
/*This Pokemon cannot become affected by a non-volatile status condition or Yawn. If a Pokemon uses a Ghost-type attack against this Pokemon, that Pokemon's offensive stat is halved when calculating the damage to this Pokemon.*/
 public class Purifying_Salt extends PokemonBattleEffect{

/*@Override
 void onSetStatus(status, Pokemon target, Pokemon source, effect) {
      if (effect?.status) {
        this.add("-immune", target, "[from] ability: Purifying Salt");
      }
      return false;
    }*/
/*@Override
 void onTryAddVolatile(status, target) {
      if (status.id === "yawn") {
        this.add("-immune", Pokemon target, "[from] ability: Purifying Salt");
        return null;
      }
    }*/
/*@Override
 void onSourceModifyAtk(atk, attacker, defender, move) {
      if (move.type === "Ghost") {
        this.debug("Purifying Salt weaken");
        return this.chainModify(0.5);
      }
    }*/
/*@Override
 void onSourceModifySpA(spa, attacker, defender, move) {
      if (move.type === "Ghost") {
        this.debug("Purifying Salt weaken");
        return this.chainModify(0.5);
      }
    }*/
public Purifying_Salt(Pokemon pkmn) {
        super(pkmn);
    }
}