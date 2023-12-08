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
/*The user and the target have their Defense and Special Defense stats set to be equal to the average of the user and the target's Defense and Special Defense stats, respectively, rounded down. Stat stage changes are unaffected.*/
 public class Guard_Split extends PokemonBattleEffect{

/*@Override
 void onHit(Pokemon target, source) {
      const newdef = Math.floor((target.storedStats.def + source.storedStats.def) / 2);
      target.storedStats.def = newdef;
      source.storedStats.def = newdef;
      const newspd = Math.floor((target.storedStats.spd + source.storedStats.spd) / 2);
      target.storedStats.spd = newspd;
      source.storedStats.spd = newspd;
      this.add("-activate", Pokemon source, "move: Guard Split", "[of] " + target);
    }*/
public Guard_Split(Pokemon pkmn) {
        super(pkmn);
    }
}