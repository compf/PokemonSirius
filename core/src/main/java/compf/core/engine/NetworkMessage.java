package compf.core.engine;

import java.io.Serial;
import java.io.Serializable;

public class NetworkMessage implements Serializable {
	@Serial
    private static final long serialVersionUID = -7740477375901976240L;
	public final NetworkMessageKind Kind;
	public final Object Data;

	public NetworkMessage(NetworkMessageKind kind, Object data) {
		Kind = kind;
		Data = data;
	}

	@Override
	public String toString() {
		return Kind.toString();
	}
}