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
/*This attack takes the target into the air with the user on the first turn and executes on the second. Pokemon weighing 200 kg or more cannot be lifted. On the first turn, the user and the target avoid all attacks other than Gust, Hurricane, Sky Uppercut, Smack Down, Thousand Arrows, Thunder, and Twister. The user and the target cannot make a move between turns, but the target can select a move to use. This move cannot damage Flying-type Pokemon. Fails on the first turn if the target is an ally, if the target has a substitute, or if the target is using Bounce, Dig, Dive, Fly, Phantom Force, Shadow Force, or Sky Drop.*/
 public class Sky_Drop extends PokemonBattleEffect{

/*@Override
 void onModifyMove(Move move, source) {
      if (!source.volatiles["skydrop"]) {
        move.accuracy = true;
        delete move.flags["contact"];
      }
    }*/
/*@Override
 void onMoveFail(Pokemon target, source) {
      if (source.volatiles["twoturnmove"] && source.volatiles["twoturnmove"].duration === 1) {
        source.removeVolatile("skydrop");
        source.removeVolatile("twoturnmove");
        if (target === this.effectState.target) {
          this.add("-end", target, "Sky Drop", "[interrupt]");
        }
      }
    }*/
/*@Override
 void onTry(Pokemon source, target) {
      return !target.fainted;
    }*/
/*@Override
 void onTryHit(Pokemon target, Pokemon source, move) {
      if (source.removeVolatile(move.id)) {
        if (target !== source.volatiles["twoturnmove"].source)
          return false;
        if (target.hasType("Flying")) {
          this.add("-immune", target);
          return null;
        }
      } else {
        if (target.volatiles["substitute"] || target.isAlly(source)) {
          return false;
        }
        if (target.getWeight() >= 2e3) {
          this.add("-fail", target, "move: Sky Drop", "[heavy]");
          return null;
        }
        this.add("-prepare", source, move.name, target);
        source.addVolatile("twoturnmove", target);
        return null;
      }
    }*/
/*@Override
 void onHit(Pokemon target, source) {
      if (target.hp)
        this.add("-end", target, "Sky Drop");
    }*/
/*@Override
 void 2*/
/*@Override
 void onAnyDragOut(pokemon) {
        if (pokemon === this.effectState.target || pokemon === this.effectState.source)
          return false;
      }*/
/*@Override
 void -15*/
/*@Override
 void onFoeTrapPokemon(defender) {
        if (defender !== this.effectState.source)
          return;
        defender.trapped = true;
      }*/
/*@Override
 void 12*/
/*@Override
 void onFoeBeforeMove(attacker, defender, move) {
        if (attacker === this.effectState.source) {
          attacker.activeMoveActions--;
          this.debug("Sky drop nullifying.");
          return null;
        }
      }*/
/*@Override
 void 99*/
/*@Override
 void onRedirectTarget(Pokemon target, Pokemon source, source2) {
        if (source !== this.effectState.target)
          return;
        if (this.effectState.source.fainted)
          return;
        return this.effectState.source;
      }*/
/*@Override
 void onAnyInvulnerability(Pokemon target, Pokemon source, move) {
        if (target !== this.effectState.target && target !== this.effectState.source) {
          return;
        }
        if (source === this.effectState.target && target === this.effectState.source) {
          return;
        }
        if (["gust", "twister", "skyuppercut", "thunder", "hurricane", "smackdown", "thousandarrows"].includes(move.id)) {
          return;
        }
        return false;
      }*/
/*@Override
 void onAnyBasePower(basePower, Pokemon target, Pokemon source, move) {
        if (target !== this.effectState.target && target !== this.effectState.source) {
          return;
        }
        if (source === this.effectState.target && target === this.effectState.source) {
          return;
        }
        if (move.id === "gust" || move.id === "twister") {
          this.debug("BP doubled on midair target");
          return this.chainModify(2);
        }
      }*/
/*@Override
 void onFaint(target) {
        if (target.volatiles["skydrop"] && target.volatiles["twoturnmove"].source) {
          this.add("-end", target.volatiles["twoturnmove"].Pokemon source, "Sky Drop", "[interrupt]");
        }
      }*/
public Sky_Drop(Pokemon pkmn) {
        super(pkmn);
    }
}