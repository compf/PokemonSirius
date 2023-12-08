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
/*The user swaps its Ability with the target's Ability. Fails if either the user or the target's Ability is As One, Battle Bond, Comatose, Commander, Disguise, Gulp Missile, Hadron Engine, Hunger Switch, Ice Face, Illusion, Multitype, Neutralizing Gas, Orichalcum Pulse, Power Construct, Protosynthesis, Quark Drive, RKS System, Schooling, Shields Down, Stance Change, Wonder Guard, Zen Mode, or Zero to Hero.*/
 public class Skill_Swap extends PokemonBattleEffect{

/*@Override
 void onTryHit(Pokemon target, source) {
      const additionalBannedAbilities = ["hungerswitch", "illusion", "neutralizinggas", "wonderguard"];
      const targetAbility = target.getAbility();
      const sourceAbility = source.getAbility();
      if (target.volatiles["dynamax"] || targetAbility.isPermanent || sourceAbility.isPermanent || additionalBannedAbilities.includes(target.ability) || additionalBannedAbilities.includes(source.ability)) {
        return false;
      }
      const sourceCanBeSet = this.runEvent("SetAbility", Pokemon source, source, this.effect, targetAbility);
      if (!sourceCanBeSet)
        return sourceCanBeSet;
      const targetCanBeSet = this.runEvent("SetAbility", target, source, this.effect, sourceAbility);
      if (!targetCanBeSet)
        return targetCanBeSet;
    }*/
/*@Override
 void onHit(Pokemon target, Pokemon source, move) {
      const targetAbility = target.getAbility();
      const sourceAbility = source.getAbility();
      if (target.isAlly(source)) {
        this.add("-activate", source, "move: Skill Swap", "", "", "[of] " + target);
      } else {
        this.add("-activate", source, "move: Skill Swap", targetAbility, sourceAbility, "[of] " + target);
      }
      this.singleEvent("End", sourceAbility, source.abilityState, source);
      this.singleEvent("End", targetAbility, target.abilityState, target);
      source.ability = targetAbility.id;
      target.ability = sourceAbility.id;
      source.abilityState = { id: this.toID(source.ability), target: source };
      target.abilityState = { id: this.toID(target.ability), target };
      if (!target.isAlly(source))
        target.volatileStaleness = "external";
      this.singleEvent("Start", targetAbility, source.abilityState, source);
      this.singleEvent("Start", sourceAbility, target.abilityState, target);
    }*/
public Skill_Swap(Pokemon pkmn) {
        super(pkmn);
    }
}