package threads.multthread.service;


import threads.multthread.dominio.Members;

public class EmailDeliveryEmail implements Runnable {
    private final Members members;

    public EmailDeliveryEmail(Members members) {
        this.members = members;
    }


    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + "Startantdo o envio de emails ");
        while (members.isOpen() || members.pendinEmails() > 0) {
            try {

                String emaail = members.retriveEmails();
                if (emaail == null) {
                    continue;
                }
                System.out.println(threadName + "Enviando email para " + emaail);
                Thread.sleep(2000);
                System.out.println(threadName + "Enviou email com sucesso para " + emaail);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }


    }
}
