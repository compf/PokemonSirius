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
/*This Pokemon's moves ignore substitutes and the opposing side's Reflect, Light Screen, Safeguard, Mist, and Aurora Veil.*/
 public class Infiltrator extends PokemonBattleEffect{

/*@Override
 void onModifyMove(move) {
      move.infiltrates = true;
    }*/
public Infiltrator(Pokemon pkmn) {
        super(pkmn);
    }
}