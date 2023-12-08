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
/*For 5 turns, the target's held item has no effect. An item's effect of causing forme changes is unaffected, but any other effects from such items are negated. During the effect, Fling and Natural Gift are prevented from being used by the target. Items thrown at the target with Fling will still activate for it. If the target uses Baton Pass, the replacement will remain unable to use items.*/
 public class Embargo extends PokemonBattleEffect{

/*@Override
 void 5*/
/*@Override
 void onStart(pokemon) {
        this.add("-start", pokemon, "Embargo");
        this.singleEvent("End", pokemon.getItem(), pokemon.itemState, pokemon);
      }*/
/*@Override
 void 21*/
/*@Override
 void onEnd(pokemon) {
        this.add("-end", pokemon, "Embargo");
      }*/
public Embargo(Pokemon pkmn) {
        super(pkmn);
    }
}