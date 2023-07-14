package compf.core.engine;

import java.io.Serial;
import java.io.Serializable;
import java.util.HashSet;

import compf.core.engine.pokemon.Pokemon;
import compf.core.engine.pokemon.moves.Move;
import compf.core.etc.MyObject;
import compf.core.etc.PokemonConstants;

public class Player extends MyObject implements Serializable {
    /**
     *
     */
    @Serial
    private static final long serialVersionUID = 1L;
    protected Pokemon[] _team = new Pokemon[6];
    protected String _name;
    private HashSet<Player> _allies = new HashSet<>();
    private final short _id;

    public Player(short id) {
        _id = id;
    }

    public int getPokemonCount() {
        for(int i=0;i< PokemonConstants.DEFAULT_TEAM_SIZE;i++){
            if(_team[i]==null)return i;
        }
        return PokemonConstants.DEFAULT_TEAM_SIZE;
    }

    public void addAlly(Player pl) {
        if (pl == this)
            return;
        _allies.add(pl);
        pl.addAlly(this);
    }

    public boolean isAlly(Player pl) {
        return pl == this || _allies.contains(pl);
    }

    // TODO AI for target selection
    public short chooseTarget(Object battle, boolean isEnemy, byte pkmnId, Move mv) {
        return 0;
    }


    public Pokemon getCurrPokemon() {
        return _team[0];
    }

    public Pokemon[] getTeam() {
        return _team;
    }

    public String getName() {
        return _name;
    }

    /**
     * test
     * 
     * @param id
     * @param name
     * @param team
     */
    public Player(short id, String name, Pokemon[] team) {
        _id = id;
        _name = name;
        _team = team;
        for (var p : team) {
            if (p == null)
                break;
            p.setPlayer(this);
        }

    }


    public Pokemon getPokemon(int nr) {
        if (nr >= _team.length)
            return null;
        return _team[nr];
    }

    public Move chooseMove(int nr) {
        return null;
    }

    public short getPlayerId() {
        // TODO Auto-generated method stub
        return _id;
    }

}