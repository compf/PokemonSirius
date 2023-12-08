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
/*Making contact with this Pokemon starts the Perish Song effect for it and the attacker. This effect does not happen for this Pokemon if the attacker already has a perish count.*/
 public class Perish_Body extends PokemonBattleEffect{

/*@Override
 void onDamagingHit(DamageInformation damage, Pokemon target, Pokemon source, move) {
      if (!this.checkMoveMakesContact(Move move, source, target))
        return;
      let announced = false;
      for (const pokemon of [target, source]) {
        if (pokemon.volatiles["perishsong"])
          continue;
        if (!announced) {
          this.add("-ability", target, "Perish Body");
          announced = true;
        }
        pokemon.addVolatile("perishsong");
      }
    }*/
public Perish_Body(Pokemon pkmn) {
        super(pkmn);
    }
}