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
/*For 5 turns, the Speed of every Pokemon is recalculated for the purposes of determining turn order. During the effect, each Pokemon's Speed is considered to be (10000 - its normal Speed), and if this value is greater than 8191, 8192 is subtracted from it. If this move is used during the effect, the effect ends.*/
 public class Trick_Room extends PokemonBattleEffect{

/*@Override
 void 5*/
/*@Override
 void durationCallback(Pokemon source, effect) {
        if (source?.hasAbility("persistent")) {
          this.add("-activate", source, "ability: Persistent", "[move] Trick Room");
          return 7;
        }
        return 5;
      }*/
/*@Override
 void onFieldStart(Pokemon target, source) {
        if (source?.hasAbility("persistent")) {
          this.add("-fieldstart", "move: Trick Room", "[of] " + Pokemon source, "[persistent]");
        } else {
          this.add("-fieldstart", "move: Trick Room", "[of] " + source);
        }
      }*/
/*@Override
 void onFieldRestart(Pokemon target, source) {
        this.field.removePseudoWeather("trickroom");
      }*/
/*@Override
 void 27*/
/*@Override
 void 1*/
/*@Override
 void onFieldEnd() {
        this.add("-fieldend", "move: Trick Room");
      }*/
public Trick_Room(Pokemon pkmn) {
        super(pkmn);
    }
}