package compf.core.etc.services;

import java.util.LinkedList;

public class StubLearnsetService  implements LearnsetService{

    @Override
    public Iterable<String> getMoves(String id) {
        return new LinkedList<>();
    }
    
}
