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
/*The user copies all of the target's current stat stage changes.*/
 public class Psych_Up extends PokemonBattleEffect{

/*@Override
 void onHit(Pokemon target, source) {
      let i;
      for (i in target.boosts) {
        source.boosts[i] = target.boosts[i];
      }
      const volatilesToCopy = ["focusenergy", "gmaxchistrike", "laserfocus"];
      for (const volatile of volatilesToCopy) {
        if (target.volatiles[volatile]) {
          source.addVolatile(volatile);
          if (volatile === "gmaxchistrike")
            source.volatiles[volatile].layers = target.volatiles[volatile].layers;
        } else {
          source.removeVolatile(volatile);
        }
      }
      this.add("-copyboost", Pokemon source, target, "[from] move: Psych Up");
    }*/
public Psych_Up(Pokemon pkmn) {
        super(pkmn);
    }
}