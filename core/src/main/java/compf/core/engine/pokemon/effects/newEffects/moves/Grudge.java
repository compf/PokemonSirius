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
/*Until the user's next turn, if an opposing Pokemon's attack knocks the user out, that move loses all its remaining PP.*/
 public class Grudge extends PokemonBattleEffect{

/*@Override
 void onStart(pokemon) {
        this.add("-singlemove", pokemon, "Grudge");
      }*/
/*@Override
 void onFaint(Pokemon target, Pokemon source, effect) {
        if (!source || source.fainted || !effect)
          return;
        if (effect.effectType === "Move" && !effect.flags["futuremove"] && source.lastMove) {
          let move = source.lastMove;
          if (move.isMax && move.baseMove)
            move = this.dex.moves.get(move.baseMove);
          for (const moveSlot of source.moveSlots) {
            if (moveSlot.id === move.id) {
              moveSlot.pp = 0;
              this.add("-activate", source, "move: Grudge", move.name);
            }
          }
        }
      }*/
/*@Override
 void 100*/
/*@Override
 void onBeforeMove(pokemon) {
        this.debug("removing Grudge before attack");
        pokemon.removeVolatile("grudge");
      }*/
public Grudge(Pokemon pkmn) {
        super(pkmn);
    }
}