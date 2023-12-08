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
/*This move becomes a physical attack if the user's Attack is greater than its Special Attack, including stat stage changes. This move and its effects ignore the Abilities of other Pokemon.*/
 public class Photon_Geyser extends PokemonBattleEffect{

/*@Override
 void onModifyMove(Move move, pokemon) {
      if (pokemon.getStat("atk", false, true) > pokemon.getStat("spa", false, true))
        move.category = "Physical";
    }*/
public Photon_Geyser(Pokemon pkmn) {
        super(pkmn);
    }
}