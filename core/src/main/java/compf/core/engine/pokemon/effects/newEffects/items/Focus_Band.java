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
/*Holder has a 10% chance to survive an attack that would KO it with 1 HP.*/
 public class Focus_Band extends PokemonBattleEffect{

/*@Override
 void onDamage(DamageInformation damage, Pokemon target, Pokemon source, effect) {
      if (this.randomChance(1, 10) && damage >= target.hp && effect && effect.effectType === "Move") {
        this.add("-activate", target, "item: Focus Band");
        return target.hp - 1;
      }
    }*/
public Focus_Band(Pokemon pkmn) {
        super(pkmn);
    }
}