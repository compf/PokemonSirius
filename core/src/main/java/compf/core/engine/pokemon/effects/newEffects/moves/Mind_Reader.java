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
/*Until the end of the next turn, the target cannot avoid the user's moves, even if the target is in the middle of a two-turn move. The effect ends if either the user or the target leaves the field. Fails if this effect is active for the user.*/
 public class Mind_Reader extends PokemonBattleEffect{

/*@Override
 void onTryHit(Pokemon target, source) {
      if (source.volatiles["lockon"])
        return false;
    }*/
/*@Override
 void onHit(Pokemon target, source) {
      source.addVolatile("lockon", target);
      this.add("-activate", Pokemon source, "move: Mind Reader", "[of] " + target);
    }*/
public Mind_Reader(Pokemon pkmn) {
        super(pkmn);
    }
}