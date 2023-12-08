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
/*Ends the effects of Electric Terrain, Grassy Terrain, Misty Terrain, and Psychic Terrain.*/
 public class Ice_Spinner extends PokemonBattleEffect{

/*@Override
 void onAfterHit(Pokemon target, source) {
      if (source.hp) {
        this.field.clearTerrain();
      }
    }*/
/*@Override
 void onAfterSubDamage(DamageInformation damage, Pokemon target, source) {
      if (source.hp) {
        this.field.clearTerrain();
      }
    }*/
public Ice_Spinner(Pokemon pkmn) {
        super(pkmn);
    }
}