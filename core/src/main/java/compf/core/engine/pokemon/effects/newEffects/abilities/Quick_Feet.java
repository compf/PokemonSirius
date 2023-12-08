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
/*If this Pokemon has a non-volatile status condition, its Speed is multiplied by 1.5. This Pokemon ignores the paralysis effect of halving Speed.*/
 public class Quick_Feet extends PokemonBattleEffect{

/*@Override
 void onModifySpe(spe, pokemon) {
      if (pokemon.status) {
        return this.chainModify(1.5);
      }
    }*/
public Quick_Feet(Pokemon pkmn) {
        super(pkmn);
    }
}