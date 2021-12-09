package classUltilitaria.strings;

public class StringTest01 {
    public static void main(String[] args) {

        //Heap


        // String Imutavel
        String nome = "Tom"; // String contant pool
        String nome2 = "Tom"; // String contant pool

        // String Immutavel
     nome.concat("Fich");

     // ele não muda
        System.out.println(nome);

        System.out.println( nome == nome2);

        // fazendo isso aponta pra outra referencia do poll de strings  pois é immutabel e assim ele cria outro
        nome = nome.concat("Fich");

        System.out.println(nome);

        System.out.println( nome == nome2);


    }
}
