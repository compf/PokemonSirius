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
/*The user's type changes based on the battle terrain. Normal type on the regular Wi-Fi terrain, Electric type during Electric Terrain, Fairy type during Misty Terrain, Grass type during Grassy Terrain, and Psychic type during Psychic Terrain. Fails if the user's type cannot be changed or if the user is already purely that type.*/
 public class Camouflage extends PokemonBattleEffect{

/*@Override
 void onHit(target) {
      let newType = "Normal";
      if (this.field.isTerrain("electricterrain")) {
        newType = "Electric";
      } else if (this.field.isTerrain("grassyterrain")) {
        newType = "Grass";
      } else if (this.field.isTerrain("mistyterrain")) {
        newType = "Fairy";
      } else if (this.field.isTerrain("psychicterrain")) {
        newType = "Psychic";
      }
      if (target.getTypes().join() === newType || !target.setType(newType))
        return false;
      this.add("-start", Pokemon target, "typechange", newType);
    }*/
public Camouflage(Pokemon pkmn) {
        super(pkmn);
    }
}