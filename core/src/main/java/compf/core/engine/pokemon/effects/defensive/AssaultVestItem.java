package compf.core.engine.pokemon.effects.defensive;

import compf.core.engine.pokemon.Pokemon;
import compf.core.engine.pokemon.PokemonStat;
import compf.core.engine.pokemon.effects.EffectParam;
import compf.core.engine.pokemon.effects.ItemEffect;
import compf.core.engine.pokemon.moves.Move;

public class AssaultVestItem  extends ItemEffect {
    public AssaultVestItem(Pokemon pkmn) {
        super(pkmn);
    }

    @Override
    public void initOrSwitchedIn(EffectParam param) {
        modifyStats(param,getPokemon(),getPokemon(), PokemonStat.SDEF,1);
    }

    @Override
    public void attack(EffectParam param) {
        var att=(EffectParam.AdditionalDirectDamageData)param.additionalData();
        if( isMeAttacking(param) && att.getScheduleItem().getMove().getKind()== Move.MoveKind.Status){
            param.additionalData().killFully();
        }
    }
}
