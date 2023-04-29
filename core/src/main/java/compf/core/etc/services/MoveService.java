package compf.core.etc.services;

import compf.core.engine.pokemon.moves.Move;

public interface MoveService extends GeneralService<Move> {
  String getRealName(String id);
}
