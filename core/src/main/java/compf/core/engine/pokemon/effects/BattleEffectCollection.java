package compf.core.engine.pokemon.effects;

import java.util.*;
import java.util.stream.Stream;

import compf.core.engine.pokemon.Pokemon;
import compf.core.etc.Box;

public class BattleEffectCollection extends ArrayList<BattleEffect> implements BattleEffectService {
    public BattleEffectCollection() {

    }
    ArrayDeque<BattleEffect> notInitialized=new ArrayDeque<>();
    public boolean hasEffect(Class<?> effectType){
        for (var eff : this) {
            if (eff.getClass() == effectType) {
                return true;
            }
        }
        return false;
    }
    public boolean hasEffect(BattleEffect effect){
        for (var eff : this) {
            if (eff == effect) {
                return true;
            }
            else if(eff.getClass()==effect.getClass()){
               if(eff instanceof PokemonBattleEffect pkmnEff){
                if( pkmnEff.getPokemon()==((PokemonBattleEffect)effect).getPokemon()){
                    return true;
                }
               }
               
            }
        }
        return false;
    }
    public boolean hasEffect(Pokemon filterPokemon,Class<?> effectType){
        for (var eff : this) {
            if ( eff instanceof PokemonBattleEffect pkmEff && pkmEff.getPokemon()==filterPokemon && effectType ==eff.getClass()) {
                return true;
            }
        }
        return false;
    }
    public void initializeAllNotInitialized(EffectParam param){
        while(notInitialized.size()>0){
            var item=notInitialized.remove();
            item.initOrSwitchedIn(param);
            item.init(param);
        }
    }
    @Override
    public boolean add(BattleEffect effect) {
        if(effect==null)return false;
        if(hasEffect(effect))return false;
        notInitialized.add(effect);
        var param=new EffectParam(null,null,null,null,new EffectParam.AdditionalBattleEffectAddedData(effect));
        this.battleEffectAdded(param);
        return super.add(effect);

    }

    public void remove(Class<?> type) {
        for (var eff : this) {
            if (eff.getClass() == type) {
                this.remove(eff);
                return;
            }

        }
    }

    public BattleEffect removeFirst() {
        return this.remove(0);
    }
    @Override
    public void init(EffectParam param) {
        this.notInitialized.clear();
        for(var eff:this){
            eff.init(param);
        }
     
    }
    @Override
    public void roundBeginning(EffectParam param) {
        for(var eff:this){
            eff.roundBeginning(param);
        }
    }
    @Override
    public void pokemonSwitchedOut(EffectParam param) {
        for(var eff:this){
            eff.pokemonSwitchedOut(param);
        }
    }
    @Override
    public void pokemonSwitchedIn(EffectParam param) {
        for(var eff:this){
            eff.pokemonSwitchedIn(param);
        }
    }
    @Override
    public void attack(EffectParam param) {
        for(var eff:this){
            eff.attack(param);
        }
    }
    @Override
    public void defend(EffectParam param) {
        for(var eff:this){
            eff.defend(param);
        }
    }
    @Override
    public void roundEnding(EffectParam param) {
        for(var eff:this){
            eff.roundEnding(param);
        }
    }
    @Override
    public void delayedAttack(EffectParam param) {
        for(var eff:this){
            eff.delayedAttack(param);
        }
    }
    @Override
    public void pokemonDefeated(EffectParam param) {
        for(var eff:this){
            eff.pokemonDefeated(param);
        }
    }
    @Override
    public void statsModified(EffectParam param) {
        for(var eff:this){
            eff.statsModified(param);
        }
    }
    @Override
    public void initOrSwitchedIn(EffectParam param) {
        for(var eff:this){
            eff.initOrSwitchedIn(param);
        }
    }
    @Override
    public void modifyBasePower(EffectParam param, Box<Double> basePower) {
        for(var eff:this){
            eff.modifyBasePower(param,basePower);
        }
    }
    @Override
    public void battleEffectAdded(EffectParam param) {
        for(var eff:this){
            eff.battleEffectAdded(param);
        }
    }
    @Override
	public void indirectDamageReceived(EffectParam param){
        for(var eff:this){
            eff.indirectDamageReceived(param);
        }
    }
    public Stream<PokemonBattleEffect> filterOnPokemon(Pokemon pkmn) {
       return this.stream().filter((x)->x instanceof PokemonBattleEffect eff && eff.getPokemon()==pkmn).map((x)->(PokemonBattleEffect)x);
    }

}
