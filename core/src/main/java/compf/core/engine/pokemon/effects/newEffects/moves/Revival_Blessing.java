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
/*A fainted party member is selected and revived with 1/2 its max HP, rounded down. Fails if there are no fainted party members.*/
 public class Revival_Blessing extends PokemonBattleEffect{

/*@Override
 void onTryHit(source) {
      if (!source.side.pokemon.filter((ally) => ally.fainted).length) {
        return false;
      }
    }*/
/*@Override
 void 1*/
public Revival_Blessing(Pokemon pkmn) {
        super(pkmn);
    }
}