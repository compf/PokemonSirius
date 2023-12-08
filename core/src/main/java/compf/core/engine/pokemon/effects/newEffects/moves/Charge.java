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
/*Raises the user's Special Defense by 1 stage. The user's next Electric-type attack will have its power doubled; the effect ends when the user is no longer active, or after the user attempts to use any Electric-type move besides Charge, even if it is not successful.*/
 public class Charge extends PokemonBattleEffect{

/*@Override
 void onStart(pokemon, Pokemon source, effect) {
        if (effect && ["Electromorphosis", "Wind Power"].includes(effect.name)) {
          this.add("-start", pokemon, "Charge", this.activeMove.name, "[from] ability: " + effect.name);
        } else {
          this.add("-start", pokemon, "Charge");
        }
      }*/
/*@Override
 void onRestart(pokemon, Pokemon source, effect) {
        if (effect && ["Electromorphosis", "Wind Power"].includes(effect.name)) {
          this.add("-start", pokemon, "Charge", this.activeMove.name, "[from] ability: " + effect.name);
        } else {
          this.add("-start", pokemon, "Charge");
        }
      }*/
/*@Override
 void 9*/
/*@Override
 void onBasePower(basePower, attacker, defender, move) {
        if (move.type === "Electric") {
          this.debug("charge boost");
          return this.chainModify(2);
        }
      }*/
/*@Override
 void onMoveAborted(pokemon, Pokemon target, move) {
        if (move.type === "Electric" && move.id !== "charge") {
          pokemon.removeVolatile("charge");
        }
      }*/
/*@Override
 void onAfterMove(pokemon, Pokemon target, move) {
        if (move.type === "Electric" && move.id !== "charge") {
          pokemon.removeVolatile("charge");
        }
      }*/
/*@Override
 void onEnd(pokemon) {
        this.add("-end", pokemon, "Charge", "[silent]");
      }*/
public Charge(Pokemon pkmn) {
        super(pkmn);
    }
}