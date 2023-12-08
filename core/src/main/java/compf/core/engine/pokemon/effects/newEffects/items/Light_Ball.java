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
/*If held by a Pikachu, its Attack and Sp. Atk are doubled.*/
 public class Light_Ball extends PokemonBattleEffect{

/*@Override
 void onModifyAtk(atk, pokemon) {
      if (pokemon.baseSpecies.baseSpecies === "Pikachu") {
        return this.chainModify(2);
      }
    }*/
/*@Override
 void onModifySpA(spa, pokemon) {
      if (pokemon.baseSpecies.baseSpecies === "Pikachu") {
        return this.chainModify(2);
      }
    }*/
public Light_Ball(Pokemon pkmn) {
        super(pkmn);
    }
}