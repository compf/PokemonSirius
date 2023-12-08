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
/*Raises the user's evasiveness by 2 stages. Whether or not the user's evasiveness was changed, Body Slam, Dragon Rush, Flying Press, Heat Crash, Heavy Slam, Malicious Moonsault, Steamroller, and Stomp will not check accuracy and have their damage doubled if used against the user while it is active.*/
 public class Minimize extends PokemonBattleEffect{

/*@Override
 void true*/
/*@Override
 void () => null*/
/*@Override
 void onSourceModifyDamage(DamageInformation damage, Pokemon source, Pokemon target, move) {
        const boostedMoves = [
          "stomp",
          "steamroller",
          "bodyslam",
          "flyingpress",
          "dragonrush",
          "heatcrash",
          "heavyslam",
          "maliciousmoonsault"
        ];
        if (boostedMoves.includes(move.id)) {
          return this.chainModify(2);
        }
      }*/
/*@Override
 void onAccuracy(accuracy, Pokemon target, Pokemon source, move) {
        const boostedMoves = [
          "stomp",
          "steamroller",
          "bodyslam",
          "flyingpress",
          "dragonrush",
          "heatcrash",
          "heavyslam",
          "maliciousmoonsault"
        ];
        if (boostedMoves.includes(move.id)) {
          return true;
        }
        return accuracy;
      }*/
public Minimize(Pokemon pkmn) {
        super(pkmn);
    }
}