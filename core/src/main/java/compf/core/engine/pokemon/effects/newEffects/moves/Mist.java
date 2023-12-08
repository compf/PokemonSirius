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
/*For 5 turns, the user and its party members are protected from having their stat stages lowered by other Pokemon. Fails if the effect is already active on the user's side.*/
 public class Mist extends PokemonBattleEffect{

/*@Override
 void 5*/
/*@Override
 void onTryBoost(boost, Pokemon target, Pokemon source, effect) {
        if (effect.effectType === "Move" && effect.infiltrates && !target.isAlly(source))
          return;
        if (source && target !== source) {
          let showMsg = false;
          let i;
          for (i in boost) {
            if (boost[i] < 0) {
              delete boost[i];
              showMsg = true;
            }
          }
          if (showMsg && !effect.secondaries) {
            this.add("-activate", target, "move: Mist");
          }
        }
      }*/
/*@Override
 void onSideStart(side) {
        this.add("-sidestart", side, "Mist");
      }*/
/*@Override
 void 26*/
/*@Override
 void 4*/
/*@Override
 void onSideEnd(side) {
        this.add("-sideend", side, "Mist");
      }*/
public Mist(Pokemon pkmn) {
        super(pkmn);
    }
}