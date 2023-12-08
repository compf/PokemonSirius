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
/*For 4 turns, the user and its party members have their Speed doubled. Fails if this move is already in effect for the user's side.*/
 public class Tailwind extends PokemonBattleEffect{

/*@Override
 void 4*/
/*@Override
 void durationCallback(Pokemon target, Pokemon source, effect) {
        if (source?.hasAbility("persistent")) {
          this.add("-activate", source, "ability: Persistent", "[move] Tailwind");
          return 6;
        }
        return 4;
      }*/
/*@Override
 void onSideStart(side, source) {
        if (source?.hasAbility("persistent")) {
          this.add("-sidestart", side, "move: Tailwind", "[persistent]");
        } else {
          this.add("-sidestart", side, "move: Tailwind");
        }
      }*/
/*@Override
 void onModifySpe(spe, pokemon) {
        return this.chainModify(2);
      }*/
/*@Override
 void 26*/
/*@Override
 void 5*/
/*@Override
 void onSideEnd(side) {
        this.add("-sideend", side, "move: Tailwind");
      }*/
public Tailwind(Pokemon pkmn) {
        super(pkmn);
    }
}