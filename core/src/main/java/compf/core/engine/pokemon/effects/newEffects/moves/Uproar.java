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
/*The user spends three turns locked into this move. This move targets an opponent at random on each turn. On the first of the three turns, all sleeping active Pokemon wake up. During the three turns, no active Pokemon can fall asleep by any means, and Pokemon switched in during the effect do not wake up. If the user is prevented from moving or the attack is not successful against the target during one of the turns, the effect ends.*/
 public class Uproar extends PokemonBattleEffect{

/*@Override
 void onTryHit(target) {
      const activeTeam = target.side.activeTeam();
      const foeActiveTeam = target.side.foe.activeTeam();
      for (const [i, allyActive] of activeTeam.entries()) {
        if (allyActive && allyActive.status === "slp")
          allyActive.cureStatus();
        const foeActive = foeActiveTeam[i];
        if (foeActive && foeActive.status === "slp")
          foeActive.cureStatus();
      }
    }*/
/*@Override
 void 3*/
/*@Override
 void onStart(target) {
        this.add("-start", Pokemon target, "Uproar");
      }*/
/*@Override
 void onResidual(target) {
        if (target.volatiles["throatchop"]) {
          target.removeVolatile("uproar");
          return;
        }
        if (target.lastMove && target.lastMove.id === "struggle") {
          delete target.volatiles["uproar"];
        }
        this.add("-start", Pokemon target, "Uproar", "[upkeep]");
      }*/
/*@Override
 void 28*/
/*@Override
 void 1*/
/*@Override
 void onEnd(target) {
        this.add("-end", Pokemon target, "Uproar");
      }*/
/*@Override
 void uproar*/
/*@Override
 void onAnySetStatus(status, pokemon) {
        if (status.id === "slp") {
          if (pokemon === this.effectState.target) {
            this.add("-fail", pokemon, "slp", "[from] Uproar", "[msg]");
          } else {
            this.add("-fail", pokemon, "slp", "[from] Uproar");
          }
          return null;
        }
      }*/
public Uproar(Pokemon pkmn) {
        super(pkmn);
    }
}