package compf.core.engine.pokemon.effects;

import java.util.*;

public class BattleEffectCollection extends ArrayList<BattleEffect> {
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
        if(hasEffect(effect.getClass()))return false;
        notInitialized.add(effect);
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
}
