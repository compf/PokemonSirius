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
 public class Curious_Medicine extends PokemonBattleEffect{

/*@Override
 void onStart(pokemon) {
      for (const ally of pokemon.adjacentAllies()) {
        ally.clearBoosts();
        this.add("-clearboost", ally, "[from] ability: Curious Medicine", "[of] " + pokemon);
      }
    }*/
public Curious_Medicine(Pokemon pkmn) {
        super(pkmn);
    }
}