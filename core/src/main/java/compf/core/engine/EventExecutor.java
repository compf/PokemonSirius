package compf.core.engine;

import compf.core.engine.pokemon.effects.EffectParam;
import compf.core.engine.pokemon.effects.EffectTime;

public interface EventExecutor {
    public void executeEffects(EffectTime time, EffectParam param);
    boolean hasEffect(Class<?> hasEffect);
}
