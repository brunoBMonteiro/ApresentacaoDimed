package threads.semaphore;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class WorkerTask implements Runnable {

    private final List<SharedResource> mResourcePool;
    private final Semaphore mSemaphore;

    WorkerTask() {
        this.mResourcePool = new ArrayList<>(5);
        populate();
        mSemaphore = new Semaphore(5); // 3 permits, 1 for each res.
    }

    // value of i will differentiate between the 3 shared objects.
    private void populate() {
        for (int i = 0; i < 5; i++) {
            mResourcePool.add(new SharedResource("" + i));
        }
    }

    private SharedResource obtain() {
        synchronized (this) {
            return mResourcePool.remove(0);
        }
    }

    private void recycle(SharedResource obj) {
        synchronized (this) {
            mResourcePool.add(obj);
        }
    }

    @Override
    public void run() {

        String name = Thread.currentThread().getName();
        try {
            mSemaphore.acquire();
            SharedResource res = obtain();
            System.out.println();
            System.out.println("Acquired by: " + name + " at state value: " + res.getState() + "--Object[" + res.ID() + "]");
            res.setState(res.getState() + 1);
            Thread.sleep(500);
            recycle(res);
            System.out.println("Releasing by: " + name + " at state value: " + res.getState() + "--Object[" + res.ID() + "]");
            mSemaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}