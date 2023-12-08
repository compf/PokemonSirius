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
/*If the terrain is Misty Terrain, raises holder's Sp. Def by 1 stage. Single use.*/
 public class Misty_Seed extends PokemonBattleEffect{

/*@Override
 void onStart(pokemon) {
      if (!pokemon.ignoringItem() && this.field.isTerrain("mistyterrain")) {
        pokemon.useItem();
      }
    }*/
/*@Override
 void onTerrainChange(pokemon) {
      if (this.field.isTerrain("mistyterrain")) {
        pokemon.useItem();
      }
    }*/
public Misty_Seed(Pokemon pkmn) {
        super(pkmn);
    }
}