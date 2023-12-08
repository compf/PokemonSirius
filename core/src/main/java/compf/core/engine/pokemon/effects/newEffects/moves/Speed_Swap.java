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
/*The user swaps its Speed stat with the target. Stat stage changes are unaffected.*/
 public class Speed_Swap extends PokemonBattleEffect{

/*@Override
 void onHit(Pokemon target, source) {
      const targetSpe = target.storedStats.spe;
      target.storedStats.spe = source.storedStats.spe;
      source.storedStats.spe = targetSpe;
      this.add("-activate", Pokemon source, "move: Speed Swap", "[of] " + target);
    }*/
public Speed_Swap(Pokemon pkmn) {
        super(pkmn);
    }
}