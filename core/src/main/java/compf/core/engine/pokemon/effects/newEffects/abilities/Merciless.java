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
 public class Merciless extends PokemonBattleEffect{

/*@Override
 void onModifyCritRatio(critRatio, Pokemon source, target) {
      if (target && ["psn", "tox"].includes(target.status))
        return 5;
    }*/
public Merciless(Pokemon pkmn) {
        super(pkmn);
    }
}