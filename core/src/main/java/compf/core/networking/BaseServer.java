package compf.core.networking;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

import compf.core.engine.NetworkMessage;
import compf.core.etc.services.SharedInformation;

public class BaseServer {
	/**
	 * Read an object from the {@link ObjectInputStream} and converts into a network message
	 *
	 * @param in  The input stream
	 * @return The object or null on any error
	 */
	protected NetworkMessage readObject(Pipe in) {
		var res= in.read();
		// in.reset();
		return res;
	}

	/**
	 * Write an object to the {@link ObjectOutputStream}
	 * 
	 * @param out The {@link ObjectOutputStream}
	 * @param msg object to be written
	 * @return A non-null object if successful, else a null value
	 */
	protected <T> boolean writeObject(Pipe out, NetworkMessage msg) {
		return out.write(msg);

	}

	private static ConcurrentHashMap<String, String> lastLogged = new ConcurrentHashMap<String, String>();

	public static void log(String prompt) {
		lastLogged.put(Thread.currentThread().getName(), prompt);
		SharedInformation.Instance.getLoggerService().log(prompt,BaseServer.lastLogged);
	}


}
