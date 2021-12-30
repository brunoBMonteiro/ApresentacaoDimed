package AestruturaDeDados.collections2.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {

    public static void main(String[] args) {


        List<Integer> numeros = new ArrayList<>();

        numeros.add(0);

        numeros.add(2);
        numeros.add(4);
        numeros.add(3);
        numeros.add(6);


// binary
// ele fara a busca e retornaá o index de quem estamos procurando
// se não achar ele retornara  -(ponto de inserção) -1

        // é necessario que a lista seja ordenada, senão pode ser indefinido

        Collections.sort(numeros);
        for (Integer numero : numeros) {
            System.out.println(numero);
        }




        // se não achar ele retornara  -(ponto de inserção) -1
        System.out.println( "Não Saberia onde qual seria ");
        System.out.println( Collections.binarySearch(numeros,0));
                                                                 // -1
        System.out.println( Collections.binarySearch(numeros,-1));

        // 5 objetos
        System.out.println( Collections.binarySearch(numeros,10));



    }
}
