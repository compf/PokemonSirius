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
/*If this Pokemon is a Tatsugiri and a Dondozo is an active ally, this Pokemon goes into the Dondozo's mouth. The Dondozo has its Attack, Special Attack, Speed, Defense, and Special Defense raised by 2 stages. During the effect, the Dondozo cannot be switched out, this Pokemon cannot select an action, and attacks targeted at this Pokemon will be avoided but it will still take indirect damage. If this Pokemon faints during the effect, a Pokemon can be switched in as a replacement but the Dondozo remains unable to be switched out. If the Dondozo faints during the effect, this Pokemon regains the ability to select an action.*/
 public class Commander extends PokemonBattleEffect{

/*@Override
 void onUpdate(pokemon) {
      if (this.gameType !== "doubles")
        return;
      const ally = pokemon.allies()[0];
      if (!ally || pokemon.transformed || pokemon.baseSpecies.baseSpecies !== "Tatsugiri" || ally.baseSpecies.baseSpecies !== "Dondozo") {
        if (pokemon.getVolatile("commanding"))
          pokemon.removeVolatile("commanding");
        return;
      }
      if (!pokemon.getVolatile("commanding")) {
        if (ally.getVolatile("commanded"))
          return;
        this.queue.cancelAction(pokemon);
        this.add("-activate", pokemon, "ability: Commander", "[of] " + ally);
        pokemon.addVolatile("commanding");
        ally.addVolatile("commanded", pokemon);
      } else {
        if (!ally.fainted)
          return;
        pokemon.removeVolatile("commanding");
      }
    }*/
public Commander(Pokemon pkmn) {
        super(pkmn);
    }
}