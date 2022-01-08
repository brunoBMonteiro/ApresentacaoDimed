package notapresetation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaCoversaoTest01 {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();


        numeros.add(1);

        numeros.add(5);

        numeros.add(3);

                                                  // Usa Reflection - usado zero pelo comsumo de recursos(desempenho)  + que o usar o numeros . leght

        Integer[] listToArray = numeros.toArray(new Integer[0]);
        System.out.println(Arrays.toString(listToArray));
        System.out.println("-------------");
        Integer[] numerpsArray = new Integer[3];

        numerpsArray[0] = 1;
        numerpsArray[1] = 2;
        numerpsArray[2] = 3;


                                            // cuidar quando usar o aslist
                                            // pois ele cria uma ligação com o array original
        List<Integer> arrayToList = Arrays.asList(numerpsArray);
        // subistitui nos 2
       arrayToList.set(1,20);

        // vai dar unsupported array
     //   arrayToList.add(50);
        System.out.println(Arrays.toString(numerpsArray));
        System.out.println(arrayToList);


        System.out.println("--------podemdo modificar-------");
                                                     // imutavell
        List<Integer> numerosList = new ArrayList<>(Arrays.asList(numerpsArray));
numerosList.add(3);
        System.out.println(numerosList);


    }
}
