package compf.core.engine.pokemon.effects.newEffects.items;

import compf.core.engine.BattleAction;
    import compf.core.engine.pokemon.PokemonStat;
    import compf.core.engine.pokemon.Pokemon;
    import compf.core.engine.pokemon.effects.EffectParam;
    import compf.core.engine.pokemon.effects.PokemonBattleEffect;
    import compf.core.engine.pokemon.moves.DamageInformation;
    import compf.core.engine.pokemon.moves.Schedule;
    import compf.core.engine.pokemon.moves.Schedule.ScheduleItem;
    import compf.core.etc.services.SharedInformation;
/*Holder is grounded, Speed halved. If Flying type, takes neutral Ground damage.*/
 public class Iron_Ball extends PokemonBattleEffect{

/*@Override
 void onEffectiveness(typeMod, Pokemon target, type, move) {
      if (!target)
        return;
      if (target.volatiles["ingrain"] || target.volatiles["smackdown"] || this.field.getPseudoWeather("gravity"))
        return;
      if (move.type === "Ground" && target.hasType("Flying"))
        return 0;
    }*/
/*@Override
 void onModifySpe(spe) {
      return this.chainModify(0.5);
    }*/
public Iron_Ball(Pokemon pkmn) {
        super(pkmn);
    }
}