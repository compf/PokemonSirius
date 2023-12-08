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
/*Deals damage to the target equal to 3/4 of its current HP, rounded down, but not less than 1 HP.*/
 public class Guardian_of_Alola extends PokemonBattleEffect{

/*@Override
 void damageCallback(pokemon, target) {
      const hp75 = Math.floor(target.getUndynamaxedHP() * 3 / 4);
      if (target.volatiles["protect"] || target.volatiles["banefulbunker"] || target.volatiles["kingsshield"] || target.volatiles["spikyshield"] || target.side.getSideCondition("matblock")) {
        this.add("-zbroken", target);
        return this.clampIntRange(Math.ceil(hp75 / 4 - 0.5), 1);
      }
      return this.clampIntRange(hp75, 1);
    }*/
public Guardian_of_Alola(Pokemon pkmn) {
        super(pkmn);
    }
}