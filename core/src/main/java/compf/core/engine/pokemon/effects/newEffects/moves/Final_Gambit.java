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
/*Deals damage to the target equal to the user's current HP. If this move is successful, the user faints.*/
 public class Final_Gambit extends PokemonBattleEffect{

/*@Override
 void damageCallback(pokemon) {
      const damage = pokemon.hp;
      pokemon.faint();
      return damage;
    }*/
public Final_Gambit(Pokemon pkmn) {
        super(pkmn);
    }
}