package compf.core.engine.pokemon.effects.newEffects.abilities;

import compf.core.engine.BattleAction;
    import compf.core.engine.pokemon.PokemonStat;
    import compf.core.engine.pokemon.Pokemon;
    import compf.core.engine.pokemon.effects.EffectParam;
    import compf.core.engine.pokemon.effects.PokemonBattleEffect;
    import compf.core.engine.pokemon.moves.DamageInformation;
    import compf.core.engine.pokemon.moves.Schedule;
    import compf.core.engine.pokemon.moves.Schedule.ScheduleItem;
    import compf.core.etc.services.SharedInformation;
/*Grass-type Pokemon on this Pokemon's side cannot have their stat stages lowered by other Pokemon or have a non-volatile status condition inflicted on them by other Pokemon.*/
 public class Flower_Veil extends PokemonBattleEffect{

/*@Override
 void onAllyTryBoost(boost, Pokemon target, Pokemon source, effect) {
      if (source && target === source || !target.hasType("Grass"))
        return;
      let showMsg = false;
      let i;
      for (i in boost) {
        if (boost[i] < 0) {
          delete boost[i];
          showMsg = true;
        }
      }
      if (showMsg && !effect.secondaries) {
        const effectHolder = this.effectState.target;
        this.add("-block", target, "ability: Flower Veil", "[of] " + effectHolder);
      }
    }*/
/*@Override
 void onAllySetStatus(status, Pokemon target, Pokemon source, effect) {
      if (target.hasType("Grass") && source && target !== source && effect && effect.id !== "yawn") {
        this.debug("interrupting setStatus with Flower Veil");
        if (effect.name === "Synchronize" || effect.effectType === "Move" && !effect.secondaries) {
          const effectHolder = this.effectState.target;
          this.add("-block", target, "ability: Flower Veil", "[of] " + effectHolder);
        }
        return null;
      }
    }*/
/*@Override
 void onAllyTryAddVolatile(status, target) {
      if (target.hasType("Grass") && status.id === "yawn") {
        this.debug("Flower Veil blocking yawn");
        const effectHolder = this.effectState.target;
        this.add("-block", Pokemon target, "ability: Flower Veil", "[of] " + effectHolder);
        return null;
      }
    }*/
public Flower_Veil(Pokemon pkmn) {
        super(pkmn);
    }
}