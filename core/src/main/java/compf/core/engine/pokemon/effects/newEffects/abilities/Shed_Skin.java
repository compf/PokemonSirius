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
/*This Pokemon has a 33% chance to have its non-volatile status condition cured at the end of each turn.*/
 public class Shed_Skin extends PokemonBattleEffect{

/*@Override
 void onResidual(pokemon) {
      if (pokemon.hp && pokemon.status && this.randomChance(33, 100)) {
        this.debug("shed skin");
        this.add("-activate", pokemon, "ability: Shed Skin");
        pokemon.cureStatus();
      }
    }*/
public Shed_Skin(Pokemon pkmn) {
        super(pkmn);
    }
}