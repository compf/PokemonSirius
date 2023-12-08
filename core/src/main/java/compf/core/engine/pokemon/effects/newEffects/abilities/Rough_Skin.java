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
/*Pokemon making contact with this Pokemon lose 1/8 of their maximum HP, rounded down.*/
 public class Rough_Skin extends PokemonBattleEffect{

/*@Override
 void onDamagingHit(DamageInformation damage, Pokemon target, Pokemon source, move) {
      if (this.checkMoveMakesContact(Move move, source, target, true)) {
        this.damage(source.baseMaxhp / 8, source, target);
      }
    }*/
public Rough_Skin(Pokemon pkmn) {
        super(pkmn);
    }
}