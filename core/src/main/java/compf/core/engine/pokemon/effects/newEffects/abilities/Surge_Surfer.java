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
 public class Surge_Surfer extends PokemonBattleEffect{

/*@Override
 void onModifySpe(spe) {
      if (this.field.isTerrain("electricterrain")) {
        return this.chainModify(2);
      }
    }*/
public Surge_Surfer(Pokemon pkmn) {
        super(pkmn);
    }
}