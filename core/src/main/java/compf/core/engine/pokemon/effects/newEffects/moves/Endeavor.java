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
/*Deals damage to the target equal to (target's current HP - user's current HP). The target is unaffected if its current HP is less than or equal to the user's current HP.*/
 public class Endeavor extends PokemonBattleEffect{

/*@Override
 void damageCallback(pokemon, target) {
      return target.getUndynamaxedHP() - pokemon.hp;
    }*/
/*@Override
 void onTryImmunity(Pokemon target, pokemon) {
      return pokemon.hp < target.hp;
    }*/
public Endeavor(Pokemon pkmn) {
        super(pkmn);
    }
}