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
/*This move combines Flying in its type effectiveness against the target. Damage doubles and no accuracy check is done if the target has used Minimize while active.*/
 public class Flying_Press extends PokemonBattleEffect{

/*@Override
 void onEffectiveness(typeMod, Pokemon target, type, move) {
      return typeMod + this.dex.getEffectiveness("Flying", type);
    }*/
public Flying_Press(Pokemon pkmn) {
        super(pkmn);
    }
}