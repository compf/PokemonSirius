package compf.core.engine;

import java.nio.ByteBuffer;
public interface ISerializable {
	 ByteBuffer toBytes();
	int getSize();
}
