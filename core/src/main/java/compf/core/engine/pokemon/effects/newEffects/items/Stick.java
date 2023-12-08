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
/*If held by a Farfetch’d, its critical hit ratio is raised by 2 stages.*/
 public class Stick extends PokemonBattleEffect{

/*@Override
 void onModifyCritRatio(critRatio, user) {
      if (this.toID(user.baseSpecies.baseSpecies) === "farfetchd") {
        return critRatio + 2;
      }
    }*/
public Stick(Pokemon pkmn) {
        super(pkmn);
    }
}