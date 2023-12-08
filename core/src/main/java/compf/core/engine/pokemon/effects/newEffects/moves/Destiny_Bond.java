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
/*Until the user's next move, if an opposing Pokemon's attack knocks the user out, that Pokemon faints as well, unless the attack was Doom Desire or Future Sight. Fails if the user used this move successfully as its last move, disregarding moves used through the Dancer Ability.*/
 public class Destiny_Bond extends PokemonBattleEffect{

/*@Override
 void onPrepareHit(pokemon) {
      return !pokemon.removeVolatile("destinybond");
    }*/
/*@Override
 void onStart(pokemon) {
        this.add("-singlemove", pokemon, "Destiny Bond");
      }*/
/*@Override
 void onFaint(Pokemon target, Pokemon source, effect) {
        if (!source || !effect || target.isAlly(source))
          return;
        if (effect.effectType === "Move" && !effect.flags["futuremove"]) {
          if (source.volatiles["dynamax"]) {
            this.add("-hint", "Dynamaxed Pok\xE9mon are immune to Destiny Bond.");
            return;
          }
          this.add("-activate", target, "move: Destiny Bond");
          source.faint();
        }
      }*/
/*@Override
 void -1*/
/*@Override
 void onBeforeMove(pokemon, Pokemon target, move) {
        if (move.id === "destinybond")
          return;
        this.debug("removing Destiny Bond before attack");
        pokemon.removeVolatile("destinybond");
      }*/
/*@Override
 void onMoveAborted(pokemon, Pokemon target, move) {
        pokemon.removeVolatile("destinybond");
      }*/
public Destiny_Bond(Pokemon pkmn) {
        super(pkmn);
    }
}