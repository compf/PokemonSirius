package compf.core.engine.pokemon.effects;

import java.util.*;

public class BattleEffectCollection extends ArrayList<BattleEffect> {
    public BattleEffectCollection(){

    }
    @Override
    public boolean add(BattleEffect effect){
        for(var eff:this){
            if(eff.getClass()==effect.getClass()){
                return false;
            }
        }
        return super.add(effect);

    }
    public void remove(Class<?>  type){
        for(var eff:this){
            if(eff.getClass()==type){
                this.remove(eff);
                return;
            }

        }
    }

    public BattleEffect removeFirst() {
        return this.remove(0);
    }
}
