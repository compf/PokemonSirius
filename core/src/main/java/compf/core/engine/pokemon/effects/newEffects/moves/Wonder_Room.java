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
/*For 5 turns, all active Pokemon have their Defense and Special Defense stats swapped. Stat stage changes are unaffected. If this move is used during the effect, the effect ends.*/
 public class Wonder_Room extends PokemonBattleEffect{

/*@Override
 void 5*/
/*@Override
 void durationCallback(Pokemon source, effect) {
        if (source?.hasAbility("persistent")) {
          this.add("-activate", source, "ability: Persistent", "[move] Wonder Room");
          return 7;
        }
        return 5;
      }*/
/*@Override
 void onModifyMove(Move move, Pokemon source, target) {
        if (!move.overrideOffensiveStat)
          return;
        const statAndBoosts = move.overrideOffensiveStat;
        if (!["def", "spd"].includes(statAndBoosts))
          return;
        move.overrideOffensiveStat = statAndBoosts === "def" ? "spd" : "def";
        this.hint(`${move.name} uses ${statAndBoosts === "def" ? "" : "Sp. "}Def boosts when Wonder Room is active.`);
      }*/
/*@Override
 void onFieldStart(field, source) {
        if (source?.hasAbility("persistent")) {
          this.add("-fieldstart", "move: Wonder Room", "[of] " + Pokemon source, "[persistent]");
        } else {
          this.add("-fieldstart", "move: Wonder Room", "[of] " + source);
        }
      }*/
/*@Override
 void onFieldRestart(Pokemon target, source) {
        this.field.removePseudoWeather("wonderroom");
      }*/
/*@Override
 void 27*/
/*@Override
 void 5*/
/*@Override
 void onFieldEnd() {
        this.add("-fieldend", "move: Wonder Room");
      }*/
public Wonder_Room(Pokemon pkmn) {
        super(pkmn);
    }
}