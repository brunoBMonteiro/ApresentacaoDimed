package estruturaDeDados.collections2.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {

    public static void main(String[] args) {


        List<Integer> numeros = new ArrayList<>();

        numeros.add(2);
        numeros.add(0);
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

        // valor de index
        System.out.println("Index");
        System.out.println( Collections.binarySearch(numeros,10));


        // se não achar ele retornara  -(ponto de inserção) -1
        // se não fosse -1, os dois retornariam 0 , assim não sabendo qual deles é o que não exite
        System.out.println( Collections.binarySearch(numeros,0));
        System.out.println( Collections.binarySearch(numeros,-1));

        // então ele coloca - até o valor de index que o valor deveria ficar
        // neste caso index 6, assim retornando -6 no index
        System.out.println( Collections.binarySearch(numeros,10));


        // por isso o sort, se não tivese ele não saberia onde inserrir, e assim não garante a comparação
    }
}
