package compf.core.engine;

import compf.core.engine.pokemon.Pokemon;
import compf.core.engine.pokemon.moves.Move;
import compf.core.etc.MyObject;
import compf.core.etc.services.SharedInformation;

public class TeamRelationChecker {
    public static enum TeamRelationResult{
        None,One,Only
    }
    public static TeamRelationResult isTargetApplicable(Move.TargetType targetType,Player seenFromPlayer,int seenFromPos, Pokemon pkmn) {
        if(seenFromPlayer==null || targetType==null)return TeamRelationResult.One;
        Player otherPlayer=pkmn.getPlayer();
        int otherPokemonPos= MyObject.indexOf(otherPlayer.getTeam(),pkmn);
        boolean oneValid=false;
        boolean onlyValid=false;
        //TODO recheck every conditions it is only partial accurate
        // however only few moves are really that special
        switch (targetType){
            case All:
                oneValid=true;
                break;
            case AdjacentAlly:
                onlyValid= seenFromPlayer.isAlly(otherPlayer) && Math.abs(seenFromPos-otherPokemonPos)<=1 &&  (seenFromPlayer!=otherPlayer || seenFromPlayer==otherPlayer && otherPokemonPos!=seenFromPos); ;
                case AllySide:
                oneValid=seenFromPlayer.isAlly(otherPlayer);
                break;
            case AllAdjacent:
                oneValid= Math.abs(seenFromPos-otherPokemonPos)<=1 && seenFromPlayer!=otherPlayer; ;
                break;
            case Any:
                onlyValid=seenFromPlayer==otherPlayer && seenFromPos==otherPokemonPos;
                break;
            case Allies:
                oneValid= seenFromPlayer.isAlly(otherPlayer);;
                break;
            case AdjacentAllyOrSelf:
                onlyValid= seenFromPlayer.isAlly(otherPlayer) && Math.abs(seenFromPos-otherPokemonPos)<=1 ; ;;
                break;
            case FoeSide:
                oneValid= !seenFromPlayer.isAlly(otherPlayer);
                break;
            case Normal, Self:
                onlyValid=seenFromPlayer==otherPlayer && seenFromPos==otherPokemonPos;
                break;
            case Scripted:
                oneValid= true;
                break;
            case AllyTeam:
                oneValid= seenFromPlayer.isAlly(otherPlayer) && seenFromPlayer!=otherPlayer;
                break;
            case RandomNormal:
                onlyValid= SharedInformation.Instance.getRNG().checkPerc(50,PokemonBattle.class);
                break;
            case AdjacentFoe:
                onlyValid= !seenFromPlayer.isAlly(otherPlayer) && Math.abs(seenFromPos-otherPokemonPos)<=1 ; ;;
                break;
            case AllAdjacentFoes:
                oneValid= seenFromPlayer.isAlly(otherPlayer) && Math.abs(seenFromPos-otherPokemonPos)<=1 ; ;;
                break;
        }
        if(oneValid)return TeamRelationResult.One;
        else if(onlyValid)return  TeamRelationResult.Only;
        else return TeamRelationResult.None;

    }
}
