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
 public class Sniper extends PokemonBattleEffect{

/*@Override
 void onModifyDamage(DamageInformation damage, Pokemon source, Pokemon target, move) {
      if (target.getMoveHitData(move).crit) {
        this.debug("Sniper boost");
        return this.chainModify(1.5);
      }
    }*/
public Sniper(Pokemon pkmn) {
        super(pkmn);
    }
}