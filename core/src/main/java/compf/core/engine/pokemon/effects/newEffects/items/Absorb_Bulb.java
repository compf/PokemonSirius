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
/*Raises holder's Sp. Atk by 1 stage if hit by a Water-type attack. Single use.*/
 public class Absorb_Bulb extends PokemonBattleEffect{

/*@Override
 void onDamagingHit(DamageInformation damage, Pokemon target, Pokemon source, move) {
      if (move.type === "Water") {
        target.useItem();
      }
    }*/
public Absorb_Bulb(Pokemon pkmn) {
        super(pkmn);
    }
}