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
/*Has a 100% chance to raise the user's Speed by 1 stage. If the user is a Morpeko in Full Belly Mode, this move is Electric type. If the user is a Morpeko in Hangry Mode, this move is Dark type. This move cannot be used successfully unless the user's current form, while considering Transform, is Full Belly or Hangry Mode Morpeko.*/
 public class Aura_Wheel extends PokemonBattleEffect{

/*@Override
 void onTry(source) {
      if (source.species.baseSpecies === "Morpeko") {
        return;
      }
      this.attrLastMove("[still]");
      this.add("-fail", Pokemon source, "move: Aura Wheel");
      this.hint("Only a Pokemon whose form is Morpeko or Morpeko-Hangry can use this move.");
      return null;
    }*/
/*@Override
 void onModifyType(Move move, pokemon) {
      if (pokemon.species.name === "Morpeko-Hangry") {
        move.type = "Dark";
      } else {
        move.type = "Electric";
      }
    }*/
public Aura_Wheel(Pokemon pkmn) {
        super(pkmn);
    }
}