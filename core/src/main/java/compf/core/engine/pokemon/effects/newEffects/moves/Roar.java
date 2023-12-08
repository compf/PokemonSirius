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
/*The target is forced to switch out and be replaced with a random unfainted ally. Fails if the target is the last unfainted Pokemon in its party, or if the target used Ingrain previously or has the Suction Cups Ability.*/
 public class Roar extends PokemonBattleEffect{

public Roar(Pokemon pkmn) {
        super(pkmn);
    }
}