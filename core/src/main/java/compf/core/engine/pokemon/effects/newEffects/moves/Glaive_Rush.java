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
/*If this move is successful, moves targeted at the user deal double damage and do not check accuracy until the user's next turn.*/
 public class Glaive_Rush extends PokemonBattleEffect{

/*@Override
 void true*/
/*@Override
 void onStart(pokemon) {
        this.add("-singlemove", pokemon, "Glaive Rush", "[silent]");
      }*/
/*@Override
 void onAccuracy() {
        return true;
      }*/
/*@Override
 void onSourceModifyDamage() {
        return this.chainModify(2);
      }*/
/*@Override
 void 100*/
/*@Override
 void onBeforeMove(pokemon) {
        this.debug("removing Glaive Rush drawback before attack");
        pokemon.removeVolatile("glaiverush");
      }*/
public Glaive_Rush(Pokemon pkmn) {
        super(pkmn);
    }
}