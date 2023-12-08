package compf.core.engine.pokemon.effects.newEffects.items;

import compf.core.engine.BattleAction;
    import compf.core.engine.pokemon.PokemonStat;
    import compf.core.engine.pokemon.Pokemon;
    import compf.core.engine.pokemon.effects.EffectParam;
    import compf.core.engine.pokemon.effects.PokemonBattleEffect;
    import compf.core.engine.pokemon.moves.DamageInformation;
    import compf.core.engine.pokemon.moves.Schedule;
    import compf.core.engine.pokemon.moves.Schedule.ScheduleItem;
    import compf.core.etc.services.SharedInformation;
/*If held by a Clamperl, its Sp. Atk is doubled. Evolves Clamperl into Huntail when traded.*/
 public class Deep_Sea_Tooth extends PokemonBattleEffect{

/*@Override
 void onModifySpA(spa, pokemon) {
      if (pokemon.baseSpecies.name === "Clamperl") {
        return this.chainModify(2);
      }
    }*/
public Deep_Sea_Tooth(Pokemon pkmn) {
        super(pkmn);
    }
}