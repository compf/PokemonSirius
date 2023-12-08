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
/*The user and the target have their Attack and Special Attack stats set to be equal to the average of the user and the target's Attack and Special Attack stats, respectively, rounded down. Stat stage changes are unaffected.*/
 public class Power_Split extends PokemonBattleEffect{

/*@Override
 void onHit(Pokemon target, source) {
      const newatk = Math.floor((target.storedStats.atk + source.storedStats.atk) / 2);
      target.storedStats.atk = newatk;
      source.storedStats.atk = newatk;
      const newspa = Math.floor((target.storedStats.spa + source.storedStats.spa) / 2);
      target.storedStats.spa = newspa;
      source.storedStats.spa = newspa;
      this.add("-activate", Pokemon source, "move: Power Split", "[of] " + target);
    }*/
public Power_Split(Pokemon pkmn) {
        super(pkmn);
    }
}