package compf.core.testing;

import compf.core.engine.SharedInformation;
import compf.core.engine.pokemon.Pokemon;
import compf.core.etc.MyObject;

public class TestUtil {
    public static Pokemon createRandomPokemonSingleMove(){
        Pokemon pkmn = new Pokemon(SharedInformation.Instance
                .getPokedexEntry(1 + MyObject.RNG.nextInt(SharedInformation.PokemonCount - 1)));
        pkmn.setMove(0,1);
        for(int i=1;i<4;i++){
            pkmn.setMove(i,0);
        }
        return pkmn;

    }
    public static  Pokemon[] getSingleMoveRandomTeam(){
        Pokemon[] team=new Pokemon[6];
        for(int i=0;i<SharedInformation.TeamSize;i++){
            team[i]=createRandomPokemonSingleMove();
        }
        return  team;
    }
}
