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
/*If this Pokemon is knocked out with a contact move, that move's user loses 1/4 of its maximum HP, rounded down. If any active Pokemon has the Damp Ability, this effect is prevented.*/
 public class Aftermath extends PokemonBattleEffect{

/*@Override
 void onDamagingHit(DamageInformation damage, Pokemon target, Pokemon source, move) {
      if (!target.hp && this.checkMoveMakesContact(Move move, source, target, true)) {
        this.damage(source.baseMaxhp / 4, source, target);
      }
    }*/
public Aftermath(Pokemon pkmn) {
        super(pkmn);
    }
}