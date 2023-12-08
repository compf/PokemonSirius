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
/*This Pokemon and its allies cannot become affected by Attract, Disable, Encore, Heal Block, Taunt, or Torment.*/
 public class Aroma_Veil extends PokemonBattleEffect{

/*@Override
 void onAllyTryAddVolatile(status, Pokemon target, Pokemon source, effect) {
      if (["attract", "disable", "encore", "healblock", "taunt", "torment"].includes(status.id)) {
        if (effect.effectType === "Move") {
          const effectHolder = this.effectState.target;
          this.add("-block", target, "ability: Aroma Veil", "[of] " + effectHolder);
        }
        return null;
      }
    }*/
public Aroma_Veil(Pokemon pkmn) {
        super(pkmn);
    }
}