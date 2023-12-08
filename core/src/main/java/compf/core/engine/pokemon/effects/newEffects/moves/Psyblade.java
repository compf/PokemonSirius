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
/*If the current terrain is Electric Terrain, this move's power is multiplied by 1.5.*/
 public class Psyblade extends PokemonBattleEffect{

/*@Override
 void onBasePower(basePower, source) {
      if (this.field.isTerrain("electricterrain")) {
        this.debug("psyblade electric terrain boost");
        return this.chainModify(1.5);
      }
    }*/
public Psyblade(Pokemon pkmn) {
        super(pkmn);
    }
}