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
/*If the user is hit by a contact move this turn before it can execute this move, the attacker is burned.*/
 public class Beak_Blast extends PokemonBattleEffect{

/*@Override
 void priorityChargeCallback(pokemon) {
      pokemon.addVolatile("beakblast");
    }*/
/*@Override
 void 1*/
/*@Override
 void onStart(pokemon) {
        this.add("-singleturn", pokemon, "move: Beak Blast");
      }*/
/*@Override
 void onHit(Pokemon target, Pokemon source, move) {
        if (this.checkMoveMakesContact(Move move, source, target)) {
          source.trySetStatus("brn", target);
        }
      }*/
/*@Override
 void onAfterMove(pokemon) {
      pokemon.removeVolatile("beakblast");
    }*/
public Beak_Blast(Pokemon pkmn) {
        super(pkmn);
    }
}