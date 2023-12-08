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
/*This Pokemon ignores other Pokemon's Attack, Special Attack, and accuracy stat stages when taking damage, and ignores other Pokemon's Defense, Special Defense, and evasiveness stat stages when dealing damage.*/
 public class Unaware extends PokemonBattleEffect{

/*@Override
 void onAnyModifyBoost(boosts, pokemon) {
      const unawareUser = this.effectState.target;
      if (unawareUser === pokemon)
        return;
      if (unawareUser === this.activePokemon && pokemon === this.activeTarget) {
        boosts["def"] = 0;
        boosts["spd"] = 0;
        boosts["evasion"] = 0;
      }
      if (pokemon === this.activePokemon && unawareUser === this.activeTarget) {
        boosts["atk"] = 0;
        boosts["def"] = 0;
        boosts["spa"] = 0;
        boosts["accuracy"] = 0;
      }
    }*/
public Unaware(Pokemon pkmn) {
        super(pkmn);
    }
}