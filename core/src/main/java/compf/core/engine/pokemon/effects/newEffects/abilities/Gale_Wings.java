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
 public class Gale_Wings extends PokemonBattleEffect{

/*@Override
 void onModifyPriority(priority, pokemon, Pokemon target, move) {
      if (move?.type === "Flying" && pokemon.hp === pokemon.maxhp)
        return priority + 1;
    }*/
public Gale_Wings(Pokemon pkmn) {
        super(pkmn);
    }
}