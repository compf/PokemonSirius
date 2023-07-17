package compf.core.engine.pokemon.effects;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(value=RUNTIME)
public @interface EffectName {
    public String[] value();
}
