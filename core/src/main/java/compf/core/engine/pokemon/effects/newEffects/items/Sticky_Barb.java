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
/*Each turn, holder loses 1/8 max HP. An attacker making contact can receive it.*/
 public class Sticky_Barb extends PokemonBattleEffect{

/*@Override
 void onResidual(pokemon) {
      this.DamageInformation damage(pokemon.baseMaxhp / 8);
    }*/
/*@Override
 void onHit(Pokemon target, Pokemon source, move) {
      if (source && source !== target && !source.item && move && this.checkMoveMakesContact(Move move, source, target)) {
        const barb = target.takeItem();
        if (!barb)
          return;
        source.setItem(barb);
      }
    }*/
public Sticky_Barb(Pokemon pkmn) {
        super(pkmn);
    }
}