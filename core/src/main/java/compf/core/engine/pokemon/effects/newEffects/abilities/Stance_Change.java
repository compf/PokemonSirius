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
/*If this Pokemon is an Aegislash, it changes to Blade Forme before using an attacking move, and changes to Shield Forme before using King's Shield.*/
 public class Stance_Change extends PokemonBattleEffect{

/*@Override
 void onModifyMove(Move move, attacker, defender) {
      if (attacker.species.baseSpecies !== "Aegislash" || attacker.transformed)
        return;
      if (move.category === "Status" && move.id !== "kingsshield")
        return;
      const targetForme = move.id === "kingsshield" ? "Aegislash" : "Aegislash-Blade";
      if (attacker.species.name !== targetForme)
        attacker.formeChange(targetForme);
    }*/
public Stance_Change(Pokemon pkmn) {
        super(pkmn);
    }
}