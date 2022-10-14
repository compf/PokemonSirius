package compf.game;

import java.util.concurrent.Semaphore;

public class UpperLimitedSemaphore {
    private Semaphore semaphore;
    private final int upperLimit;

    public UpperLimitedSemaphore(int upperLimit) {
        semaphore = new Semaphore((upperLimit));
        this.upperLimit = upperLimit;
    }

    public void release() {
        if (semaphore.availablePermits() < upperLimit) {
            semaphore.release();
        }
    }

    public void acquire() throws InterruptedException {
        semaphore.acquire();
    }

}
