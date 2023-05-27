package compf.core.etc.services.learnset;

import compf.core.engine.pokemon.moves.Move;

import java.util.LinkedList;

public class StubLearnsetService  implements LearnsetService{

    @Override
    public Iterable<String> getMoveNames(String id) {
        return new LinkedList<>();
    }

    @Override
    public void init() {

    }

}
