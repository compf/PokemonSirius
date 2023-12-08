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
/*If an ally Tatsugiri has activated its Commander Ability, this move raises the user's Attack by 1 stage if the Tatsugiri is Curly Form, Defense by 1 stage if Droopy Form, or Speed by 1 stage if Stretchy Form. The effect happens whether or not this move is successful, and even if the Tatsugiri that activated the effect has since fainted.*/
 public class Order_Up extends PokemonBattleEffect{

/*@Override
 void onAfterMoveSecondarySelf(pokemon, Pokemon target, move) {
      if (!pokemon.volatiles["commanded"])
        return;
      const tatsugiri = pokemon.volatiles["commanded"].source;
      if (tatsugiri.baseSpecies.baseSpecies !== "Tatsugiri")
        return;
      switch (tatsugiri.baseSpecies.forme) {
        case "Droopy":
          this.boost({ def: 1 }, pokemon, pokemon);
          break;
        case "Stretchy":
          this.boost({ spe: 1 }, pokemon, pokemon);
          break;
        default:
          this.boost({ atk: 1 }, pokemon, pokemon);
          break;
      }
    }*/
public Order_Up(Pokemon pkmn) {
        super(pkmn);
    }
}