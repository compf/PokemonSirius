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
/*The user spends two turns locked into this move and then, on the second turn after using this move, the user attacks the last Pokemon that hit it, inflicting double the damage in HP it lost to attacks during the two turns. If the last Pokemon that hit it is no longer active, the user attacks a random opposing Pokemon instead. If the user is prevented from moving during this move's use, the effect ends. This move does not check accuracy and does not ignore type immunity.*/
 public class Bide extends PokemonBattleEffect{

/*@Override
 void beforeMoveCallback(pokemon) {
      if (pokemon.volatiles["bide"])
        return true;
    }*/
/*@Override
 void 3*/
/*@Override
 void bide*/
/*@Override
 void onStart(pokemon) {
        this.effectState.totalDamage = 0;
        this.add("-start", pokemon, "move: Bide");
      }*/
/*@Override
 void -101*/
/*@Override
 void onDamage(DamageInformation damage, Pokemon target, Pokemon source, move) {
        if (!move || move.effectType !== "Move" || !source)
          return;
        this.effectState.totalDamage += damage;
        this.effectState.lastDamageSource = source;
      }*/
/*@Override
 void onBeforeMove(pokemon, Pokemon target, move) {
        if (this.effectState.duration === 1) {
          this.add("-end", pokemon, "move: Bide");
          target = this.effectState.lastDamageSource;
          if (!target || !this.effectState.totalDamage) {
            this.attrLastMove("[still]");
            this.add("-fail", pokemon);
            return false;
          }
          if (!target.isActive) {
            const possibleTarget = this.getRandomTarget(pokemon, this.dex.moves.get("pound"));
            if (!possibleTarget) {
              this.add("-miss", pokemon);
              return false;
            }
            target = possibleTarget;
          }
          const moveData = {
            id: "bide",
            name: "Bide",
            accuracy: true,
            damage: this.effectState.totalDamage * 2,
            category: "Physical",
            priority: 1,
            flags: { contact: 1, protect: 1 },
            effectType: "Move",
            type: "Normal"
          };
          this.actions.tryMoveHit(target, pokemon, moveData);
          pokemon.removeVolatile("bide");
          return false;
        }
        this.add("-activate", pokemon, "move: Bide");
      }*/
/*@Override
 void onMoveAborted(pokemon) {
        pokemon.removeVolatile("bide");
      }*/
/*@Override
 void onEnd(pokemon) {
        this.add("-end", pokemon, "move: Bide", "[silent]");
      }*/
public Bide(Pokemon pkmn) {
        super(pkmn);
    }
}