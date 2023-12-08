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
/*The user cures its burn, poison, or paralysis. Fails if the user is not burned, poisoned, or paralyzed.*/
 public class Refresh extends PokemonBattleEffect{

/*@Override
 void onHit(pokemon) {
      if (["", "slp", "frz"].includes(pokemon.status))
        return false;
      pokemon.cureStatus();
    }*/
public Refresh(Pokemon pkmn) {
        super(pkmn);
    }
}