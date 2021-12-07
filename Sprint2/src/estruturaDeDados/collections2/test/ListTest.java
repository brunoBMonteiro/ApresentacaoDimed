package estruturaDeDados.collections2.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {

// dinamicamente icrementado

        // força em tempo de compilação   // foi retirado a partir da verção 7
        List<String> nomes = new ArrayList<>(100);
       nomes.add("Tom");
        nomes.add("Joao");
        // misturar até a versção 1.4


        //nomes.add(22);


        for (Object nome: nomes) {
            System.out.println(nome);
        }


        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }



// não se pode declarar tipo primitivos pois chama internamente o equals e o hashcode



    }
}
