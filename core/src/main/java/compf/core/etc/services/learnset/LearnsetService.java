package compf.core.etc.services.learnset;

import compf.core.engine.pokemon.moves.Move;

import java.io.IOException;

public interface LearnsetService {
    Iterable<String> getMoveNames(String id);
    public void init()  throws IOException;
}
