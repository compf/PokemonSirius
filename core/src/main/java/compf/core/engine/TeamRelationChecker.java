package compf.core.engine;

import compf.core.engine.pokemon.Pokemon;
import compf.core.engine.pokemon.moves.Move;
import compf.core.etc.MyObject;
import compf.core.etc.services.SharedInformation;

public class TeamRelationChecker {
    public static enum TeamRelationResult {
        None, One, Only
    }

    public static TeamRelationResult isTargetApplicable(Move.TargetType targetType, Player attackerPlayer, int attackerPos, Pokemon otherPokemon) {
        if (attackerPlayer == null || otherPokemon == null || targetType == null) return TeamRelationResult.One;
        Player otherPlayer = otherPokemon.getPlayer();
        int otherPokemonPos = MyObject.indexOf(otherPlayer.getTeam(), otherPokemon);
        Pokemon attackerPokemon = attackerPlayer.getPokemon(attackerPos);
        boolean attackerOtherAlly = attackerPlayer.isAlly(otherPlayer);

        boolean oneValid = false;
        boolean onlyValid = false;
        //TODO recheck every conditions it is only partial accurate
        // however only few moves are really that special
        switch (targetType) {
            case All:
                oneValid = true;
                break;
            case AdjacentAlly:
                onlyValid = attackerOtherAlly && Math.abs(attackerPos - otherPokemonPos) <= 1;
                break;
            case AllySide:
                oneValid = attackerOtherAlly;
                break;
            case AllAdjacent:
                oneValid = Math.abs(attackerPos - otherPokemonPos) <= 1;
                ;
                break;
            case Any:
                onlyValid = true;
                break;
            case Allies:
                oneValid = otherPlayer.isAlly(attackerPlayer) && attackerPokemon != otherPokemon;
                ;
                break;
            case AdjacentAllyOrSelf:
                onlyValid = attackerPlayer.isAlly(otherPlayer) && Math.abs(attackerPos - otherPokemonPos) <= 1;
                ;
                ;
                break;
            case FoeSide:
                oneValid = !attackerPlayer.isAlly(otherPlayer);
                break;
            case Normal:
                onlyValid=!attackerPlayer.isAlly(otherPlayer);
                break;
            case Self:
                onlyValid = attackerPokemon==otherPokemon;
                break;
            case Scripted:
                oneValid = true;
                break;
            case AllyTeam:
                oneValid = attackerPlayer.isAlly(otherPlayer) && attackerPokemon!=otherPokemon;
                break;
            case RandomNormal:
                onlyValid = SharedInformation.Instance.getRNG().checkPerc(50, PokemonBattle.class);
                break;
            case AdjacentFoe:
                onlyValid = !attackerPlayer.isAlly(otherPlayer) && Math.abs(attackerPos - otherPokemonPos) <= 1;
                ;
                ;
                break;
            case AllAdjacentFoes:
                oneValid = !attackerPlayer.isAlly(otherPlayer) && Math.abs(attackerPos - otherPokemonPos) <= 1;
                ;
                ;
                break;
        }
        if (oneValid) return TeamRelationResult.One;
        else if (onlyValid) return TeamRelationResult.Only;
        else return TeamRelationResult.None;

    }
}
