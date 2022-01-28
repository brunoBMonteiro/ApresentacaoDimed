package threads.concorrencia.atomicint;

import java.util.concurrent.atomic.AtomicInteger;
// concorrencia é  adiciona uma camada de abistração de threads
//


class Counter {
    private int count;

    private final AtomicInteger atomicInteger = new AtomicInteger();

    void imcremetn() {
        count++;
        atomicInteger.incrementAndGet();
    }

    public synchronized int getCount() {
        return count;
    }

    public AtomicInteger getAtomicInteger() {
        return atomicInteger;
    }
}


public class AtomicIntegerTest01 {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Runnable r = () -> {
            for (int i = 0; i < 100; i++) {

                counter.imcremetn();

            }

        };
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(counter.getCount());
        System.out.println(counter.getAtomicInteger());


    }

}
