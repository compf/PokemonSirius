package compf.core.engine.pokemon.effects;

import compf.core.engine.pokemon.Pokemon;
import compf.core.engine.pokemon.moves.DamageInformation;
import compf.core.etc.MyObject;

public class ProtectionEffect extends PokemonBattleEffect {
    private int _perc=256;
    public ProtectionEffect(Pokemon pkmn) {
        super(pkmn);
    }

    @Override
    public void defend(Object... obj) {
        DamageInformation inf=(DamageInformation)obj[0];
        if(MyObject.RNG.nextInt(256)<_perc){
            inf.modifyDamage(0);
            disable();
            _perc/=2;
            disable();
            addMessage("Protect prevents damage");

      }

    }
}
