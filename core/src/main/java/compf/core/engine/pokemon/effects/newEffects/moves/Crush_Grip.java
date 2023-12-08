package compf.core.engine.pokemon.effects.newEffects.moves;

import compf.core.engine.BattleAction;
    import compf.core.engine.pokemon.PokemonStat;
    import compf.core.engine.pokemon.Pokemon;
    import compf.core.engine.pokemon.effects.EffectParam;
    import compf.core.engine.pokemon.effects.PokemonBattleEffect;
    import compf.core.engine.pokemon.moves.DamageInformation;
    import compf.core.engine.pokemon.moves.Schedule;
    import compf.core.engine.pokemon.moves.Schedule.ScheduleItem;
    import compf.core.etc.services.SharedInformation;
/*Power is equal to 120 * (target's current HP / target's maximum HP), rounded half down, but not less than 1.*/
 public class Crush_Grip extends PokemonBattleEffect{

/*@Override
 void basePowerCallback(pokemon, target) {
      const hp = target.hp;
      const maxHP = target.maxhp;
      const bp = Math.floor(Math.floor((120 * (100 * Math.floor(hp * 4096 / maxHP)) + 2048 - 1) / 4096) / 100) || 1;
      this.debug("BP for " + hp + "/" + maxHP + " HP: " + bp);
      return bp;
    }*/
public Crush_Grip(Pokemon pkmn) {
        super(pkmn);
    }
}