package compf.game;

import com.badlogic.gdx.graphics.Texture;

import compf.Main;
import compf.core.engine.SharedInformation;
import compf.core.engine.pokemon.Pokemon;
import compf.core.etc.MyObject;
import java.util.List;

public class PokemonZone extends RepeatableTexture {
    private List<PokemonZoneEntry> pokemonZoneEntries;
    private int probabilityEncounter;

    @Override
    public void onKeyPress(int keyCode, boolean newPress) {
        if (keyCode == Settings.KEY_UP || keyCode == Settings.KEY_DOWN || keyCode == Settings.KEY_LEFT
                || keyCode == Settings.KEY_RIGHT) {
            if (compf.Main.getPlayerFrame().doesCollide(this) && MyObject.checkPerc(probabilityEncounter)) {
                Pokemon encounter = getRandomPokemon();
                PokemonBattleScreen screen = new PokemonBattleScreen(0, 0, 1024, 1024, Main.getPlayer(), encounter);
                Main.switchFrame(screen);
            }
        }

        super.onKeyPress(keyCode, newPress);
    }

    public PokemonZone(int x, int y, int width, int height, String textureId, List<PokemonZoneEntry> pkmnZoneEntries,
            int probEncounter) {
        super(x, y, width, height, textureId);
        pkmnZoneEntries.sort(null);
        pokemonZoneEntries = pkmnZoneEntries;
        this.probabilityEncounter = probEncounter;
    }

    public Pokemon getRandomPokemon() {
        int randVal = MyObject.randomNumber(0, 100);
        int sum = 0;
        for (var zone : pokemonZoneEntries) {
            sum += zone.Weight;
            if (sum > randVal)
                return zone.createPokemon();
        }
        return pokemonZoneEntries.get(0).createPokemon();
    }

    public static class PokemonZoneEntry implements Comparable<PokemonZoneEntry> {
        public final int Weight;
        public final int MinLevel, MaxLevel;
        public final int PokedexNumber;

        public PokemonZoneEntry(int weight, int minLevel, int maxLevel, int pokedexNumber) {
            Weight = weight;
            MinLevel = minLevel;
            MaxLevel = maxLevel;
            PokedexNumber = pokedexNumber;
        }

        @Override
        public int compareTo(PokemonZoneEntry pokemonZoneEntry) {
            return Integer.compare(Weight, pokemonZoneEntry.Weight);
        }

        public Pokemon createPokemon() {
            int level = MyObject.randomNumber(MinLevel, MaxLevel + 1);
            return new Pokemon(PokedexNumber, level);
        }
    }
}
