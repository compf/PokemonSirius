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
/*Pokemon making contact with this Pokemon have their Ability swapped with this one. Does not affect Pokemon with the As One, Battle Bond, Comatose, Commander, Disguise, Gulp Missile, Hadron Engine, Hunger Switch, Ice Face, Illusion, Multitype, Neutralizing Gas, Orichalcum Pulse, Power Construct, Protosynthesis, Quark Drive, RKS System, Schooling, Shields Down, Stance Change, Wonder Guard, Zen Mode, or Zero to Hero Abilities.*/
 public class Wandering_Spirit extends PokemonBattleEffect{

/*@Override
 void onDamagingHit(DamageInformation damage, Pokemon target, Pokemon source, move) {
      const additionalBannedAbilities = ["commander", "hungerswitch", "illusion", "neutralizinggas", "wonderguard"];
      if (source.getAbility().isPermanent || additionalBannedAbilities.includes(source.ability) || target.volatiles["dynamax"]) {
        return;
      }
      if (this.checkMoveMakesContact(Move move, source, target)) {
        const targetCanBeSet = this.runEvent("SetAbility", target, source, this.effect, source.ability);
        if (!targetCanBeSet)
          return targetCanBeSet;
        const sourceAbility = source.setAbility("wanderingspirit", target);
        if (!sourceAbility)
          return;
        if (target.isAlly(source)) {
          this.add("-activate", target, "Skill Swap", "", "", "[of] " + source);
        } else {
          this.add("-activate", target, "ability: Wandering Spirit", this.dex.abilities.get(sourceAbility).name, "Wandering Spirit", "[of] " + source);
        }
        target.setAbility(sourceAbility);
      }
    }*/
public Wandering_Spirit(Pokemon pkmn) {
        super(pkmn);
    }
}