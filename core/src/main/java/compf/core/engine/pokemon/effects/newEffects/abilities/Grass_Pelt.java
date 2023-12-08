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
 public class Grass_Pelt extends PokemonBattleEffect{

/*@Override
 void onModifyDef(pokemon) {
      if (this.field.isTerrain("grassyterrain"))
        return this.chainModify(1.5);
    }*/
public Grass_Pelt(Pokemon pkmn) {
        super(pkmn);
    }
}