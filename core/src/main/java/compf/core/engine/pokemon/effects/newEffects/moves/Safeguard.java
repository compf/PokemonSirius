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
/*For 5 turns, the user and its party members cannot have non-volatile status conditions or confusion inflicted on them by other Pokemon. Pokemon on the user's side cannot become affected by Yawn but can fall asleep from its effect. It is removed from the user's side if the user or an ally is successfully hit by Defog. Fails if the effect is already active on the user's side.*/
 public class Safeguard extends PokemonBattleEffect{

/*@Override
 void 5*/
/*@Override
 void durationCallback(Pokemon target, Pokemon source, effect) {
        if (source?.hasAbility("persistent")) {
          this.add("-activate", source, "ability: Persistent", "[move] Safeguard");
          return 7;
        }
        return 5;
      }*/
/*@Override
 void onSetStatus(status, Pokemon target, Pokemon source, effect) {
        if (!effect || !source)
          return;
        if (effect.id === "yawn")
          return;
        if (effect.effectType === "Move" && effect.infiltrates && !target.isAlly(source))
          return;
        if (target !== source) {
          this.debug("interrupting setStatus");
          if (effect.name === "Synchronize" || effect.effectType === "Move" && !effect.secondaries) {
            this.add("-activate", target, "move: Safeguard");
          }
          return null;
        }
      }*/
/*@Override
 void onTryAddVolatile(status, Pokemon target, Pokemon source, effect) {
        if (!effect || !source)
          return;
        if (effect.effectType === "Move" && effect.infiltrates && !target.isAlly(source))
          return;
        if ((status.id === "confusion" || status.id === "yawn") && target !== source) {
          if (effect.effectType === "Move" && !effect.secondaries)
            this.add("-activate", target, "move: Safeguard");
          return null;
        }
      }*/
/*@Override
 void onSideStart(side, source) {
        if (source?.hasAbility("persistent")) {
          this.add("-sidestart", side, "Safeguard", "[persistent]");
        } else {
          this.add("-sidestart", side, "Safeguard");
        }
      }*/
/*@Override
 void 26*/
/*@Override
 void 3*/
/*@Override
 void onSideEnd(side) {
        this.add("-sideend", side, "Safeguard");
      }*/
public Safeguard(Pokemon pkmn) {
        super(pkmn);
    }
}