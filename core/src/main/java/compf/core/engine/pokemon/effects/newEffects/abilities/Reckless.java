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
/*This Pokemon's attacks with recoil or crash damage have their power multiplied by 1.2. Does not affect Struggle.*/
 public class Reckless extends PokemonBattleEffect{

/*@Override
 void onBasePower(basePower, attacker, defender, move) {
      if (move.recoil || move.hasCrashDamage) {
        this.debug("Reckless boost");
        return this.chainModify([4915, 4096]);
      }
    }*/
public Reckless(Pokemon pkmn) {
        super(pkmn);
    }
}