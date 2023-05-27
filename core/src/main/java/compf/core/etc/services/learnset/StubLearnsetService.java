package compf.core.etc.services.learnset;

import java.util.LinkedList;

public class StubLearnsetService  implements LearnsetService{

    @Override
    public Iterable<String> getMoves(String id) {
        return new LinkedList<>();
    }
    
}
