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
/*This Pokemon's sound-based moves become Water-type moves. This effect comes after other effects that change a move's type, but before Ion Deluge and Electrify's effects.*/
 public class Liquid_Voice extends PokemonBattleEffect{

/*@Override
 void onModifyType(Move move, pokemon) {
      if (move.flags["sound"] && !pokemon.volatiles["dynamax"]) {
        move.type = "Water";
      }
    }*/
public Liquid_Voice(Pokemon pkmn) {
        super(pkmn);
    }
}