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
/*Deals damage to the target equal to (user's level) * (X + 50) / 100, where X is a random number from 0 to 100, rounded down, but not less than 1 HP.*/
 public class Psywave extends PokemonBattleEffect{

/*@Override
 void damageCallback(pokemon) {
      return this.random(50, 151) * pokemon.level / 100;
    }*/
public Psywave(Pokemon pkmn) {
        super(pkmn);
    }
}