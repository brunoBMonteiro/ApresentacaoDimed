package threads.multthread.dominio;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Members {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private boolean open = true;

    public boolean isOpen() {
        return open;
    }

    public int pendinEmails() {
        synchronized (emails) {
            return emails.size();
        }
    }

    public void addMenbersEmail(String email) {
        synchronized (this.emails) {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + "Adicionou Email na lista ");
            this.emails.add(email);
            //
            this.emails.notifyAll();
        }
    }

    //9 10 min
    public String retriveEmails() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + "Checando se esta tendo emails ");
        synchronized (this.emails) {
            while (this.emails.size() == 0) {
                if (!open) {
                    return null;
                }
                System.out.println(Thread.currentThread().getName() + "Não tem emails disponivel na lista, entrando em modo Stand By ");

                // tratar a exeption
                // wait for notify
                this.emails.wait();
            }
            return this.emails.poll();
        }
    }

    public void close() {
        open = false;
        synchronized (this.emails) {
            System.out.println(Thread.currentThread().getName() + " Não esta mais Recebendo emails ");
        }
    }
}




