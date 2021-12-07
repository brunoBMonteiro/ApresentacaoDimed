package EXexeption;

import java.io.*;

public class TryRecursos {

    public static void main(String[] args) {

    }

    public static void lerarquivo02() throws IOException{
       // so se pode colocar objetos TryResousers se elas implementarem a interface Closoble ou autoClosoble
        // por causa do poliforfismo e sabe que as classes que podem implementar tem a função close

          try(Reader reader = new BufferedReader(new FileReader("teste"));){


          // deste modo não precisa de catch
         }/*catch (IOException e){

          };*/



    }




    public static void lerArquivo(){
        // classe para leitura de arquivo
        Reader reader =null;
        try {
            reader = new BufferedReader(new FileReader("teste"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
    }

}
