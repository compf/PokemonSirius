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
/*If a Pokemon uses a Fire-type attack against this Pokemon, that Pokemon's offensive stat is halved when calculating the damage to this Pokemon. This Pokemon takes half of the usual burn damage, rounded down.*/
 public class Heatproof extends PokemonBattleEffect{

/*@Override
 void onSourceModifyAtk(atk, attacker, defender, move) {
      if (move.type === "Fire") {
        this.debug("Heatproof Atk weaken");
        return this.chainModify(0.5);
      }
    }*/
/*@Override
 void onSourceModifySpA(atk, attacker, defender, move) {
      if (move.type === "Fire") {
        this.debug("Heatproof SpA weaken");
        return this.chainModify(0.5);
      }
    }*/
/*@Override
 void onDamage(DamageInformation damage, Pokemon target, Pokemon source, effect) {
      if (effect && effect.id === "brn") {
        return damage / 2;
      }
    }*/
public Heatproof(Pokemon pkmn) {
        super(pkmn);
    }
}