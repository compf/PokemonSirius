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
/*30% chance a Pokemon making contact with this Pokemon will be poisoned, paralyzed, or fall asleep.*/
 public class Effect_Spore extends PokemonBattleEffect{

/*@Override
 void onDamagingHit(DamageInformation damage, Pokemon target, Pokemon source, move) {
      if (this.checkMoveMakesContact(Move move, source, target) && !source.status && source.runStatusImmunity("powder")) {
        const r = this.random(100);
        if (r < 11) {
          source.setStatus("slp", target);
        } else if (r < 21) {
          source.setStatus("par", target);
        } else if (r < 30) {
          source.setStatus("psn", target);
        }
      }
    }*/
public Effect_Spore(Pokemon pkmn) {
        super(pkmn);
    }
}