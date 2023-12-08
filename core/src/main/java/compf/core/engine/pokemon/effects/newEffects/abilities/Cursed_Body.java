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
/*If this Pokemon is hit by an attack, there is a 30% chance that move gets disabled unless one of the attacker's moves is already disabled.*/
 public class Cursed_Body extends PokemonBattleEffect{

/*@Override
 void onDamagingHit(DamageInformation damage, Pokemon target, Pokemon source, move) {
      if (source.volatiles["disable"])
        return;
      if (!move.isMax && !move.flags["futuremove"] && move.id !== "struggle") {
        if (this.randomChance(3, 10)) {
          source.addVolatile("disable", this.effectState.target);
        }
      }
    }*/
public Cursed_Body(Pokemon pkmn) {
        super(pkmn);
    }
}