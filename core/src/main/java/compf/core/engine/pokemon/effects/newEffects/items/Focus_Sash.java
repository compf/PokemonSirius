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
/*If holder's HP is full, will survive an attack that would KO it with 1 HP. Single use.*/
 public class Focus_Sash extends PokemonBattleEffect{

/*@Override
 void onDamage(DamageInformation damage, Pokemon target, Pokemon source, effect) {
      if (target.hp === target.maxhp && damage >= target.hp && effect && effect.effectType === "Move") {
        if (target.useItem()) {
          return target.hp - 1;
        }
      }
    }*/
public Focus_Sash(Pokemon pkmn) {
        super(pkmn);
    }
}