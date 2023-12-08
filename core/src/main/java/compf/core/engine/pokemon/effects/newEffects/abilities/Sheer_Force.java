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
/*This Pokemon's attacks with secondary effects have their power multiplied by 1.3, but the secondary effects are removed. If a secondary effect was removed, it also removes the user's Life Orb recoil and Shell Bell recovery, and prevents the target's Anger Shell, Berserk, Color Change, Emergency Exit, Pickpocket, Wimp Out, Red Card, Eject Button, Kee Berry, and Maranga Berry from activating.*/
 public class Sheer_Force extends PokemonBattleEffect{

/*@Override
 void onModifyMove(Move move, pokemon) {
      if (move.secondaries) {
        delete move.secondaries;
        delete move.self;
        if (move.id === "clangoroussoulblaze")
          delete move.selfBoost;
        move.hasSheerForce = true;
      }
    }*/
/*@Override
 void onBasePower(basePower, pokemon, Pokemon target, move) {
      if (move.hasSheerForce)
        return this.chainModify([5325, 4096]);
    }*/
public Sheer_Force(Pokemon pkmn) {
        super(pkmn);
    }
}