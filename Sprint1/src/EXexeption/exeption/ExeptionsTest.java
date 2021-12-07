package EXexeption.exeption;

import java.io.File;
import java.io.IOException;

public class ExeptionsTest {
    private static void criarNovoArquivo(){

        File file = new File("src/apresentacao/pilares/arquivo/teste.txt");

         //lançam erros em tempo de compilação
         //file.createNewFile()

        try {
            System.out.println("Criando Arquivo");
            boolean isCreated = file.createNewFile();
            System.out.println("Arquivo criado "+ isCreated);

                                      // geral
        } catch (IOException e  /* ou  Exeption*/  )  {
            //Sempre Mostrar
            e.printStackTrace();
        }



        // tem os pros e contras em colocar o try cath dentro da função
        // ele não vai parar de funcionar

        //contra
        // não comsegue fazer o seu propio tratamento

        // so quando o metodo é privado se coloca trycaht dentro do metodo

    }


    public static void main(String[] args) {
        criarNovoArquivo();
    }


}
