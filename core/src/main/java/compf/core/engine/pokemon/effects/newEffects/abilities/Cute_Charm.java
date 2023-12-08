package compf.core.engine.pokemon.effects.newEffects.abilities;

import compf.core.engine.BattleAction;
    import compf.core.engine.pokemon.PokemonStat;
    import compf.core.engine.pokemon.Pokemon;
    import compf.core.engine.pokemon.effects.EffectParam;
    import compf.core.engine.pokemon.effects.PokemonBattleEffect;
    import compf.core.engine.pokemon.moves.DamageInformation;
    import compf.core.engine.pokemon.moves.Schedule;
    import compf.core.engine.pokemon.moves.Schedule.ScheduleItem;
    import compf.core.etc.services.SharedInformation;
/*There is a 30% chance a Pokemon making contact with this Pokemon will become infatuated if it is of the opposite gender.*/
 public class Cute_Charm extends PokemonBattleEffect{

/*@Override
 void onDamagingHit(DamageInformation damage, Pokemon target, Pokemon source, move) {
      if (this.checkMoveMakesContact(Move move, source, target)) {
        if (this.randomChance(3, 10)) {
          source.addVolatile("attract", this.effectState.target);
        }
      }
    }*/
public Cute_Charm(Pokemon pkmn) {
        super(pkmn);
    }
}