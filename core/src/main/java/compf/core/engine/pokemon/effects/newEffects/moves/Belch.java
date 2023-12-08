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
/*This move cannot be selected until the user eats a Berry, either by eating one that was held, stealing and eating one off another Pokemon with Bug Bite or Pluck, or eating one that was thrown at it with Fling. Once the condition is met, this move can be selected and used for the rest of the battle even if the user gains or uses another item or switches out. Consuming a Berry with Natural Gift does not count for the purposes of eating one.*/
 public class Belch extends PokemonBattleEffect{

/*@Override
 void onDisableMove(pokemon) {
      if (!pokemon.ateBerry)
        pokemon.disableMove("belch");
    }*/
public Belch(Pokemon pkmn) {
        super(pkmn);
    }
}