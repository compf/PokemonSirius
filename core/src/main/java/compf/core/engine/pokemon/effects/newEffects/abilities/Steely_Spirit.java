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
/*This Pokemon and its allies' Steel-type moves have their power multiplied by 1.5. This affects Doom Desire even if the user is not on the field.*/
 public class Steely_Spirit extends PokemonBattleEffect{

/*@Override
 void onAllyBasePower(basePower, attacker, defender, move) {
      if (move.type === "Steel") {
        this.debug("Steely Spirit boost");
        return this.chainModify(1.5);
      }
    }*/
public Steely_Spirit(Pokemon pkmn) {
        super(pkmn);
    }
}