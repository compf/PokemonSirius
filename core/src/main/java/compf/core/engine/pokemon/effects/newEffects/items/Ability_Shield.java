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
/*Holder's Ability cannot be changed by any effect.*/
 public class Ability_Shield extends PokemonBattleEffect{

/*@Override
 void onSetAbility(ability, Pokemon target, Pokemon source, effect) {
      if (effect && effect.effectType === "Ability" && effect.name !== "Trace") {
        this.add("-ability", source, effect);
      }
      this.add("-block", target, "item: Ability Shield");
      return null;
    }*/
public Ability_Shield(Pokemon pkmn) {
        super(pkmn);
    }
}