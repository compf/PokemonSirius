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
 public class Good_as_Gold extends PokemonBattleEffect{

/*@Override
 void onTryHit(Pokemon target, Pokemon source, move) {
      if (move.category === "Status" && target !== source) {
        this.add("-immune", target, "[from] ability: Good as Gold");
        return null;
      }
    }*/
public Good_as_Gold(Pokemon pkmn) {
        super(pkmn);
    }
}