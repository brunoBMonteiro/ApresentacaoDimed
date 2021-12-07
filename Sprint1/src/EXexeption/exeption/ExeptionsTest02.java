package EXexeption.exeption;

import java.io.File;
import java.io.IOException;

public class ExeptionsTest02 {
    private static void criarNovoArquivo() throws IOException{

        File file = new File("src/apresentacao/pilares/arquivo/teste.txt");

         //cheked java te força
        //file.createNewFile()

        // tem os pros e contras em colocar o trt cash dentro da função
        // ele não vai parar de funcionar

        //contra
        // não comsegue fazer o seu propio tratamento




            System.out.println("Criando Arquivo");
            //                       lança a exeção para a chamada do metodo
        boolean isCreated = false;
        try {
            isCreated = file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();

            // relançando o catch
            // porque fazer isso é que caso tenha uma função de pagamento
            // não vai recriala apenas tratala novamente com o thow e
            throw e;
            // caso a pessoa precise tratar uma exeption dentro do catch
           // throw new RuntimeException("Outra Mensagem");
        }

        System.out.println("Arquivo criado "+ isCreated);

            // nunca colocar regra de negocio

    }

                                         // não é usado
    public static void main(String[] args)  throws IOException{
        criarNovoArquivo();

    }


}
