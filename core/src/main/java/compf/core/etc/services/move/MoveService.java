package compf.core.etc.services.move;

import compf.core.engine.pokemon.moves.Move;
import compf.core.etc.services.GeneralService;

public interface MoveService extends GeneralService<Move> {
  String getRealName(String id);
}
