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
/*Restores 1/4 max HP after holder is hit by a supereffective move. Single use.*/
 public class Enigma_Berry extends PokemonBattleEffect{

/*@Override
 void onHit(Pokemon target, Pokemon source, move) {
      if (move && target.getMoveHitData(move).typeMod > 0) {
        if (target.eatItem()) {
          this.heal(target.baseMaxhp / 4);
        }
      }
    }*/
/*@Override
 void onTryEatItem(item, pokemon) {
      if (!this.runEvent("TryHeal", pokemon, null, this.effect, pokemon.baseMaxhp / 4))
        return false;
    }*/
/*@Override
 void onEat() {
    }*/
public Enigma_Berry(Pokemon pkmn) {
        super(pkmn);
    }
}