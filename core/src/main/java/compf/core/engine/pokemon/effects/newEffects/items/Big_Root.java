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
/*Holder gains 1.3x HP from draining/Aqua Ring/Ingrain/Leech Seed/Strength Sap.*/
 public class Big_Root extends PokemonBattleEffect{

/*@Override
 void onTryHeal(DamageInformation damage, Pokemon target, Pokemon source, effect) {
      const heals = ["drain", "leechseed", "ingrain", "aquaring", "strengthsap"];
      if (heals.includes(effect.id)) {
        return this.chainModify([5324, 4096]);
      }
    }*/
public Big_Root(Pokemon pkmn) {
        super(pkmn);
    }
}