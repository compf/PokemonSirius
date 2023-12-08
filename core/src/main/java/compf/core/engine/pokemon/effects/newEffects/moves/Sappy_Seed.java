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
/*This move summons Leech Seed on the foe.*/
 public class Sappy_Seed extends PokemonBattleEffect{

/*@Override
 void onHit(Pokemon target, source) {
      if (target.hasType("Grass"))
        return null;
      target.addVolatile("leechseed", source);
    }*/
public Sappy_Seed(Pokemon pkmn) {
        super(pkmn);
    }
}