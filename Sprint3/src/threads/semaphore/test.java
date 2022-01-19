package threads.semaphore;

public class test {
    public static void main(String[] args) {
        WorkerTask run = new WorkerTask();
        Thread[] arrayThread = new Thread[10];
        for(int i = 0; i<10; i++) { // create 10 threads
            arrayThread[i] = new Thread(run);
            arrayThread[i].start();
        }


    }

}
