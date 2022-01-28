package threads.semaphore;


// Java Program to illustrate use Counting Semaphore
// in Concurrent Java Application

import java.util.concurrent.Semaphore;

public class SemaphoreTest {

    // Initialize the semaphore with the number
    // of permits required

    // Here only 1 permit is allowed
    Semaphore binary = new Semaphore(1);

    // Main driver method
    public static void main(String args[]) {

        final SemaphoreTest test = new SemaphoreTest();

        // Thread 1
        new Thread() {

            // Method that should be executed for thread1
            @Override
            public void run() {
                test.mutualExclusion();
            }
        }.start();

        // Thread 2
        new Thread() {

            // Method that should be executed for thread2
            @Override
            public void run() {
                test.mutualExclusion();
            }
        }.start();
    }

    // Method
    private void mutualExclusion() {

        // Try block to check for exceptions
        try {
            // acquire() acts as an input to semaphore
            // to check for available permits
            binary.acquire();

            // Mutual exclusive region

            System.out.println(
                    Thread.currentThread().getName()
                            + " inside mutual exclusive ");

            // sleep() method is used to hold thread for
            // sometime Parameter is nanoseconds to be
            // holded
            Thread.sleep(1000);
        }

        // Catch block to handle the exception

        // Handling exception if thread is interrupted
        // either before or during the activity
        catch (InterruptedException e) {

            // Print and display the line number where
            // exception occured
            e.printStackTrace();
        } finally {

            // release() method acts as output to semaphore
            // When thread operation is completed
            // release() method increase the permits
            // in the semaphore
            binary.release();

            // Printing the thread name
            // using the getName() method
            System.out.println(
                    Thread.currentThread().getName()
                            + " outside of mutual exclusive ");
        }
    }
}

