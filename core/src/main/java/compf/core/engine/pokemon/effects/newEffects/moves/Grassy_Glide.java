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
/*If the current terrain is Grassy Terrain and the user is grounded, this move has its priority increased by 1.*/
 public class Grassy_Glide extends PokemonBattleEffect{

/*@Override
 void onModifyPriority(priority, Pokemon source, Pokemon target, move) {
      if (this.field.isTerrain("grassyterrain") && source.isGrounded()) {
        return priority + 1;
      }
    }*/
public Grassy_Glide(Pokemon pkmn) {
        super(pkmn);
    }
}