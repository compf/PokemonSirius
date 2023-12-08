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
/*Power doubles if the user is grounded and a terrain is active, and this move's type changes to match. Electric type during Electric Terrain, Grass type during Grassy Terrain, Fairy type during Misty Terrain, and Psychic type during Psychic Terrain.*/
 public class Terrain_Pulse extends PokemonBattleEffect{

/*@Override
 void onModifyType(Move move, pokemon) {
      if (!pokemon.isGrounded())
        return;
      switch (this.field.terrain) {
        case "electricterrain":
          move.type = "Electric";
          break;
        case "grassyterrain":
          move.type = "Grass";
          break;
        case "mistyterrain":
          move.type = "Fairy";
          break;
        case "psychicterrain":
          move.type = "Psychic";
          break;
      }
    }*/
/*@Override
 void onModifyMove(Move move, pokemon) {
      if (this.field.terrain && pokemon.isGrounded()) {
        move.basePower *= 2;
        this.debug("BP doubled in Terrain");
      }
    }*/
public Terrain_Pulse(Pokemon pkmn) {
        super(pkmn);
    }
}