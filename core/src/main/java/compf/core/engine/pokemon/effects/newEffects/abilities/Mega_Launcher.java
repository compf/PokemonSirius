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
/*This Pokemon's pulse moves have their power multiplied by 1.5. Heal Pulse restores 3/4 of a target's maximum HP, rounded half down.*/
 public class Mega_Launcher extends PokemonBattleEffect{

/*@Override
 void onBasePower(basePower, attacker, defender, move) {
      if (move.flags["pulse"]) {
        return this.chainModify(1.5);
      }
    }*/
public Mega_Launcher(Pokemon pkmn) {
        super(pkmn);
    }
}