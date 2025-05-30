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
/*Has a 30% chance to make the target flinch. Fails if the user is not asleep.*/
 public class Snore extends PokemonBattleEffect{

/*@Override
 void onTry(source) {
      return source.status === "slp" || source.hasAbility("comatose");
    }*/
public Snore(Pokemon pkmn) {
        super(pkmn);
    }
}