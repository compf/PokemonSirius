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
/*Raises holder's Speed by 1 stage if it gets affected by Intimidate. Single use.*/
 public class Adrenaline_Orb extends PokemonBattleEffect{

/*@Override
 void onAfterBoost(boost, Pokemon target, Pokemon source, effect) {
      if (target.boosts["spe"] === 6 || boost.atk === 0) {
        return;
      }
      if (effect.name === "Intimidate") {
        target.useItem();
      }
    }*/
public Adrenaline_Orb(Pokemon pkmn) {
        super(pkmn);
    }
}