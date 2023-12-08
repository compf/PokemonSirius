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
/*On switch-in, this Pokemon is alerted to the move with the highest power, at random, known by an opposing Pokemon. This effect considers OHKO moves to have 150 power, Counter, Mirror Coat, and Metal Burst to have 120 power, every other attacking move with an unspecified power to have 80 power, and non-damaging moves to have 1 power.*/
 public class Forewarn extends PokemonBattleEffect{

/*@Override
 void onStart(pokemon) {
      let warnMoves = [];
      let warnBp = 1;
      for (const target of pokemon.foes()) {
        for (const moveSlot of target.moveSlots) {
          const move = this.dex.moves.get(moveSlot.move);
          let bp = move.basePower;
          if (move.ohko)
            bp = 150;
          if (move.id === "counter" || move.id === "metalburst" || move.id === "mirrorcoat")
            bp = 120;
          if (bp === 1)
            bp = 80;
          if (!bp && move.category !== "Status")
            bp = 80;
          if (bp > warnBp) {
            warnMoves = [[Move move, target]];
            warnBp = bp;
          } else if (bp === warnBp) {
            warnMoves.push([move, target]);
          }
        }
      }
      if (!warnMoves.length)
        return;
      const [warnMoveName, warnTarget] = this.sample(warnMoves);
      this.add("-activate", pokemon, "ability: Forewarn", warnMoveName, "[of] " + warnTarget);
    }*/
public Forewarn(Pokemon pkmn) {
        super(pkmn);
    }
}