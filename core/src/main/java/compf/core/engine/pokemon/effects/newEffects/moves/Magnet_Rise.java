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
/*For 5 turns, the user is immune to Ground-type attacks and the effects of Spikes, Toxic Spikes, Sticky Web, and the Arena Trap Ability as long as it remains active. If the user uses Baton Pass, the replacement will gain the effect. Ingrain, Smack Down, Thousand Arrows, and Iron Ball override this move if the user is under any of their effects. Fails if the user is already under this effect or the effects of Ingrain, Smack Down, or Thousand Arrows.*/
 public class Magnet_Rise extends PokemonBattleEffect{

/*@Override
 void onTry(Pokemon source, Pokemon target, move) {
      if (target.volatiles["smackdown"] || target.volatiles["ingrain"])
        return false;
      if (this.field.getPseudoWeather("Gravity")) {
        this.add("cant", source, "move: Gravity", move);
        return null;
      }
    }*/
/*@Override
 void 5*/
/*@Override
 void onStart(target) {
        this.add("-start", Pokemon target, "Magnet Rise");
      }*/
/*@Override
 void onImmunity(type) {
        if (type === "Ground")
          return false;
      }*/
/*@Override
 void 18*/
/*@Override
 void onEnd(target) {
        this.add("-end", Pokemon target, "Magnet Rise");
      }*/
public Magnet_Rise(Pokemon pkmn) {
        super(pkmn);
    }
}