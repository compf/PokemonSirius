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
/*If another Pokemon burns, paralyzes, poisons, or badly poisons this Pokemon, that Pokemon receives the same non-volatile status condition.*/
 public class Synchronize extends PokemonBattleEffect{

/*@Override
 void onAfterSetStatus(status, Pokemon target, Pokemon source, effect) {
      if (!source || source === target)
        return;
      if (effect && effect.id === "toxicspikes")
        return;
      if (status.id === "slp" || status.id === "frz")
        return;
      this.add("-activate", target, "ability: Synchronize");
      source.trySetStatus(status, target, { status: status.id, id: "synchronize" });
    }*/
public Synchronize(Pokemon pkmn) {
        super(pkmn);
    }
}