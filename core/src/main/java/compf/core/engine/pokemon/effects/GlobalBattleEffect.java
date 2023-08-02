package compf.core.engine.pokemon.effects;

import compf.core.engine.Player;
import compf.core.engine.TeamRelationChecker;
import compf.core.engine.pokemon.Pokemon;
import compf.core.engine.pokemon.moves.Move;

public abstract class GlobalBattleEffect extends BattleEffect {

    private Player attackerPlayer;
    private int attackerPos;
    private Move.TargetType targetType;
    private Pokemon currPokemon;

    protected Pokemon getCurrPokemon() {
        return currPokemon;
    }

    public void setCurrPokemon(Pokemon pkmn){
        currPokemon=pkmn;
    }

    public Player getAttackerPlayer() {
        return attackerPlayer;
    }

    public int getAttackerPos() {
        return attackerPos;
    }

    public Move.TargetType getTargetType() {
        return targetType;
    }

    public GlobalBattleEffect(Move.TargetType type, Player player, int pokemonPos) {
        attackerPos =pokemonPos;
        attackerPlayer =player;
        targetType=type;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null)return false;
        if(!super.equals(obj))return false;
        var converted=(GlobalBattleEffect)obj;
        return targetType==converted.targetType&& (TeamRelationChecker.isTargetApplicable(targetType, attackerPlayer, attackerPos,converted.getCurrPokemon()))!= TeamRelationChecker.TeamRelationResult.None;

    }
}
