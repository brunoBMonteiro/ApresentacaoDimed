package AestruturaDeDados.collections2.array.test;

import java.util.ArrayList;
import java.util.List;

public class aListTest {
    public static void main(String[] args) {

// dinamicamente incrementado
// não se pode declarar tipo primitivo, pois chama internamente o equals e o hashcode



        // com o generics agora é permitido restringir o tipo para adicionar os dados
        // Antes poderia misturar os tipos na lista
        List<String> nomes = new ArrayList<String>(100);
        List<String> nomes2 = new ArrayList<String>(50);
        nomes.add("Tom");
        nomes.add("Joao");
        nomes.add("Jack");
        //nomes.add(4);


        //pode remover por index
        nomes.remove(1);
        //ou por objeto
        nomes.remove("Tom");

        // Passar elementos de uma lista para outra
         nomes2.addAll(nomes);


        for (String nome: nomes) {
            nomes.remove(0);
            System.out.println(nome);
        }



        System.out.println("Nomes 2 -------------");
        for (String s : nomes2) {
            System.out.println(s);
        }


    }
}
