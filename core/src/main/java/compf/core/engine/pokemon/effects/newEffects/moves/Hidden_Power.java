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
/*This move's type depends on the user's individual values (IVs), and can be any type but Fairy and Normal.*/
 public class Hidden_Power extends PokemonBattleEffect{

/*@Override
 void onModifyType(Move move, pokemon) {
      move.type = pokemon.hpType || "Dark";
    }*/
public Hidden_Power(Pokemon pkmn) {
        super(pkmn);
    }
}