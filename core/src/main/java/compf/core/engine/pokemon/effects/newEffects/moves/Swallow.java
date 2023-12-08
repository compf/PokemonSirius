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
/*The user restores its HP based on its Stockpile count. Restores 1/4 of its maximum HP if it's 1, 1/2 of its maximum HP if it's 2, both rounded half down, and all of its HP if it's 3. Fails if the user's Stockpile count is 0. The user's Defense and Special Defense decrease by as many stages as Stockpile had increased them, and the user's Stockpile count resets to 0.*/
 public class Swallow extends PokemonBattleEffect{

/*@Override
 void onTry(source) {
      return !!source.volatiles["stockpile"];
    }*/
/*@Override
 void onHit(pokemon) {
      const healAmount = [0.25, 0.5, 1];
      const success = !!this.heal(this.modify(pokemon.maxhp, healAmount[pokemon.volatiles["stockpile"].layers - 1]));
      if (!success)
        this.add("-fail", pokemon, "heal");
      pokemon.removeVolatile("stockpile");
      return success || this.NOT_FAIL;
    }*/
public Swallow(Pokemon pkmn) {
        super(pkmn);
    }
}