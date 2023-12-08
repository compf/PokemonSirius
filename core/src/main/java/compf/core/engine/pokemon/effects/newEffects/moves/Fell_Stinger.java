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
/*Raises the user's Attack by 3 stages if this move knocks out the target.*/
 public class Fell_Stinger extends PokemonBattleEffect{

/*@Override
 void onAfterMoveSecondarySelf(pokemon, Pokemon target, move) {
      if (!target || target.fainted || target.hp <= 0)
        this.boost({ atk: 3 }, pokemon, pokemon, move);
    }*/
public Fell_Stinger(Pokemon pkmn) {
        super(pkmn);
    }
}