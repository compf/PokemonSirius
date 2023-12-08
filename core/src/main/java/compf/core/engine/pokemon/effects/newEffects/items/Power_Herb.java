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
/*Holder's two-turn moves complete in one turn (except Sky Drop). Single use.*/
 public class Power_Herb extends PokemonBattleEffect{

/*@Override
 void onChargeMove(pokemon, Pokemon target, move) {
      if (pokemon.useItem()) {
        this.debug("power herb - remove charge turn for " + move.id);
        this.attrLastMove("[still]");
        this.addMove("-anim", pokemon, move.name, target);
        return false;
      }
    }*/
public Power_Herb(Pokemon pkmn) {
        super(pkmn);
    }
}