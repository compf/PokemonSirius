package compf.core.engine.pokemon.effects;

public abstract class BattleEffectFactory {
    public abstract  BattleEffect create(String name);


    public static class AbilityEffectFactory extends  BattleEffectFactory{

        @Override
        public BattleEffect create(String name) {
            return new StubEffect();
        }
    }
    public static class ItemEffectFactory extends  BattleEffectFactory{

        @Override
        public BattleEffect create(String name) {
            return new StubEffect();
        }
    }
}
