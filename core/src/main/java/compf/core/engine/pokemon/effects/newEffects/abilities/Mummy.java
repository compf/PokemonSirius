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
/*Pokemon making contact with this Pokemon have their Ability changed to Mummy. Does not affect Pokemon with the As One, Battle Bond, Comatose, Commander, Disguise, Gulp Missile, Hadron Engine, Ice Face, Multitype, Mummy, Orichalcum Pulse, Power Construct, Protosynthesis, Quark Drive, RKS System, Schooling, Shields Down, Stance Change, Zen Mode, or Zero to Hero Abilities.*/
 public class Mummy extends PokemonBattleEffect{

/*@Override
 void onDamagingHit(DamageInformation damage, Pokemon target, Pokemon source, move) {
      const sourceAbility = source.getAbility();
      if (sourceAbility.isPermanent || sourceAbility.id === "mummy") {
        return;
      }
      if (this.checkMoveMakesContact(Move move, source, target, !source.isAlly(target))) {
        const oldAbility = source.setAbility("mummy", target);
        if (oldAbility) {
          this.add("-activate", target, "ability: Mummy", this.dex.abilities.get(oldAbility).name, "[of] " + source);
        }
      }
    }*/
public Mummy(Pokemon pkmn) {
        super(pkmn);
    }
}