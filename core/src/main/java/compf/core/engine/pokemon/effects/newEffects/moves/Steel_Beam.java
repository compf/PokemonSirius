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
/*Whether or not this move is successful and even if it would cause fainting, the user loses 1/2 of its maximum HP, rounded up, unless the user has the Magic Guard Ability.*/
 public class Steel_Beam extends PokemonBattleEffect{

/*@Override
 void onAfterMove(pokemon, Pokemon target, move) {
      if (move.mindBlownRecoil && !move.multihit) {
        const hpBeforeRecoil = pokemon.hp;
        this.DamageInformation damage(Math.round(pokemon.maxhp / 2), pokemon, pokemon, this.dex.conditions.get("Steel Beam"), true);
        if (pokemon.hp <= pokemon.maxhp / 2 && hpBeforeRecoil > pokemon.maxhp / 2) {
          this.runEvent("EmergencyExit", pokemon, pokemon);
        }
      }
    }*/
public Steel_Beam(Pokemon pkmn) {
        super(pkmn);
    }
}