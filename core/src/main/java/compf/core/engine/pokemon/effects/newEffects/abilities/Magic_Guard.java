package compf.core.engine.pokemon.effects.newEffects.abilities;

import compf.core.engine.BattleAction;
    import compf.core.engine.pokemon.PokemonStat;
    import compf.core.engine.pokemon.Pokemon;
    import compf.core.engine.pokemon.effects.EffectParam;
    import compf.core.engine.pokemon.effects.PokemonBattleEffect;
    import compf.core.engine.pokemon.moves.DamageInformation;
    import compf.core.engine.pokemon.moves.Schedule;
    import compf.core.engine.pokemon.moves.Schedule.ScheduleItem;
    import compf.core.etc.services.SharedInformation;
/*This Pokemon can only be damaged by direct attacks. Curse and Substitute on use, Belly Drum, Pain Split, Struggle recoil, and confusion damage are considered direct damage.*/
 public class Magic_Guard extends PokemonBattleEffect{

/*@Override
 void onDamage(DamageInformation damage, Pokemon target, Pokemon source, effect) {
      if (effect.effectType !== "Move") {
        if (effect.effectType === "Ability")
          this.add("-activate", source, "ability: " + effect.name);
        return false;
      }
    }*/
public Magic_Guard(Pokemon pkmn) {
        super(pkmn);
    }
}