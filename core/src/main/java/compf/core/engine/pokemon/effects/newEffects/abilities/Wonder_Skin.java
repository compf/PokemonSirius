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
/*Non-damaging moves that check accuracy have their accuracy changed to 50% when used against this Pokemon. This effect comes before other effects that modify accuracy.*/
 public class Wonder_Skin extends PokemonBattleEffect{

/*@Override
 void onModifyAccuracy(accuracy, Pokemon target, Pokemon source, move) {
      if (move.category === "Status" && typeof accuracy === "number") {
        this.debug("Wonder Skin - setting accuracy to 50");
        return 50;
      }
    }*/
public Wonder_Skin(Pokemon pkmn) {
        super(pkmn);
    }
}