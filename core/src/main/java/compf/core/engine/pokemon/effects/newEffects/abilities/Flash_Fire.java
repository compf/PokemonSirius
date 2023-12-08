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
/*This Pokemon is immune to Fire-type moves. The first time it is hit by a Fire-type move, its offensive stat is multiplied by 1.5 while using a Fire-type attack as long as it remains active and has this Ability. If this Pokemon is frozen, it cannot be defrosted by Fire-type attacks.*/
 public class Flash_Fire extends PokemonBattleEffect{

/*@Override
 void onTryHit(Pokemon target, Pokemon source, move) {
      if (target !== source && move.type === "Fire") {
        move.accuracy = true;
        if (!target.addVolatile("flashfire")) {
          this.add("-immune", target, "[from] ability: Flash Fire");
        }
        return null;
      }
    }*/
/*@Override
 void onEnd(target) {
        this.add("-end", Pokemon target, "ability: Flash Fire", "[silent]");
      }*/
/*@Override
 void true*/
/*@Override
 void onStart(target) {
        this.add("-start", Pokemon target, "ability: Flash Fire");
      }*/
/*@Override
 void 5*/
/*@Override
 void onModifyAtk(atk, attacker, defender, move) {
        if (move.type === "Fire" && attacker.hasAbility("flashfire")) {
          this.debug("Flash Fire boost");
          return this.chainModify(1.5);
        }
      }*/
/*@Override
 void 5*/
/*@Override
 void onModifySpA(atk, attacker, defender, move) {
        if (move.type === "Fire" && attacker.hasAbility("flashfire")) {
          this.debug("Flash Fire boost");
          return this.chainModify(1.5);
        }
      }*/
public Flash_Fire(Pokemon pkmn) {
        super(pkmn);
    }
}