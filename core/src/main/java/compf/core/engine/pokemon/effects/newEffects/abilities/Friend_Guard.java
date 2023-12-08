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
 public class Friend_Guard extends PokemonBattleEffect{

/*@Override
 void onAnyModifyDamage(DamageInformation damage, Pokemon source, Pokemon target, move) {
      if (target !== this.effectState.target && target.isAlly(this.effectState.target)) {
        this.debug("Friend Guard weaken");
        return this.chainModify(0.75);
      }
    }*/
public Friend_Guard(Pokemon pkmn) {
        super(pkmn);
    }
}