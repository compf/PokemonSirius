package compf.core.engine;

import java.io.Serializable;
import java.util.Optional;

public interface BattleState extends Serializable {
    /**
     * Get the current Hp of the pokemon, which is specified by the player id and
     * the index number of the pokemon in the player's team
     *
     * @param playerId  The id of the player
     * @param pkmnIndex The position of the pokemon in the player's team
     * @return The current hp or -1 if player id is unown
     * @throws IndexOutOfBoundsException if pokemon index is invalid
     */
    public int getCurrHp(int playerId, int pkmnIndex);

    /**
     * Get the max Hp of the pokemon, which is specified by the player id and the
     * index number of the pokemon in the player's team
     * <table>
     * </table>
     *
     * @param playerId  The id of the player
     * @param pkmnIndex The position of the pokemon in the player's team
     * @return The current hp or -1 if player id is unown
     * @throws IndexOutOfBoundsException if pokemon index is invalid
     */
    public int getMaxHP(int playerId, int pkmnIndex);

    /**
     * Get the name of the pokemon
     *
     * @param playerId
     * @param pkmnIndex
     * @return Name of the pokemon or null if not found
     */
    public String getPokemonName(int playerId, int pkmnIndex);

    /**
     * Get a abbreviation of the state condition of the pokemon
     *
     * @param playerId
     * @param pkmnIndex
     * @return Abbreviation of state condition
     * @implNote not implemented yet
     */
    public String getStateConditionString(int playerId, int pkmnIndex);

    /**
     * Collects an iterator of all player ids of a given battle
     *
     * @return An iterator of Integer where each integer is a valid player id
     */
    public Iterable<Short> getPlayerIds();

    /**
     * Return the name of the player
     *
     * @param playerId Player id
     * @return Name of the player or null if not found
     */
    public String getPlayerName(int playerId);

    public Optional<Integer> getDefeatedPlayer();

    /**
     * returns the nr of a specific pokemon
     * @param playerId A valid player id
     * @param pokemonId A pokemon position id
     * @return the nr of the given Pokemon, -1 if not present
     */
    int getPokemonNr(short playerId,short pokemonId);

    default boolean isEnemy(short mePlayerId,short enemyPlayerId){
            return  mePlayerId!=enemyPlayerId;
    }
    /**
     * returns the nr of a specific pokemon
     * @param playerId A valid player id
     * @param pokemonId A pokemon position id
     * @return the level of the given Pokemon, -1 if not present
     */
    int getPokemonLevel(short playerId,short pokemonId);

}
