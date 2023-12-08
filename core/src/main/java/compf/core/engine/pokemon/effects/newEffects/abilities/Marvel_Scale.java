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
 public class Marvel_Scale extends PokemonBattleEffect{

/*@Override
 void onModifyDef(def, pokemon) {
      if (pokemon.status) {
        return this.chainModify(1.5);
      }
    }*/
public Marvel_Scale(Pokemon pkmn) {
        super(pkmn);
    }
}