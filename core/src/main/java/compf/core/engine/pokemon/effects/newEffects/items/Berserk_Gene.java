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
/*(Gen 2) On switch-in, raises holder's Attack by 2 and confuses it. Single use.*/
 public class Berserk_Gene extends PokemonBattleEffect{

/*@Override
 void onUpdate(pokemon) {
      if (pokemon.useItem()) {
        pokemon.addVolatile("confusion");
      }
    }*/
public Berserk_Gene(Pokemon pkmn) {
        super(pkmn);
    }
}