package compf.core.engine.pokemon.effects;

import compf.core.engine.pokemon.Pokemon;

public abstract class PokemonBattleEffect extends BattleEffect {
    private Pokemon _pkmn;

    public Pokemon getPokemon() {
        return _pkmn;
    }

    public PokemonBattleEffect(Pokemon pkmn) {
        _pkmn = pkmn;
    }

    public boolean canAttack() {
        return true;
    }

    public boolean canReceiveCommand() {
        return true;
    }
    protected boolean isMeAttacking(EffectParam param){
        return getPokemon()==param.additionalData().getCausingPokemon();
    }
    protected boolean isMeDefending(EffectParam param){
        return getPokemon()==param.additionalData().getAffectedPokemon();
    }
}
