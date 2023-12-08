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
/*The user is replaced with another Pokemon in its party. The selected Pokemon has the user's stat stage changes, confusion, and certain move effects transferred to it.*/
 public class Baton_Pass extends PokemonBattleEffect{

/*@Override
 void onHit(target) {
      if (!this.canSwitch(target.side) || target.volatiles["commanded"]) {
        this.attrLastMove("[still]");
        this.add("-fail", target);
        return this.NOT_FAIL;
      }
    }*/
public Baton_Pass(Pokemon pkmn) {
        super(pkmn);
    }
}