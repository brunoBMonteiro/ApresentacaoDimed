package threads.sincronismo.dominio;

public class Conta {
    private int balance = 50;

    // sacar
    public void withdraw(int amount) {
        this.balance = this.balance - amount;
    }

    // saldo atual
    public int getBalance() {
        return balance;
    }


}
