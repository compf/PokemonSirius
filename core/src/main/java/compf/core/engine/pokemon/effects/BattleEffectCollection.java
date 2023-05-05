package compf.core.engine.pokemon.effects;

import java.util.*;

public class BattleEffectCollection extends ArrayList<BattleEffect> {
    public BattleEffectCollection() {

    }
    public boolean hasEffect(Class<?> effectType){
        for (var eff : this) {
            if (eff.getClass() == effectType) {
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean add(BattleEffect effect) {
        if(effect==null)return false;
        if(hasEffect(effect.getClass()))return false;
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
