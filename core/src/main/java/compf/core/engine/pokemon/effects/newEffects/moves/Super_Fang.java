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
/*Deals damage to the target equal to half of its current HP, rounded down, but not less than 1 HP.*/
 public class Super_Fang extends PokemonBattleEffect{

/*@Override
 void damageCallback(pokemon, target) {
      return this.clampIntRange(target.getUndynamaxedHP() / 2, 1);
    }*/
public Super_Fang(Pokemon pkmn) {
        super(pkmn);
    }
}