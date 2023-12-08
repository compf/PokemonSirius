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
/*If this Pokemon has a non-volatile status condition, its Attack is multiplied by 1.5. This Pokemon's physical attacks ignore the burn effect of halving damage.*/
 public class Guts extends PokemonBattleEffect{

/*@Override
 void onModifyAtk(atk, pokemon) {
      if (pokemon.status) {
        return this.chainModify(1.5);
      }
    }*/
public Guts(Pokemon pkmn) {
        super(pkmn);
    }
}