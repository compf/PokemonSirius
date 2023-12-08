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
/*If this Pokemon is a Morpeko, it changes formes between its Full Belly Mode and Hangry Mode at the end of each turn.*/
 public class Hunger_Switch extends PokemonBattleEffect{

/*@Override
 void onResidual(pokemon) {
      if (pokemon.species.baseSpecies !== "Morpeko" || pokemon.transformed || pokemon.terastallized)
        return;
      const targetForme = pokemon.species.name === "Morpeko" ? "Morpeko-Hangry" : "Morpeko";
      pokemon.formeChange(targetForme);
    }*/
public Hunger_Switch(Pokemon pkmn) {
        super(pkmn);
    }
}