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
/*While this Pokemon has 1/2 or less of its maximum HP, its Attack and Special Attack are halved.*/
 public class Defeatist extends PokemonBattleEffect{

/*@Override
 void onModifyAtk(atk, pokemon) {
      if (pokemon.hp <= pokemon.maxhp / 2) {
        return this.chainModify(0.5);
      }
    }*/
/*@Override
 void onModifySpA(atk, pokemon) {
      if (pokemon.hp <= pokemon.maxhp / 2) {
        return this.chainModify(0.5);
      }
    }*/
public Defeatist(Pokemon pkmn) {
        super(pkmn);
    }
}