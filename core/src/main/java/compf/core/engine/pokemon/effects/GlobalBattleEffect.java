package compf.core.engine.pokemon.effects;

import compf.core.engine.PokemonBattle;

public abstract class GlobalBattleEffect extends BattleEffect {
    private PokemonBattle _battle;
    public PokemonBattle getBattle(){
        return _battle;
    }
    public GlobalBattleEffect(PokemonBattle battle){
        _battle=battle;
    }
}
