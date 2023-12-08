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
/*The user uses the last move used by any Pokemon, including itself. Fails if no move has been used, or if the last move used was Assist, Baneful Bunker, Beak Blast, Behemoth Bash, Behemoth Blade, Belch, Bestow, Blazing Torque, Celebrate, Chatter, Circle Throw, Combat Torque, Copycat, Counter, Covet, Destiny Bond, Detect, Dragon Tail, Dynamax Cannon, Endure, Feint, Focus Punch, Follow Me, Helping Hand, Hold Hands, King's Shield, Magical Torque, Mat Block, Me First, Metronome, Mimic, Mirror Move, Nature Power, Noxious Torque, Protect, Rage Powder, Roar, Shell Trap, Sketch, Sleep Talk, Snatch, Spiky Shield, Spotlight, Struggle, Switcheroo, Thief, Transform, Trick, Whirlwind, or Wicked Torque.*/
 public class Copycat extends PokemonBattleEffect{

/*@Override
 void onHit(pokemon) {
      let move = this.lastMove;
      if (!move)
        return;
      if (move.isMax && move.baseMove)
        move = this.dex.moves.get(move.baseMove);
      if (move.flags["failcopycat"] || move.isZ || move.isMax) {
        return false;
      }
      this.actions.useMove(move.id, pokemon);
    }*/
public Copycat(Pokemon pkmn) {
        super(pkmn);
    }
}