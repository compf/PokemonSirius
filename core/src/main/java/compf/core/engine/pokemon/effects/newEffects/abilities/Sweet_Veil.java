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
/*This Pokemon and its allies cannot fall asleep, but those already asleep do not wake up immediately. This Pokemon and its allies cannot use Rest successfully or become affected by Yawn, and those previously affected will not fall asleep.*/
 public class Sweet_Veil extends PokemonBattleEffect{

/*@Override
 void onAllySetStatus(status, Pokemon target, Pokemon source, effect) {
      if (status.id === "slp") {
        this.debug("Sweet Veil interrupts sleep");
        const effectHolder = this.effectState.target;
        this.add("-block", target, "ability: Sweet Veil", "[of] " + effectHolder);
        return null;
      }
    }*/
/*@Override
 void onAllyTryAddVolatile(status, target) {
      if (status.id === "yawn") {
        this.debug("Sweet Veil blocking yawn");
        const effectHolder = this.effectState.target;
        this.add("-block", Pokemon target, "ability: Sweet Veil", "[of] " + effectHolder);
        return null;
      }
    }*/
public Sweet_Veil(Pokemon pkmn) {
        super(pkmn);
    }
}