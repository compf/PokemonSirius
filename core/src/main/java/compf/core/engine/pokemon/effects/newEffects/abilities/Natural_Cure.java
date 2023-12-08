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
/*undefined*/
 public class Natural_Cure extends PokemonBattleEffect{

/*@Override
 void onCheckShow(pokemon) {
      if (pokemon.side.active.length === 1)
        return;
      if (pokemon.showCure === true || pokemon.showCure === false)
        return;
      const cureList = [];
      let noCureCount = 0;
      for (const curPoke of pokemon.side.active) {
        if (!curPoke?.status) {
          continue;
        }
        if (curPoke.showCure) {
          continue;
        }
        const species = curPoke.species;
        if (!Object.values(species.abilities).includes("Natural Cure")) {
          continue;
        }
        if (!species.abilities["1"] && !species.abilities["H"]) {
          continue;
        }
        if (curPoke !== pokemon && !this.queue.willSwitch(curPoke)) {
          continue;
        }
        if (curPoke.hasAbility("naturalcure")) {
          cureList.push(curPoke);
        } else {
          noCureCount++;
        }
      }
      if (!cureList.length || !noCureCount) {
        for (const pkmn of cureList) {
          pkmn.showCure = true;
        }
      } else {
        this.add("-message", "(" + cureList.length + " of " + pokemon.side.name + "'s pokemon " + (cureList.length === 1 ? "was" : "were") + " cured by Natural Cure.)");
        for (const pkmn of cureList) {
          pkmn.showCure = false;
        }
      }
    }*/
/*@Override
 void onSwitchOut(pokemon) {
      if (!pokemon.status)
        return;
      if (pokemon.showCure === void 0)
        pokemon.showCure = true;
      if (pokemon.showCure)
        this.add("-curestatus", pokemon, pokemon.status, "[from] ability: Natural Cure");
      pokemon.clearStatus();
      if (!pokemon.showCure)
        pokemon.showCure = void 0;
    }*/
public Natural_Cure(Pokemon pkmn) {
        super(pkmn);
    }
}