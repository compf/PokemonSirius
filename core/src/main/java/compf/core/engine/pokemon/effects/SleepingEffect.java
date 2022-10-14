package compf.core.engine.pokemon.effects;

import compf.core.engine.pokemon.Pokemon;
import compf.core.engine.pokemon.moves.DamageInformation;
import compf.core.etc.MyObject;

public class SleepingEffect extends PokemonBattleEffect {
    int _rounds;

    public SleepingEffect(Pokemon pkmn) {
        super(pkmn);
        _rounds = MyObject.randomNumber(2, 6);

    }

    @Override
    public void attack(Object... obj) {
        if (_rounds > 0) {
            _rounds--;
            DamageInformation dmgInf = (DamageInformation) obj[0];
            addMessage(dmgInf.getAttacker() + " sleeps");
            dmgInf.kill();
        }

    }
}
