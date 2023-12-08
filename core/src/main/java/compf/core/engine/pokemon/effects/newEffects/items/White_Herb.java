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
/*Restores all lowered stat stages to 0 when one is less than 0. Single use.*/
 public class White_Herb extends PokemonBattleEffect{

/*@Override
 void onUpdate(pokemon) {
      let activate = false;
      const boosts = {};
      let i;
      for (i in pokemon.boosts) {
        if (pokemon.boosts[i] < 0) {
          activate = true;
          boosts[i] = 0;
        }
      }
      if (activate && pokemon.useItem()) {
        pokemon.setBoost(boosts);
        this.add("-clearnegativeboost", pokemon, "[silent]");
      }
    }*/
public White_Herb(Pokemon pkmn) {
        super(pkmn);
    }
}