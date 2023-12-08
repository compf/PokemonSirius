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
/*This Pokemon's sound-based moves have their power multiplied by 1.3. This Pokemon takes halved damage from sound-based moves.*/
 public class Punk_Rock extends PokemonBattleEffect{

/*@Override
 void onBasePower(basePower, attacker, defender, move) {
      if (move.flags["sound"]) {
        this.debug("Punk Rock boost");
        return this.chainModify([5325, 4096]);
      }
    }*/
/*@Override
 void onSourceModifyDamage(DamageInformation damage, Pokemon source, Pokemon target, move) {
      if (move.flags["sound"]) {
        this.debug("Punk Rock weaken");
        return this.chainModify(0.5);
      }
    }*/
public Punk_Rock(Pokemon pkmn) {
        super(pkmn);
    }
}