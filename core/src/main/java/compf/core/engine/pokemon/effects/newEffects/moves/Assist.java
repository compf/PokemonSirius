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
/*A random move among those known by the user's party members is selected for use. Does not select Assist, Baneful Bunker, Beak Blast, Belch, Bestow, Blazing Torque, Bounce, Celebrate, Chatter, Circle Throw, Combat Torque, Copycat, Counter, Covet, Destiny Bond, Detect, Dig, Dive, Dragon Tail, Endure, Feint, Fly, Focus Punch, Follow Me, Helping Hand, Hold Hands, King's Shield, Magical Torque, Mat Block, Me First, Metronome, Mimic, Mirror Coat, Mirror Move, Nature Power, Noxious Torque, Phantom Force, Protect, Rage Powder, Roar, Shadow Force, Shell Trap, Sketch, Sky Drop, Sleep Talk, Snatch, Spiky Shield, Spotlight, Struggle, Switcheroo, Thief, Transform, Trick, Whirlwind, or Wicked Torque.*/
 public class Assist extends PokemonBattleEffect{

/*@Override
 void onHit(target) {
      const moves = [];
      for (const pokemon of target.side.pokemon) {
        if (pokemon === target)
          continue;
        for (const moveSlot of pokemon.moveSlots) {
          const moveid = moveSlot.id;
          const move = this.dex.moves.get(moveid);
          if (move.flags["noassist"] || move.isZ || move.isMax) {
            continue;
          }
          moves.push(moveid);
        }
      }
      let randomMove = "";
      if (moves.length)
        randomMove = this.sample(moves);
      if (!randomMove) {
        return false;
      }
      this.actions.useMove(randomMove, target);
    }*/
public Assist(Pokemon pkmn) {
        super(pkmn);
    }
}