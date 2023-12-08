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
/*This Pokemon gains the Charge effect when it takes a hit from a wind move or when Tailwind begins on this Pokemon's side.*/
 public class Wind_Power extends PokemonBattleEffect{

/*@Override
 void onDamagingHit(DamageInformation damage, Pokemon target, Pokemon source, move) {
      if (move.flags["wind"]) {
        target.addVolatile("charge");
      }
    }*/
/*@Override
 void onAllySideConditionStart(Pokemon target, Pokemon source, sideCondition) {
      const pokemon = this.effectState.target;
      if (sideCondition.id === "tailwind") {
        pokemon.addVolatile("charge");
      }
    }*/
public Wind_Power(Pokemon pkmn) {
        super(pkmn);
    }
}