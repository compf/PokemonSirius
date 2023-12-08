package compf.core.engine.pokemon.effects.newEffects.items;

import compf.core.engine.BattleAction;
    import compf.core.engine.pokemon.PokemonStat;
    import compf.core.engine.pokemon.Pokemon;
    import compf.core.engine.pokemon.effects.EffectParam;
    import compf.core.engine.pokemon.effects.PokemonBattleEffect;
    import compf.core.engine.pokemon.moves.DamageInformation;
    import compf.core.engine.pokemon.moves.Schedule;
    import compf.core.engine.pokemon.moves.Schedule.ScheduleItem;
    import compf.core.etc.services.SharedInformation;
/*Holder's next move has 1.2x accuracy when at 1/4 max HP or less. Single use.*/
 public class Micle_Berry extends PokemonBattleEffect{

/*@Override
 void onResidual(pokemon) {
      if (pokemon.hp <= pokemon.maxhp / 4 || pokemon.hp <= pokemon.maxhp / 2 && pokemon.hasAbility("gluttony") && pokemon.abilityState.gluttony) {
        pokemon.eatItem();
      }
    }*/
/*@Override
 void onEat(pokemon) {
      pokemon.addVolatile("micleberry");
    }*/
/*@Override
 void 2*/
/*@Override
 void onSourceAccuracy(accuracy, Pokemon target, Pokemon source, move) {
        if (!move.ohko) {
          this.add("-enditem", source, "Micle Berry");
          source.removeVolatile("micleberry");
          if (typeof accuracy === "number") {
            return this.chainModify([4915, 4096]);
          }
        }
      }*/
public Micle_Berry(Pokemon pkmn) {
        super(pkmn);
    }
}