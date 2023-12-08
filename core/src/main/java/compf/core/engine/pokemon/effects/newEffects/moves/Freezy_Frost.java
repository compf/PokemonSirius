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
/*Resets the stat stages of all active Pokemon to 0.*/
 public class Freezy_Frost extends PokemonBattleEffect{

/*@Override
 void onHit() {
      this.add("-clearallboost");
      for (const pokemon of this.getAllActive()) {
        pokemon.clearBoosts();
      }
    }*/
public Freezy_Frost(Pokemon pkmn) {
        super(pkmn);
    }
}