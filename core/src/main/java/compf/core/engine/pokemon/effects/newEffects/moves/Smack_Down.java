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
/*This move can hit a target using Bounce, Fly, or Sky Drop, or is under the effect of Sky Drop. If this move hits a target under the effect of Bounce, Fly, Magnet Rise, or Telekinesis, the effect ends. If the target is a Flying type that has not used Roost this turn or a Pokemon with the Levitate Ability, it loses its immunity to Ground-type attacks and the Arena Trap Ability as long as it remains active. During the effect, Magnet Rise fails for the target and Telekinesis fails against the target.*/
 public class Smack_Down extends PokemonBattleEffect{

/*@Override
 void true*/
/*@Override
 void onStart(pokemon) {
        let applies = false;
        if (pokemon.hasType("Flying") || pokemon.hasAbility("levitate"))
          applies = true;
        if (pokemon.hasItem("ironball") || pokemon.volatiles["ingrain"] || this.field.getPseudoWeather("gravity"))
          applies = false;
        if (pokemon.removeVolatile("fly") || pokemon.removeVolatile("bounce")) {
          applies = true;
          this.queue.cancelMove(pokemon);
          pokemon.removeVolatile("twoturnmove");
        }
        if (pokemon.volatiles["magnetrise"]) {
          applies = true;
          delete pokemon.volatiles["magnetrise"];
        }
        if (pokemon.volatiles["telekinesis"]) {
          applies = true;
          delete pokemon.volatiles["telekinesis"];
        }
        if (!applies)
          return false;
        this.add("-start", pokemon, "Smack Down");
      }*/
/*@Override
 void onRestart(pokemon) {
        if (pokemon.removeVolatile("fly") || pokemon.removeVolatile("bounce")) {
          this.queue.cancelMove(pokemon);
          pokemon.removeVolatile("twoturnmove");
          this.add("-start", pokemon, "Smack Down");
        }
      }*/
public Smack_Down(Pokemon pkmn) {
        super(pkmn);
    }
}