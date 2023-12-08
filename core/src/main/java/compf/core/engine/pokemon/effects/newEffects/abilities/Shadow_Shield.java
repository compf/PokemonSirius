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
 public class Shadow_Shield extends PokemonBattleEffect{

/*@Override
 void onSourceModifyDamage(DamageInformation damage, Pokemon source, Pokemon target, move) {
      if (target.hp >= target.maxhp) {
        this.debug("Shadow Shield weaken");
        return this.chainModify(0.5);
      }
    }*/
public Shadow_Shield(Pokemon pkmn) {
        super(pkmn);
    }
}