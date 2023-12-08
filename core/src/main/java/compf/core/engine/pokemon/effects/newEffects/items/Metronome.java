package compf.core.engine.pokemon.effects.newEffects.items;

import compf.core.engine.BattleAction;
    import compf.core.engine.pokemon.PokemonStat;
    import compf.core.engine.pokemon.Pokemon;
    import compf.core.engine.pokemon.effects.EffectParam;
    import compf.core.engine.pokemon.effects.PokemonBattleEffect;
    import compf.core.engine.pokemon.moves.DamageInformation;
    import compf.core.engine.pokemon.moves.Schedule;
    import compf.core.engine.pokemon.moves.Schedule.ScheduleItem;
    import compf.core.etc.services.SharedInformation;
/*Damage of moves used on consecutive turns is increased. Max 2x after 5 turns.*/
 public class Metronome extends PokemonBattleEffect{

/*@Override
 void onStart(pokemon) {
        this.effectState.lastMove = "";
        this.effectState.numConsecutive = 0;
      }*/
/*@Override
 void -2*/
/*@Override
 void onTryMove(pokemon, Pokemon target, move) {
        if (!pokemon.hasItem("metronome")) {
          pokemon.removeVolatile("metronome");
          return;
        }
        if (this.effectState.lastMove === move.id && pokemon.moveLastTurnResult) {
          this.effectState.numConsecutive++;
        } else if (pokemon.volatiles["twoturnmove"]) {
          if (this.effectState.lastMove !== move.id) {
            this.effectState.numConsecutive = 1;
          } else {
            this.effectState.numConsecutive++;
          }
        } else {
          this.effectState.numConsecutive = 0;
        }
        this.effectState.lastMove = move.id;
      }*/
/*@Override
 void onModifyDamage(DamageInformation damage, Pokemon source, Pokemon target, move) {
        const dmgMod = [4096, 4915, 5734, 6553, 7372, 8192];
        const numConsecutive = this.effectState.numConsecutive > 5 ? 5 : this.effectState.numConsecutive;
        this.debug(`Current Metronome boost: ${dmgMod[numConsecutive]}/4096`);
        return this.chainModify([dmgMod[numConsecutive], 4096]);
      }*/
public Metronome(Pokemon pkmn) {
        super(pkmn);
    }
}