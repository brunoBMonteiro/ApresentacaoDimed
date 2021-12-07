package EXexeption.personalizada;

import java.util.Scanner;

public class LoginInvalidoTest01 {
    public static void main(String[] args) {

        try {
            logar();
        } catch (LoginInvalidoExeption e) {
            e.printStackTrace();
        }
    }

private static void logar() throws LoginInvalidoExeption{
    Scanner entrada = new Scanner(System.in);
String usernameDb="";
String senhaDb="";

    System.out.println("Usuario");
    String digitadoUsernameDb = entrada.nextLine();

    System.out.println("Senha");
    String digitadosenhaDb = entrada.nextLine();

    if (!usernameDb.equals(digitadoUsernameDb) || !senhaDb.equals(digitadosenhaDb)){


           throw new LoginInvalidoExeption("Usuario ou senha invalido");


    }else{
        System.out.println("Logado com exito");
    }
}
}

