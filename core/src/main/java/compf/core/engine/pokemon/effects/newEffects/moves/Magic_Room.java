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
/*For 5 turns, the held items of all active Pokemon have no effect. An item's effect of causing forme changes is unaffected, but any other effects from such items are negated. During the effect, Fling and Natural Gift are prevented from being used by all active Pokemon. If this move is used during the effect, the effect ends.*/
 public class Magic_Room extends PokemonBattleEffect{

/*@Override
 void 5*/
/*@Override
 void durationCallback(Pokemon source, effect) {
        if (source?.hasAbility("persistent")) {
          this.add("-activate", source, "ability: Persistent", "[move] Magic Room");
          return 7;
        }
        return 5;
      }*/
/*@Override
 void onFieldStart(Pokemon target, source) {
        if (source?.hasAbility("persistent")) {
          this.add("-fieldstart", "move: Magic Room", "[of] " + Pokemon source, "[persistent]");
        } else {
          this.add("-fieldstart", "move: Magic Room", "[of] " + source);
        }
        for (const mon of this.getAllActive()) {
          this.singleEvent("End", mon.getItem(), mon.itemState, mon);
        }
      }*/
/*@Override
 void onFieldRestart(Pokemon target, source) {
        this.field.removePseudoWeather("magicroom");
      }*/
/*@Override
 void 27*/
/*@Override
 void 6*/
/*@Override
 void onFieldEnd() {
        this.add("-fieldend", "move: Magic Room", "[of] " + this.effectState.source);
      }*/
public Magic_Room(Pokemon pkmn) {
        super(pkmn);
    }
}