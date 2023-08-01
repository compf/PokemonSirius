package compf.core.engine.pokemon.effects;

import compf.core.engine.Player;
import compf.core.engine.PokemonBattle;
import compf.core.engine.TeamRelationChecker;
import compf.core.engine.pokemon.Pokemon;
import compf.core.engine.pokemon.moves.Move;

public abstract class GlobalBattleEffect extends BattleEffect {

    private Player seenFromPlayer;
    private int seenFromPosition;
    private Move.TargetType targetType;
    private Pokemon currPokemon;

    protected Pokemon getCurrPokemon() {
        return currPokemon;
    }

    public void setCurrPokemon(Pokemon pkmn){
        currPokemon=pkmn;
    }

    public Player getSeenFromPlayer() {
        return seenFromPlayer;
    }

    public int getSeenFromPosition() {
        return seenFromPosition;
    }

    public Move.TargetType getTargetType() {
        return targetType;
    }

    public GlobalBattleEffect(Move.TargetType type, Player player, int pokemonPos) {
        seenFromPosition=pokemonPos;
        seenFromPlayer=player;
        targetType=type;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null)return false;
        if(!super.equals(obj))return false;
        var converted=(GlobalBattleEffect)obj;
        return targetType==converted.targetType&& (TeamRelationChecker.isTargetApplicable(targetType,seenFromPlayer,seenFromPosition,converted.getCurrPokemon()))!= TeamRelationChecker.TeamRelationResult.None;

    }
}
