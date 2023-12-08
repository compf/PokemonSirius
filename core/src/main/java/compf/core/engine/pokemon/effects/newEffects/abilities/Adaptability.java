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
/*This Pokemon's moves that match one of its types have a same-type attack bonus (STAB) of 2 instead of 1.5.*/
 public class Adaptability extends PokemonBattleEffect{

/*@Override
 void onModifyMove(move) {
      move.stab = 2;
    }*/
public Adaptability(Pokemon pkmn) {
        super(pkmn);
    }
}