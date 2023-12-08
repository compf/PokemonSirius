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
/*If held by a Ditto that hasn't Transformed, its Speed is doubled.*/
 public class Quick_Powder extends PokemonBattleEffect{

/*@Override
 void onModifySpe(spe, pokemon) {
      if (pokemon.species.name === "Ditto" && !pokemon.transformed) {
        return this.chainModify(2);
      }
    }*/
public Quick_Powder(Pokemon pkmn) {
        super(pkmn);
    }
}