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
/*If held by a Cubone or a Marowak, its Attack is doubled.*/
 public class Thick_Club extends PokemonBattleEffect{

/*@Override
 void onModifyAtk(atk, pokemon) {
      if (pokemon.baseSpecies.baseSpecies === "Cubone" || pokemon.baseSpecies.baseSpecies === "Marowak") {
        return this.chainModify(2);
      }
    }*/
public Thick_Club(Pokemon pkmn) {
        super(pkmn);
    }
}