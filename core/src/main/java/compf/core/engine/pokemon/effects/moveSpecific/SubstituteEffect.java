package compf.core.engine.pokemon.effects.moveSpecific;

import compf.core.engine.pokemon.Pokemon;
import compf.core.engine.pokemon.effects.EffectParam;
import compf.core.engine.pokemon.effects.PokemonBattleEffect;
import compf.core.engine.pokemon.moves.DamageInformation;

public class SubstituteEffect extends PokemonBattleEffect {
    public SubstituteEffect(Pokemon pkmn) {
        super(pkmn);
    }

    private int _cap = 45;

    @Override
    public void init() {
        if (getPokemon().getCurrHP() > 45) {
            getPokemon().modifyCurrHp(0.75);
        } else {
            disable();
            ;
        }

    }

    @Override
    public void defend(EffectParam param) {
        DamageInformation inf = param.damageInf();
        if (inf.getDamage() <= _cap && _cap > 0) {
            _cap -= inf.getDamage();
            inf.modifyDamage(0);
            addMessage("Substitute works");
        } else {
            disable();
        }
    }
}