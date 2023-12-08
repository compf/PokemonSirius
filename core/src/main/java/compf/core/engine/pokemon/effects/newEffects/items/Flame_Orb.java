package compf.core.engine.pokemon.effects.newEffects.items;

import compf.core.engine.BattleAction;
    import compf.core.engine.pokemon.PokemonStat;
    import compf.core.engine.pokemon.Pokemon;
    import compf.core.engine.pokemon.effects.EffectParam;
    import compf.core.engine.pokemon.effects.PokemonBattleEffect;
    import compf.core.engine.pokemon.moves.DamageInformation;
    import compf.core.engine.pokemon.moves.Schedule;
    import compf.core.engine.pokemon.moves.Schedule.ScheduleItem;
    import compf.core.etc.services.SharedInformation;
/*At the end of every turn, this item attempts to burn the holder.*/
 public class Flame_Orb extends PokemonBattleEffect{

/*@Override
 void onResidual(pokemon) {
      pokemon.trySetStatus("brn", pokemon);
    }*/
public Flame_Orb(Pokemon pkmn) {
        super(pkmn);
    }
}