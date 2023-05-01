package compf.core.engine.pokemon.effects;

import compf.core.engine.pokemon.Pokemon;
import compf.core.engine.pokemon.moves.DamageInformation;
import compf.core.etc.services.SharedInformation;

public class ProtectionEffect extends PokemonBattleEffect {
    private int _perc = 256;

    public ProtectionEffect(Pokemon pkmn) {
        super(pkmn);
    }

    @Override
    public void defend(EffectParam param) {
        DamageInformation inf = param.damageInf();
        if (SharedInformation.Instance.getRNG().randomNumber(256,this.getClass()) < _perc) {
            inf.modifyDamage(0);
            disable();
            _perc /= 2;
            disable();
            addMessage("Protect prevents damage");

        }

    }
}
