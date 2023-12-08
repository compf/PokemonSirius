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
/*If holder's species can evolve, its Defense and Sp. Def are 1.5x.*/
 public class Eviolite extends PokemonBattleEffect{

/*@Override
 void onModifyDef(def, pokemon) {
      if (pokemon.baseSpecies.nfe || pokemon.baseSpecies.id === "dipplin") {
        return this.chainModify(1.5);
      }
    }*/
/*@Override
 void onModifySpD(spd, pokemon) {
      if (pokemon.baseSpecies.nfe || pokemon.baseSpecies.id === "dipplin") {
        return this.chainModify(1.5);
      }
    }*/
public Eviolite(Pokemon pkmn) {
        super(pkmn);
    }
}