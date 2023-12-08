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
/*undefined*/
 public class Liquid_Ooze extends PokemonBattleEffect{

/*@Override
 void onSourceTryHeal(DamageInformation damage, Pokemon target, Pokemon source, effect) {
      this.debug("Heal is occurring: " + target + " <- " + source + " :: " + effect.id);
      const canOoze = ["drain", "leechseed", "strengthsap"];
      if (canOoze.includes(effect.id)) {
        this.damage(damage);
        return 0;
      }
    }*/
public Liquid_Ooze(Pokemon pkmn) {
        super(pkmn);
    }
}