package exeption.personalizada;

public class LoginInvalidoExeption extends Exception{

    public LoginInvalidoExeption() {
        // caso a pessoa não passe nada
        super("Login Invalido");
    }

    // caso a pessoa queira personalizar a mensagem
    public LoginInvalidoExeption(String message) {
        super(message);
    }
}
