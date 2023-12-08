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
/*For 3 turns, the target cannot avoid any attacks made against it, other than OHKO moves, as long as it remains active. During the effect, the target is immune to Ground-type attacks and the effects of Spikes, Toxic Spikes, Sticky Web, and the Arena Trap Ability as long as it remains active. If the target uses Baton Pass, the replacement will gain the effect. Ingrain, Smack Down, Thousand Arrows, and Iron Ball override this move if the target is under any of their effects. Fails if the target is already under this effect or the effects of Ingrain, Smack Down, or Thousand Arrows. The target is immune to this move on use if its species is Diglett, Dugtrio, Alolan Diglett, Alolan Dugtrio, Sandygast, Palossand, or Gengar while Mega-Evolved. Mega Gengar cannot be under this effect by any means.*/
 public class Telekinesis extends PokemonBattleEffect{

/*@Override
 void onTry(Pokemon source, Pokemon target, move) {
      if (this.field.getPseudoWeather("Gravity")) {
        this.attrLastMove("[still]");
        this.add("cant", source, "move: Gravity", move);
        return null;
      }
    }*/
/*@Override
 void 3*/
/*@Override
 void onStart(target) {
        if (["Diglett", "Dugtrio", "Palossand", "Sandygast"].includes(target.baseSpecies.baseSpecies) || target.baseSpecies.name === "Gengar-Mega") {
          this.add("-immune", target);
          return null;
        }
        if (target.volatiles["smackdown"] || target.volatiles["ingrain"])
          return false;
        this.add("-start", Pokemon target, "Telekinesis");
      }*/
/*@Override
 void -1*/
/*@Override
 void onAccuracy(accuracy, Pokemon target, Pokemon source, move) {
        if (move && !move.ohko)
          return true;
      }*/
/*@Override
 void onImmunity(type) {
        if (type === "Ground")
          return false;
      }*/
/*@Override
 void onUpdate(pokemon) {
        if (pokemon.baseSpecies.name === "Gengar-Mega") {
          delete pokemon.volatiles["telekinesis"];
          this.add("-end", pokemon, "Telekinesis", "[silent]");
        }
      }*/
/*@Override
 void 19*/
/*@Override
 void onEnd(target) {
        this.add("-end", Pokemon target, "Telekinesis");
      }*/
public Telekinesis(Pokemon pkmn) {
        super(pkmn);
    }
}