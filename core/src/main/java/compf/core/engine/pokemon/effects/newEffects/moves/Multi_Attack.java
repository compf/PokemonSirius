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
/*This move's type depends on the user's held Memory.*/
 public class Multi_Attack extends PokemonBattleEffect{

/*@Override
 void onModifyType(Move move, pokemon) {
      if (pokemon.ignoringItem())
        return;
      move.type = this.runEvent("Memory", pokemon, null, move, "Normal");
    }*/
public Multi_Attack(Pokemon pkmn) {
        super(pkmn);
    }
}