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
/*This Pokemon's offensive stat is doubled while using a Water-type attack. If a Pokemon uses a Fire-type attack against this Pokemon, that Pokemon's offensive stat is halved when calculating the damage to this Pokemon. This Pokemon cannot be burned. Gaining this Ability while burned cures it.*/
 public class Water_Bubble extends PokemonBattleEffect{

/*@Override
 void onSourceModifyAtk(atk, attacker, defender, move) {
      if (move.type === "Fire") {
        return this.chainModify(0.5);
      }
    }*/
/*@Override
 void onSourceModifySpA(atk, attacker, defender, move) {
      if (move.type === "Fire") {
        return this.chainModify(0.5);
      }
    }*/
/*@Override
 void onModifyAtk(atk, attacker, defender, move) {
      if (move.type === "Water") {
        return this.chainModify(2);
      }
    }*/
/*@Override
 void onModifySpA(atk, attacker, defender, move) {
      if (move.type === "Water") {
        return this.chainModify(2);
      }
    }*/
/*@Override
 void onUpdate(pokemon) {
      if (pokemon.status === "brn") {
        this.add("-activate", pokemon, "ability: Water Bubble");
        pokemon.cureStatus();
      }
    }*/
/*@Override
 void onSetStatus(status, Pokemon target, Pokemon source, effect) {
      if (status.id !== "brn")
        return;
      if (effect?.status) {
        this.add("-immune", target, "[from] ability: Water Bubble");
      }
      return false;
    }*/
public Water_Bubble(Pokemon pkmn) {
        super(pkmn);
    }
}