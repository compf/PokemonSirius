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
/*Lowers the target's Special Attack by 2 stages. The target is unaffected if both the user and the target are the same gender, or if either is genderless. Pokemon with the Oblivious Ability are immune.*/
 public class Captivate extends PokemonBattleEffect{

/*@Override
 void onTryImmunity(pokemon, source) {
      return pokemon.gender === "M" && source.gender === "F" || pokemon.gender === "F" && source.gender === "M";
    }*/
public Captivate(Pokemon pkmn) {
        super(pkmn);
    }
}