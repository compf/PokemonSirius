package compf.core.networking;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class BaseServer {
	/**
	 * Read an object from the {@link ObjectInputStream} and converts into the
	 * type @link T
	 * 
	 * @param <T>
	 * @param in  The input stream
	 * @return The object or null on any error
	 */
	protected <T> T readObject(Pipe in) {
		// System.out.println("reading object "+in.getClass());
		T res = (T) in.read();
		// in.reset();
		return res;
	}

	/**
	 * Write an object to the {@link ObjectOutputStream}
	 * 
	 * @param <T> The type of the object
	 * @param out The {@link ObjectOutputStream}
	 * @param obj The object to be written
	 * @return A non-null object if successful, else a null value
	 */
	protected <T> boolean writeObject(Pipe out, T obj) {
		return out.write(obj);

	}

	private static ConcurrentHashMap<String, String> lastLogged = new ConcurrentHashMap<String, String>();

	public static void log(String prompt) {
		lastLogged.put(Thread.currentThread().getName(), prompt);
		System.out.println(prompt);
	}

	public static void printThreadLogs() {
		for (var entry : lastLogged.entrySet()) {
			System.out.println("Thread " + entry.getKey() + " " + entry.getValue());
		}
	}
}
