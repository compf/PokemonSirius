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
/*If the terrain is Grassy Terrain, raises holder's Defense by 1 stage. Single use.*/
 public class Grassy_Seed extends PokemonBattleEffect{

/*@Override
 void onStart(pokemon) {
      if (!pokemon.ignoringItem() && this.field.isTerrain("grassyterrain")) {
        pokemon.useItem();
      }
    }*/
/*@Override
 void onTerrainChange(pokemon) {
      if (this.field.isTerrain("grassyterrain")) {
        pokemon.useItem();
      }
    }*/
public Grassy_Seed(Pokemon pkmn) {
        super(pkmn);
    }
}