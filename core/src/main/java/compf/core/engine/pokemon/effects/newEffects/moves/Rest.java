package compf.core.engine.pokemon.effects.newEffects.moves;

import compf.core.engine.BattleAction;
    import compf.core.engine.pokemon.PokemonStat;
    import compf.core.engine.pokemon.Pokemon;
    import compf.core.engine.pokemon.effects.EffectParam;
    import compf.core.engine.pokemon.effects.PokemonBattleEffect;
    import compf.core.engine.pokemon.moves.DamageInformation;
    import compf.core.engine.pokemon.moves.Schedule;
    import compf.core.engine.pokemon.moves.Schedule.ScheduleItem;
    import compf.core.etc.services.SharedInformation;
/*The user falls asleep for the next two turns and restores all of its HP, curing itself of any non-volatile status condition in the process. Fails if the user has full HP, is already asleep, or if another effect is preventing sleep.*/
 public class Rest extends PokemonBattleEffect{

/*@Override
 void onTry(source) {
      if (source.status === "slp" || source.hasAbility("comatose"))
        return false;
      if (source.hp === source.maxhp) {
        this.add("-fail", Pokemon source, "heal");
        return null;
      }
      if (source.hasAbility(["insomnia", "vitalspirit"])) {
        this.add("-fail", source, "[from] ability: " + source.getAbility().name, "[of] " + source);
        return null;
      }
    }*/
/*@Override
 void onHit(Pokemon target, Pokemon source, move) {
      const result = target.setStatus("slp", source, move);
      if (!result)
        return result;
      target.statusState.time = 3;
      target.statusState.startTime = 3;
      this.heal(target.maxhp);
    }*/
public Rest(Pokemon pkmn) {
        super(pkmn);
    }
}