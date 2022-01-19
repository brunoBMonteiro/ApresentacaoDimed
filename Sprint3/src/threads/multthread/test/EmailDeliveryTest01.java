package threads.multthread.test;

import threads.multthread.dominio.Members;
import threads.multthread.service.EmailDeliveryEmail;

import javax.swing.*;


public class EmailDeliveryTest01 {
    public static void main(String[] args) {
        Members members = new Members();
        Thread threadSendEmails1 = new Thread(new EmailDeliveryEmail(members), "threadSendEmails1 ");
        Thread threadSendEmails2 = new Thread(new EmailDeliveryEmail(members), "threadSendEmails2 ");
        threadSendEmails1.start();
        threadSendEmails2.start();

        while (true) {
            String email = JOptionPane.showInputDialog("Entre com seu Email ");
            if (email == null || email.isEmpty()) {
                members.close();
                break;
            }
            members.addMenbersEmail(email);
        }
    }

}
