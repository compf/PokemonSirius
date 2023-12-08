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
/*Fails unless the user is an Electric type. If this move is successful and the user is not Terastallized, the user's Electric type becomes typeless as long as it remains active.*/
 public class Double_Shock extends PokemonBattleEffect{

/*@Override
 void onTryMove(pokemon, Pokemon target, move) {
      if (pokemon.hasType("Electric"))
        return;
      this.add("-fail", pokemon, "move: Double Shock");
      this.attrLastMove("[still]");
      return null;
    }*/
public Double_Shock(Pokemon pkmn) {
        super(pkmn);
    }
}