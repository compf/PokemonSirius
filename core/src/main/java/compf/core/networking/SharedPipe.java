package compf.core.networking;

import java.io.*;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

import compf.core.engine.NetworkMessage;
import compf.core.etc.services.SharedInformation;

public class SharedPipe implements Pipe {
    private final int port;
    private BlockingQueue<NetworkMessage> waitingList = new LinkedBlockingQueue<>();
    private static HashMap<Integer, SharedPipe> serverWritePipes = new HashMap<>();
    private static HashMap<Integer, SharedPipe> serverReadPipes = new HashMap<>();

    public static Pipe getOrCreatePipe(int port) {
        if (serverReadPipes.containsKey(port)) {
            SharedPipe serverRead = serverReadPipes.get(port);
            SharedPipe serverWrite = serverWritePipes.get(port);

            serverRead.connect();
            return new PipeEndPoint(serverRead, serverWrite);
        } else {
            SharedPipe serverRead = new SharedPipe(port);
            serverReadPipes.put(port, serverRead);
            SharedPipe serverWrite = new SharedPipe(port);
            serverWritePipes.put(port, serverWrite);
            return new PipeEndPoint(serverWrite, serverRead);
        }
    }

    private volatile boolean isConnecting = false;

    @Override
    public Pipe waitForConnection() {
        SharedInformation.Instance.getLoggerService().log("Wait for connection " + System.identityHashCode(waitingList),SharedPipe.class);
        while (!isConnecting)
            Thread.onSpinWait();
        SharedInformation.Instance.getLoggerService().log("Confirm connection " + System.identityHashCode(waitingList),SharedPipe.class);

        isConnecting = false;
        return this;
    }

    @Override
    public Pipe connect() {
        isConnecting = true;
        SharedInformation.Instance.getLoggerService().log("Connected " + System.identityHashCode(waitingList),SharedPipe.class);
        return this;
    }

    @Override
    public boolean write(NetworkMessage obj) {
        SharedInformation.Instance.getLoggerService().log("Written " + port + " " + System.identityHashCode(waitingList),SharedPipe.class);
        return waitingList.offer(obj);
    }

    private static HashMap<String, Integer> threadListening = new HashMap<>();

    @Override
    public boolean avaliable() {
        return !waitingList.isEmpty();
    }

    @Override
    public NetworkMessage read() {
        try {

            NetworkMessage obj = waitingList.poll(1, TimeUnit.HOURS);
            synchronized (threadListening) {
                threadListening.put(Thread.currentThread().getName(), null);

            }
            return obj;
        } catch (InterruptedException e) {
            return null;
        }
    }

    private SharedPipe(int port) {
        this.port = port;
    }

    public static void resetPipes() {
        SharedPipe.serverReadPipes.clear();
        SharedPipe.serverWritePipes.clear();
    }
}
