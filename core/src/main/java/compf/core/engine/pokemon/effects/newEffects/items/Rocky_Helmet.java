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
/*If holder is hit by a contact move, the attacker loses 1/6 of its max HP.*/
 public class Rocky_Helmet extends PokemonBattleEffect{

/*@Override
 void onDamagingHit(DamageInformation damage, Pokemon target, Pokemon source, move) {
      if (this.checkMoveMakesContact(Move move, source, target)) {
        this.damage(source.baseMaxhp / 6, source, target);
      }
    }*/
public Rocky_Helmet(Pokemon pkmn) {
        super(pkmn);
    }
}