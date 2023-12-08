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
/*This move cannot be selected unless the user is holding a Berry. The user eats its Berry and raises its Defense by 2 stages. This effect is not prevented by the Klutz or Unnerve Abilities, or the effects of Embargo or Magic Room. Fails if the user is not holding a Berry.*/
 public class Stuff_Cheeks extends PokemonBattleEffect{

/*@Override
 void onDisableMove(pokemon) {
      if (!pokemon.getItem().isBerry)
        pokemon.disableMove("stuffcheeks");
    }*/
/*@Override
 void onTry(source) {
      return source.getItem().isBerry;
    }*/
/*@Override
 void onHit(pokemon) {
      if (!this.boost({ def: 2 }))
        return null;
      pokemon.eatItem(true);
    }*/
public Stuff_Cheeks(Pokemon pkmn) {
        super(pkmn);
    }
}