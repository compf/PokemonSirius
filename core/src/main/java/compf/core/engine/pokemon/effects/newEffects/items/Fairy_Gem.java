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
/*Holder's first successful Fairy-type attack will have 1.3x power. Single use.*/
 public class Fairy_Gem extends PokemonBattleEffect{

/*@Override
 void onSourceTryPrimaryHit(Pokemon target, Pokemon source, move) {
      if (target === source || move.category === "Status")
        return;
      if (move.type === "Fairy" && source.useItem()) {
        source.addVolatile("gem");
      }
    }*/
public Fairy_Gem(Pokemon pkmn) {
        super(pkmn);
    }
}