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
/*This move calls another move for use based on the battle terrain. Tri Attack on the regular Wi-Fi terrain, Thunderbolt during Electric Terrain, Moonblast during Misty Terrain, Energy Ball during Grassy Terrain, and Psychic during Psychic Terrain.*/
 public class Nature_Power extends PokemonBattleEffect{

/*@Override
 void onTryHit(Pokemon target, pokemon) {
      let move = "triattack";
      if (this.field.isTerrain("electricterrain")) {
        move = "thunderbolt";
      } else if (this.field.isTerrain("grassyterrain")) {
        move = "energyball";
      } else if (this.field.isTerrain("mistyterrain")) {
        move = "moonblast";
      } else if (this.field.isTerrain("psychicterrain")) {
        move = "psychic";
      }
      this.actions.useMove(Move move, pokemon, target);
      return null;
    }*/
public Nature_Power(Pokemon pkmn) {
        super(pkmn);
    }
}