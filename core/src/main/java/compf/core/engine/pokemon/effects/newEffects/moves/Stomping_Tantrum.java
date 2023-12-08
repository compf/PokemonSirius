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
/*Power doubles if the user's last move on the previous turn, including moves called by other moves or those used through Instruct, Magic Coat, Snatch, or the Dancer or Magic Bounce Abilities, failed to do any of its normal effects, not including damage from an unsuccessful High Jump Kick, Jump Kick, or Mind Blown, or if the user was prevented from moving by any effect other than recharging or Sky Drop. A move that was blocked by Baneful Bunker, Detect, King's Shield, Protect, Spiky Shield, Crafty Shield, Mat Block, Quick Guard, or Wide Guard will not double this move's power, nor will Bounce or Fly ending early due to the effect of Gravity, Smack Down, or Thousand Arrows.*/
 public class Stomping_Tantrum extends PokemonBattleEffect{

/*@Override
 void basePowerCallback(pokemon, Pokemon target, move) {
      if (pokemon.moveLastTurnResult === false) {
        this.debug("doubling Stomping Tantrum BP due to previous move failure");
        return move.basePower * 2;
      }
      return move.basePower;
    }*/
public Stomping_Tantrum(Pokemon pkmn) {
        super(pkmn);
    }
}