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
/*undefined*/
 public class Costar extends PokemonBattleEffect{

/*@Override
 void onStart(pokemon) {
      const ally = pokemon.allies()[0];
      if (!ally)
        return;
      let i;
      for (i in ally.boosts) {
        pokemon.boosts[i] = ally.boosts[i];
      }
      const volatilesToCopy = ["focusenergy", "gmaxchistrike", "laserfocus"];
      for (const volatile of volatilesToCopy) {
        if (ally.volatiles[volatile]) {
          pokemon.addVolatile(volatile);
          if (volatile === "gmaxchistrike")
            pokemon.volatiles[volatile].layers = ally.volatiles[volatile].layers;
        } else {
          pokemon.removeVolatile(volatile);
        }
      }
      this.add("-copyboost", pokemon, ally, "[from] ability: Costar");
    }*/
public Costar(Pokemon pkmn) {
        super(pkmn);
    }
}