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
/*This Pokemon's allies have the power of their moves multiplied by 1.3. This affects Doom Desire and Future Sight, even if the user is not on the field.*/
 public class Power_Spot extends PokemonBattleEffect{

/*@Override
 void onAllyBasePower(basePower, attacker, defender, move) {
      if (attacker !== this.effectState.target) {
        this.debug("Power Spot boost");
        return this.chainModify([5325, 4096]);
      }
    }*/
public Power_Spot(Pokemon pkmn) {
        super(pkmn);
    }
}