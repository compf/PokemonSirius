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
/*Causes damage to the target equal to 1/8 of its maximum HP (1/4 if the target is Steel or Water type), rounded down, at the end of each turn during effect. This effect ends when the target is no longer active.*/
 public class Salt_Cure extends PokemonBattleEffect{

/*@Override
 void true*/
/*@Override
 void onStart(pokemon) {
        this.add("-start", pokemon, "Salt Cure");
      }*/
/*@Override
 void 13*/
/*@Override
 void onResidual(pokemon) {
        this.DamageInformation damage(pokemon.baseMaxhp / (pokemon.hasType(["Water", "Steel"]) ? 4 : 8));
      }*/
/*@Override
 void onEnd(pokemon) {
        this.add("-end", pokemon, "Salt Cure");
      }*/
public Salt_Cure(Pokemon pkmn) {
        super(pkmn);
    }
}