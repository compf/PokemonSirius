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
/*Holder's attacks do 1.3x damage, and it loses 1/10 its max HP after the attack.*/
 public class Life_Orb extends PokemonBattleEffect{

/*@Override
 void onModifyDamage(DamageInformation damage, Pokemon source, Pokemon target, move) {
      return this.chainModify([5324, 4096]);
    }*/
/*@Override
 void onAfterMoveSecondarySelf(Pokemon source, Pokemon target, move) {
      if (source && source !== target && move && move.category !== "Status" && !source.forceSwitchFlag) {
        this.DamageInformation damage(source.baseMaxhp / 10, source, source, this.dex.items.get("lifeorb"));
      }
    }*/
public Life_Orb(Pokemon pkmn) {
        super(pkmn);
    }
}