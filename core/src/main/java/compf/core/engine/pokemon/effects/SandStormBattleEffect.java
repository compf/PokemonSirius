package compf.core.engine.pokemon.effects;

import compf.core.engine.PokemonBattle;
import compf.core.engine.pokemon.Pokemon;
import compf.core.engine.pokemon.Type;
import compf.core.engine.pokemon.moves.DamageInformation;

public class SandStormBattleEffect extends GlobalBattleEffect {
    public SandStormBattleEffect(PokemonBattle battle) {
        super(battle);
    }

    @Override
    public void roundEnding(Object... obj) {
        var inf = (DamageInformation) obj[0];
        for (Pokemon pkmn : getBattle()) {
            if (!(pkmn.isType(Type.Ground) || pkmn.isType(Type.Rock) || pkmn.isType(Type.Steel))) {
                pkmn.modifyCurrHp(0.875);
                addMessage(pkmn.toString() + " was damaged by sandstorm");
            }
        }

    }
}
