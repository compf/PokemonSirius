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
/*Has a 10% chance to freeze the target. This move's type effectiveness against Water is changed to be super effective no matter what this move's type is.*/
 public class Freeze_Dry extends PokemonBattleEffect{

/*@Override
 void onEffectiveness(typeMod, Pokemon target, type) {
      if (type === "Water")
        return 1;
    }*/
public Freeze_Dry(Pokemon pkmn) {
        super(pkmn);
    }
}