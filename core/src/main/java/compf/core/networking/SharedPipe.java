package compf.core.networking;

import java.io.*;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class SharedPipe implements Pipe {
    private final int port;
    private BlockingQueue<Object> waitingList = new LinkedBlockingQueue<>();
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
        System.out.println("Wait for connection " + System.identityHashCode(waitingList));
        while (!isConnecting)
            Thread.onSpinWait();
        System.out.println("Confirm connection " + System.identityHashCode(waitingList));

        isConnecting = false;
        return this;
    }

    @Override
    public Pipe connect() {
        isConnecting = true;
        System.out.println("Connected " + System.identityHashCode(waitingList));
        return this;
    }

    @Override
    public boolean write(Object obj) {
        System.out.println("Written " + port + " " + System.identityHashCode(waitingList));
        return waitingList.offer(obj);
    }

    private static HashMap<String, Integer> threadListening = new HashMap<>();

    @Override
    public boolean avaliable() {
        return !waitingList.isEmpty();
    }

    @Override
    public Object read() {
        try {
            synchronized (threadListening) {
                // System.out.println();
                // System.out.println(Thread.currentThread().getName());
                // threadListening.put(Thread.currentThread().getName(),System.identityHashCode(waitingList));

            }
            Object obj = waitingList.poll(1, TimeUnit.HOURS);
            synchronized (threadListening) {
                threadListening.put(Thread.currentThread().getName(), null);

            }
            // System.out.println("Read "+obj);
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
