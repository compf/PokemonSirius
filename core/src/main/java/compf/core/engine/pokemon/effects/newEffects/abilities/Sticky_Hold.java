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
/*This Pokemon cannot lose its held item due to another Pokemon's Ability or attack, unless the attack knocks out this Pokemon. A Sticky Barb will be transferred to other Pokemon regardless of this Ability.*/
 public class Sticky_Hold extends PokemonBattleEffect{

/*@Override
 void onTakeItem(item, pokemon, source) {
      if (!this.activeMove)
        throw new Error("Battle.activeMove is null");
      if (!pokemon.hp || pokemon.item === "stickybarb")
        return;
      if (source && source !== pokemon || this.activeMove.id === "knockoff") {
        this.add("-activate", pokemon, "ability: Sticky Hold");
        return false;
      }
    }*/
public Sticky_Hold(Pokemon pkmn) {
        super(pkmn);
    }
}