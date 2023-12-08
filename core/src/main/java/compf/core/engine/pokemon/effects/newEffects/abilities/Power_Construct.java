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
/*If this Pokemon is a Zygarde in its 10% or 50% Forme, it changes to Complete Forme when it has 1/2 or less of its maximum HP at the end of the turn.*/
 public class Power_Construct extends PokemonBattleEffect{

/*@Override
 void onResidual(pokemon) {
      if (pokemon.baseSpecies.baseSpecies !== "Zygarde" || pokemon.transformed || !pokemon.hp)
        return;
      if (pokemon.species.id === "zygardecomplete" || pokemon.hp > pokemon.maxhp / 2)
        return;
      this.add("-activate", pokemon, "ability: Power Construct");
      pokemon.formeChange("Zygarde-Complete", this.effect, true);
      pokemon.baseMaxhp = Math.floor(Math.floor(
        2 * pokemon.species.baseStats["hp"] + pokemon.set.ivs["hp"] + Math.floor(pokemon.set.evs["hp"] / 4) + 100
      ) * pokemon.level / 100 + 10);
      const newMaxHP = pokemon.volatiles["dynamax"] ? 2 * pokemon.baseMaxhp : pokemon.baseMaxhp;
      pokemon.hp = newMaxHP - (pokemon.maxhp - pokemon.hp);
      pokemon.maxhp = newMaxHP;
      this.add("-heal", pokemon, pokemon.getHealth, "[silent]");
    }*/
public Power_Construct(Pokemon pkmn) {
        super(pkmn);
    }
}