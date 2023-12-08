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
/*After an attack, holder gains 1/8 of the damage in HP dealt to other Pokemon.*/
 public class Shell_Bell extends PokemonBattleEffect{

/*@Override
 void onAfterMoveSecondarySelf(pokemon, Pokemon target, move) {
      if (move.totalDamage && !pokemon.forceSwitchFlag) {
        this.heal(move.totalDamage / 8, pokemon);
      }
    }*/
public Shell_Bell(Pokemon pkmn) {
        super(pkmn);
    }
}