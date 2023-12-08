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
/*Ogerpon-Hearthflame: 1.2x power attacks; Terastallize to gain Embody Aspect.*/
 public class Hearthflame_Mask extends PokemonBattleEffect{

/*@Override
 void onBasePower(basePower, user, Pokemon target, move) {
      if (user.baseSpecies.name.startsWith("Ogerpon-Hearthflame")) {
        return this.chainModify([4915, 4096]);
      }
    }*/
/*@Override
 void onTakeItem(item, source) {
      if (source.baseSpecies.baseSpecies === "Ogerpon")
        return false;
      return true;
    }*/
public Hearthflame_Mask(Pokemon pkmn) {
        super(pkmn);
    }
}