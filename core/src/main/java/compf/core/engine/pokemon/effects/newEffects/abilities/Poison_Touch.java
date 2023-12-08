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
/*This Pokemon's contact moves have a 30% chance of poisoning. This effect comes after a move's inherent secondary effect chance.*/
 public class Poison_Touch extends PokemonBattleEffect{

/*@Override
 void onSourceDamagingHit(DamageInformation damage, Pokemon target, Pokemon source, move) {
      if (target.hasAbility("shielddust") || target.hasItem("covertcloak"))
        return;
      if (this.checkMoveMakesContact(Move move, target, source)) {
        if (this.randomChance(3, 10)) {
          target.trySetStatus("psn", source);
        }
      }
    }*/
public Poison_Touch(Pokemon pkmn) {
        super(pkmn);
    }
}