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
/*Has a 30% chance to confuse the target. If this attack is not successful, the user loses half of its maximum HP, rounded down, as crash damage. Pokemon with the Magic Guard Ability are unaffected by crash damage.*/
 public class Axe_Kick extends PokemonBattleEffect{

/*@Override
 void onMoveFail(Pokemon target, Pokemon source, move) {
      this.DamageInformation damage(source.baseMaxhp / 2, source, source, this.dex.conditions.get("High Jump Kick"));
    }*/
public Axe_Kick(Pokemon pkmn) {
        super(pkmn);
    }
}