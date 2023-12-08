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
/*If held by a Latias/Latios, its Dragon- and Psychic-type moves have 1.2x power.*/
 public class Soul_Dew extends PokemonBattleEffect{

/*@Override
 void onBasePower(basePower, user, Pokemon target, move) {
      if (move && (user.baseSpecies.num === 380 || user.baseSpecies.num === 381) && (move.type === "Psychic" || move.type === "Dragon")) {
        return this.chainModify([4915, 4096]);
      }
    }*/
public Soul_Dew(Pokemon pkmn) {
        super(pkmn);
    }
}