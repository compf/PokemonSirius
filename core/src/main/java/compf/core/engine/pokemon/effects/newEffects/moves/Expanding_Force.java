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
/*If the current terrain is Psychic Terrain and the user is grounded, this move hits all opposing Pokemon and has its power multiplied by 1.5.*/
 public class Expanding_Force extends PokemonBattleEffect{

/*@Override
 void onBasePower(basePower, source) {
      if (this.field.isTerrain("psychicterrain") && source.isGrounded()) {
        this.debug("terrain buff");
        return this.chainModify(1.5);
      }
    }*/
/*@Override
 void onModifyMove(Move move, Pokemon source, target) {
      if (this.field.isTerrain("psychicterrain") && source.isGrounded()) {
        move.target = "allAdjacentFoes";
      }
    }*/
public Expanding_Force(Pokemon pkmn) {
        super(pkmn);
    }
}