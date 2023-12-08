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
/*Raises holder's Special Attack by 1 stage after it uses a sound move. Single use.*/
 public class Throat_Spray extends PokemonBattleEffect{

/*@Override
 void onAfterMoveSecondarySelf(Pokemon target, Pokemon source, move) {
      if (move.flags["sound"]) {
        target.useItem();
      }
    }*/
public Throat_Spray(Pokemon pkmn) {
        super(pkmn);
    }
}